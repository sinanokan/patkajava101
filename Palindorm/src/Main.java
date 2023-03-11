import java.util.Scanner;

public class Main {

    static boolean Palindrom(int number){
        int temp = number,YeniSayi = 0,sonBasamak;
        while(temp != 0){
            sonBasamak = temp % 10;
            YeniSayi = (YeniSayi * 10) + sonBasamak;
            temp /= 10;
        }
        if (number == YeniSayi)
            return true;
        else
            return  false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;

        System.out.print("Lütfen bir sayi giriniz: ");
        sayi = scan.nextInt();

        if(Palindrom(sayi))
            System.out.println("Girdiğiniz sayi Palindrom.");
        else
            System.out.println("Girdiğiniz sayi Palindrom değildir.");

    }
}