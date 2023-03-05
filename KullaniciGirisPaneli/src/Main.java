import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password,newPassword;
        int secim;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = inp.nextLine();
        
        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Başarılı...");
        } else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Hatali şifre\nDeğiştirmek için 1 istemiyorsanız 0 giriniz.");
            secim = inp.nextInt();
            switch (secim){
                case 0:
                    System.out.println("İşlemizniz sonlandırıldı.");
                    break;
                case 1:
                    System.out.print("Yeni şifrenizi giriniz: ");
                    newPassword = inp.next();
                    if(newPassword.equals(password) || newPassword.equals("java123")){
                        System.out.println("Şifreniz oluşturulmadı tekrar deneyiniz.");
                    }else{
                        System.out.println("Şifreniz başarıyla oluşturuldu.");
                    }
                    break;
            }
        }else{
            System.out.println("Kullıcı adı ve şifre hatalı.");
        }
    }
}