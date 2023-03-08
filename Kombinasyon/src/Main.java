import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value1=1,value2=1,value3=1;
        int N,r,k,kombinasyon;

        Scanner scan = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        N = scan.nextInt();

        System.out.print("r sayısını giriniz: ");
        r = scan.nextInt();

        if(N>r) {
            for (int i = 1; i < N; i++) {
                value1 *= i;
            }
            for (int j = 1; j < r; j++) {
                value2 *= j;
            }
            k = N - r;
            for (int y = 1; y < k; y++) {
                value3 *= y;
            }
        }else{
            System.out.println("N r'den büyük olmalı!!");
        }
        kombinasyon = value1/(value2*value3);
        System.out.println("Kombinasyonu: " + kombinasyon);
    }
}