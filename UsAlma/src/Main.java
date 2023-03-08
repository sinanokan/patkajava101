import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taban,us,value = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Üssü alınacak sayi: ");
        taban = scan.nextInt();

        System.out.print("Üs olacak sayi: ");
        us = scan.nextInt();

        for(int i = 1; i<=us; i++){
            value *= taban;
        }
        System.out.println("Sonuc: " + value);
    }
}