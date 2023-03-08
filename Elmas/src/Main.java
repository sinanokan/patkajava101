import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.print("N sayısını giriniz: ");
        n = scan.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a = 1; a<=(n-1); a++ ){
            for(int b = 1; b<=a; b++){
                System.out.print(" ");
            }
            for(int c =(2*(n-a)-1); c>=1; c--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}