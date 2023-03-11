import java.util.Scanner;

public class Main {
    static void Azalan(int temp,int sayi){
        if(temp>0){
            System.out.print(temp + " ");
            temp -= 5;
            Azalan(temp,sayi);
        }else{
            Artan(temp,sayi);
        }
    }
    static void Artan(int temp,int sayi){
        if(temp<=sayi){
            System.out.print(temp + " ");
            temp += 5;
            Artan(temp,sayi);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;

        System.out.print("N sayisi: ");
        N = scan.nextInt();

        System.out.print("Çıktısı: ");

        Azalan(N,N);

    }
}