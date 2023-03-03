import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0, tutar =0.0;
        int kilo;

        Scanner tara = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? : ");
        kilo = tara.nextInt();
        tutar += (armut*kilo);

        System.out.print("Elma Kaç Kilo? : ");
        kilo = tara.nextInt();
        tutar += (elma*kilo);

        System.out.print("Domates Kaç Kilo? : ");
        kilo = tara.nextInt();
        tutar += (domates*kilo);

        System.out.print("Muz Kaç Kilo? : ");
        kilo = tara.nextInt();
        tutar += (muz*kilo);

        System.out.print("Patlıcan Kaç Kilo? : ");
        kilo = tara.nextInt();
        tutar += (patlican*kilo);

        System.out.println("Toplam Tutar : " +tutar);

    }
}