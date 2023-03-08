import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double sonuc = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("N değerini giriniz: ");
        n = scan.nextInt();

        for(int i = 1; i<=n; i++){
            sonuc = sonuc + (1.0/i);
        }
        System.out.println("Sonuc: " + sonuc);
    }
}