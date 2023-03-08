import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,basamak,toplam = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Basmaklarının toplamını istediğiniz sayi: ");
        sayi = scan.nextInt();

        while (sayi != 0){
            basamak = sayi % 10;
            toplam = toplam + basamak;
            sayi = sayi / 10;
        }
        System.out.println("Toplam: " + toplam);
    }
}