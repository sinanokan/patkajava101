import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy,indeks;

        Scanner tara = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = tara.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = tara.nextInt();

        indeks = kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz: " + indeks);
    }
}