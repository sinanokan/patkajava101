import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int n;

        System.out.print("Basamak Sayısı: ");
        n = scan.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=(i-1); j++){
                System.out.print(" ");
            }
            for(int k =(2*(n-i)+1); k>=1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}