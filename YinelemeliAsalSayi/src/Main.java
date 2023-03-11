import java.util.Scanner;

public class Main {
    static boolean asalMi(int sayi,int bolen){
        if(bolen == 1){
            return true;
        } else if (sayi % bolen == 0) {
            return false;
        }else {
            return asalMi(sayi,bolen-1);
        }
    }
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int girilen;

        System.out.print("Sayı giriniz: ");
        girilen = tara.nextInt();

        if(asalMi(girilen,girilen/2)){
            System.out.println(girilen + " girilen sayi Asaldir!");
        }else {
            System.out.println(girilen + " girilen sayı Asal Değildir!!!");
        }

    }
}