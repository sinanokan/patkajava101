import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,toplam = 0,sayac = 0;
        double ort;

        Scanner tara = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        sayi = tara.nextInt();

        for(int i = 1; i<=sayi;i++){
            if(i%12 == 0){
                toplam += i;
                sayac++;
            }
        }
        ort = toplam/sayac;

        System.out.println("0'dan başlayarak girilen sayıya kadar 12'ye tam böünen sayıların ortalaması: " + ort);
    }
}