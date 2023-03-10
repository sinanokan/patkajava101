import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N;
        int num1 = 0;
        int num2 = 1;
        int sum;

        System.out.print("N sayısını giriniz: ");
        N = scan.nextInt();

        for(int i = 1; i<N; i++){
            sum = num1 + num2;

            System.out.println(num1 + " + " + num2 + " = " + sum);

            num1 = num2;
            num2 = sum;
        }


    }
}