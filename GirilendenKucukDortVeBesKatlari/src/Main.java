import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,i,j;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        number = scan.nextInt();


        for(i=1,j=1; i<number || j<number;i*=4,j*=5 ){
            System.out.print(i+" ");
            if(j>number){
                System.out.println();
                continue;
            }
            System.out.println(j);
        }
    }
}