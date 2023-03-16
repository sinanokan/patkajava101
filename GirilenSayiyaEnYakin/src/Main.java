import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] dizi = {15,12,788,1,-1,-778,2,0};
        int sayi;
        int min = dizi[0];
        int max = dizi[0];

        System.out.println("Dizi: " + Arrays.toString(dizi));
        System.out.print("Girilen Sayi: ");
        sayi = scan.nextInt();

        Arrays.sort(dizi);

        for(int i : dizi){
            if(sayi>i){
                min = i;
            }
            if(sayi<i){
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
    }
}