import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s1,s2,islem,sonuc = 0;
        Scanner tara = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        s1 = tara.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        s2 = tara.nextInt();

        System.out.println("Yapacağınız işlemi seçiniz\n-----------------------------------");
        System.out.print("1-Toplama\n2-Cıkarma\n3-Çarpma\n4-Bölme\n-----------------------------------\n");
        islem = tara.nextInt();

        switch (islem){
            case 1:
                System.out.println("Toplama: " + (s1+s2));;
            break;

            case 2:
                System.out.println("Çıkarma: " + (s1-s2));
            break;

            case 3:
                System.out.println("Çarpma: " + (s1*s2));;
            break;

            case 4:
                System.out.println("Bölme: " + (s1/s2));;
            break;
        }

    }
}