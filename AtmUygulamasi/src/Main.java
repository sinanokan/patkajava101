import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;
        int hak = 3;
        int secim;
        int bakiye = 2000;
        int tutar;

        Scanner scan = new Scanner(System.in);

        while(hak>0){
            System.out.print("Kullanıcı Adınızı giriniz: ");
            userName = scan.nextLine();

            System.out.print("Parolanızı giriniz: ");
            password = scan.nextLine();

            if(userName.equals("patika") && password.equals("java123")){
                System.out.println("Giriş başarılı,Hoşgeldiniz!!!");
                do{
                    System.out.println("---------------------------------------------");
                    System.out.println("1-Para Çekme\n" +
                            "2-Para Yatırma\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    secim = scan.nextInt();

                    if(secim == 1){
                        System.out.print("Çekmek istediğniz tutarı giriniz: ");
                        tutar = scan.nextInt();
                        if(tutar>bakiye){
                            System.out.println("Bakiye yetersiz");
                        }else{
                            bakiye = bakiye - tutar;
                            System.out.println("Işleminiz başarıyla gerçekleşti");
                        }
                    }else if (secim == 2){
                        System.out.println("Yatırmak istediğiniz tutarı giriniz.");
                        tutar = scan.nextInt();
                        bakiye = bakiye +tutar;
                    } else if (secim == 3) {
                        System.out.println("Bakiyeniz: " + bakiye);
                    }

                }while(secim != 4);
                System.out.println("Uygulamadan çıkış yapıldı,Tekrar görüşmek üzere...");
                break;
            }else {
                hak--;
                System.out.println("Girdiğiniz kullanıcı adı veya parola yanlış.");
                if(hak == 0){
                    System.out.println("Hesabınız bloke oldu,Lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan hakkınız: " + hak);
                }
            }
        }
    }
}