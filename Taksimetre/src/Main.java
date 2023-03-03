import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gidilenKM;
        double perKM = 2.2,tutar;

        Scanner tara = new Scanner(System.in);
        System.out.print("Gidilen yolu Km cinsinden yazınız: ");
        gidilenKM = tara.nextInt();

        tutar = (gidilenKM<5) ? 20 : 10+(perKM*gidilenKM);

        System.out.println("Ödenecek Tutar: " + tutar);
    }
}