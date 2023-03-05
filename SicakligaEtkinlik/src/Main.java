import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;

        Scanner tara = new Scanner(System.in);
        System.out.print("Sicaklik giriniz: ");
        sicaklik = tara.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik<=25) {
            if(sicaklik<=15){
                System.out.println("Sinemaya gidebilirsin");
            }
            if(sicaklik>=10){
                System.out.println("Pikniğe gidebilirsiniz");
            }
        }else {
            System.out.println("Yüzmeye gidebilirisiniz");
        }
    }
}