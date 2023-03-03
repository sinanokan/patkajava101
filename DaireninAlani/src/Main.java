import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r,alpha;
        double pi = 3.14,alan,cevre,dilimAlan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = inp.nextInt();

        System.out.print("Alpha açısını giriniz: ");
        alpha = inp.nextInt();

        alan = pi*r*r;
        cevre = 2.0*pi*r;
        dilimAlan = (pi*(r*r)*alpha)/360;

        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin cevresi: "+cevre);
        System.out.println("Alpha açılı dilimin alanı: "+dilimAlan);

    }
}