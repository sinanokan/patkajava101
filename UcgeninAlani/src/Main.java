import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c;
        double u,alan;

        Scanner tara = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz: ");
        a = tara.nextInt();

        System.out.print("2. Kenarı giriniz: ");
        b = tara.nextInt();

        System.out.print("3. Kenarı giriniz: ");
        c = tara.nextInt();

        u =(a+b+c)/2.0;

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı: " + alan);
        System.out.println("Üçgenin Çevresi: " + 2*u);
    }
}