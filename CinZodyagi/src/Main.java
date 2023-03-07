import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int DogumYili,Zodyak;
        String burc = "";

        Scanner tara = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        DogumYili = tara.nextInt();

        Zodyak = DogumYili % 12;
        switch (Zodyak){
            case 0: burc = "Maymun";
                break;
            case 1: burc = "Horoz";
                break;
            case 2: burc = "Köpek";
                break;
            case 3: burc = "Domuz";
                break;
            case 4: burc = "Fare";
                break;
            case 5: burc = "Öküz";
                break;
            case 6: burc = "Kaplan";
                break;
            case 7: burc = "Tavsan";
                break;
            case 8: burc = "Ejderha";
                break;
            case 9: burc = "Yılan";
                break;
            case 10: burc = "At";
                break;
            case 11: burc = "Koyun";
                break;
        }
        if(Zodyak>=0){
            System.out.println("Çin Zodyagı burcunuz: " + burc);
        }else {
            System.out.println("Hata!!!!");
        }
    }
}