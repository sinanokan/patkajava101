import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        for(int i = 1; i<=100; i++){
            int toplam = 0;
            for(int j = 1; j<=i; j++){
                if(i%j == 0){
                    toplam +=j;
                }
                if(toplam == i+1){
                    System.out.print(i + " ");
                }
            }
        }
    }
}