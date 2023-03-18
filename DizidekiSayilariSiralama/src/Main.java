import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Dizinin boyutu n : ");
        n = scan.nextInt();

        int[] dizi = new int[n];

        for(int i = 0; i<n; i++){
            System.out.print(i+1 + ". Elemanı : ");
            dizi[i] = scan.nextInt();
        }

        Arrays.sort(dizi);

        for(int sayi : dizi){
            System.out.print(sayi + " ");
        }


    }
}