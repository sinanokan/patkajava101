import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int  mat,fizik,kimya,turkce,beden,dersSayi = 0,toplam = 0;
        double avarage;
        Scanner tara = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = tara.nextInt();
        if(mat <= 100 && mat >= 0){
           toplam +=mat;
           dersSayi++;
        }else
            System.out.println("Girdiğiniz değerin işleme alınabilmesi için 0 ile 100 arasında olmalı!");

        System.out.print("Fizik Notunuz: ");
        fizik = tara.nextInt();
        if(fizik <= 100 && fizik >= 0){
            toplam +=fizik;
            dersSayi++;
        }else
            System.out.println("Girdiğiniz değerin işleme alınabilmesi için 0 ile 100 arasında olmalı!");

        System.out.print("Kimya Notunuz: ");
        kimya = tara.nextInt();
        if(kimya <= 100 && kimya >= 0){
            toplam +=kimya;
            dersSayi++;
        }else
            System.out.println("Girdiğiniz değerin işleme alınabilmesi için 0 ile 100 arasında olmalı!");

        System.out.print("Türkce Notunuz: ");
        turkce = tara.nextInt();
        if(turkce <= 100 && turkce >= 0){
            toplam +=turkce;
            dersSayi++;
        }else
            System.out.println("Girdiğiniz değerin işleme alınabilmesi için 0 ile 100 arasında olmalı!");

        System.out.print("Beden Notunuz: ");
        beden = tara.nextInt();
        if(beden <= 100 && beden >= 0){
            toplam +=beden;
            dersSayi++;
        }else
            System.out.println("Girdiğiniz değerin işleme alınabilmesi için 0 ile 100 arasında olmalı!");

        if(dersSayi == 0)
            avarage = 0;
        else
            avarage = toplam /dersSayi;

        System.out.println("Orlamanız: " + avarage);

        if(avarage<=55){
            System.out.println("Kaldınız,seneye tekrar görüşürüz!");
        }else {
            System.out.println("Tebrikler geçtiniz.");
        }
    }
}