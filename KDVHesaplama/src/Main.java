import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double KDVsiz,KDVli,KDVtutar;

        Scanner tara = new Scanner(System.in);

        System.out.print("Ürünün fiyatını giriniz: ");
        KDVsiz = tara.nextInt();
        KDVli = (KDVsiz>1000) ? KDVsiz*1.08 : KDVsiz*1.18;
        KDVtutar = KDVli-KDVsiz;

        System.out.println("KDV'siz tutar: " + KDVsiz);
        System.out.println("KDV'li tutar: " + KDVli);
        System.out.println("KDV tutarı: " + KDVtutar);


    }
}