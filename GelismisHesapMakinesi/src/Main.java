import java.util.Scanner;

public class Main {

    static void Toplama(int x,int y){
        int sonuc = x + y;
        System.out.println("Toplam: " + sonuc);
    }
    static  void Cikarma(int x,int y){
        int sonuc = x - y;
        System.out.println("Cıkarma: " + sonuc);
    }
    static  void  Carpma(int x,int y){
        int sonuc = x * y;
        System.out.println("Carpma: " + sonuc);
    }
    static  void Bolme(int x,int y){
        if(y == 0){
            System.out.println("İkinci sayı 0'dan farklı olmalıdır.");
        }else {
            int sonuc = x / y;
            System.out.println("Bölme: " + sonuc);
        }
    }
    static void  UsAlma(int x,int y){
        int sonuc = 1;
        for(int i = 1; i<=y; i++){
            sonuc *= x;
        }
        System.out.println("Üs Hesaplama: " + sonuc);
    }
    static void  Fak(int x){
        int sonuc = 1;
        for(int i = 1; i<=x; i++){
            sonuc *= i;
        }
        System.out.println("Faktöriyel: " + sonuc);
    }
    static void mod(int x,int y){
        int sonuc = x % y;
        System.out.println("Mod: "+ sonuc);
    }
    static  void  Dikdortgen(int x,int y){
        int cevre = 2 * (x + y);
        int alan = x * y;
        System.out.println("Dikdörtgenin çevresi: " + cevre);
        System.out.println("Dikdörtgenin alanı: " + alan);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select,a,b=0;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);
        while(true){
            System.out.println("---------------------------------");
            System.out.print("Yapacağınız işlemi giriniz: ");
            select = scan.nextInt();
            if(select == 0)
                break;
            if(select != 6){
                System.out.print("Bir sayi giriniz: ");
                a = scan.nextInt();
                System.out.print("İkinci sayiyi giriniz: ");
                b = scan.nextInt();

            }else{
                System.out.print("Bir Sayi Giriniz: ");
                a = scan.nextInt();
            }
            switch (select){
                case 1:
                    Toplama(a,b);
                    break;
                case 2:
                    Cikarma(a,b);
                    break;
                case 3:
                    Carpma(a,b);
                    break;
                case 4:
                    Bolme(a,b);
                    break;
                case 5:
                    UsAlma(a,b);
                    break;
                case 6:
                    Fak(a);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    Dikdortgen(a,b);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir değer giriniz!!!");
            }
            System.out.println("Hesap Makinasından çıkış yapıldı....");
        }
    }
}