import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,ilk, kucuk, buyuk = 0;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = scan.nextInt();

        System.out.print("1. sayıyı giriniz: ");
        kucuk = scan.nextInt();
        ilk = kucuk;

        for(int i = 2; i<=n; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            int a = scan.nextInt();
            if(a<kucuk){
                kucuk = a;
            }
            if(a>buyuk){
                buyuk = a;
            }
        }
        if(ilk>buyuk){
            buyuk = ilk;
        }
        System.out.println("En büyük sayı: " + buyuk);
        System.out.println("En küçük sayı: " + kucuk);
    }
}