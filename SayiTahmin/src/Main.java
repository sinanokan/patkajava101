import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int number = rand.nextInt(100);
        int right = 0;
        int select;
        int[] wrong = new int[5];
        boolean isWrong = false;
        boolean isWin = false;
        System.out.println(number);

        while (right<5){
            System.out.print("Lütfen tahmininizi giriniz: ");
            select = input.nextInt();
            if(select<0 || select>99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if(isWrong){
                    System.out.println("Çok fazla hatalı giriş yaptınız.Kalan hak: " + (5 - right));
                }else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı giriş yaptığınızda hakkınızdan düşülecek.");
                }
                continue;
            }
            if(select == number){
                System.out.println("Tebrikler tahmininiz doğru!!!");
                isWin = true;
                break;
            }else {

                if(select<number){
                    System.out.println("Girdiğiniz sayı gizli sayıdan küçüktür.");
                }else {
                    System.out.println("Girdiğiniz sayı gizli sayıdan büyüktür");
                }
                wrong[right++] = select;
                System.out.println("Kalan hakkınız: " + (5 - right));
            }

        }

        if(!isWin){
            System.out.println("Kaybettiniz!!");
            if(!isWrong){
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }
        }
    }
}