import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;

        Scanner tara = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        yil = tara.nextInt();

        if(yil%4 == 0){
            if((yil%100 == 0) && !(yil%400 == 0))
                System.out.println(yil + " bir artik yil değildir!!!");
            else
                System.out.println(yil + " bir artik yildir");
        }else {
            System.out.println(yil + " bir artik yil değildir!!!");
        }
    }
}