import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s1,s2,s3;
        Scanner tara = new Scanner(System.in);

        System.out.print("1. sayiyi giriniz: ");
        s1 = tara.nextInt();

        System.out.print("2. sayiyi giriniz: ");
        s2 = tara.nextInt();

        System.out.print("3. sayiyi giriniz: ");
        s3 = tara.nextInt();

        if((s1<s2) && (s1<s3)){
            if(s2<s3){
                System.out.println("s1<s2<s3");
            }else{
                System.out.println("s1<s3<s2");
            }
        } else if ((s2<s1) && (s2<s3)) {
            if(s1<s3){
                System.out.println("s2<s1<s3");
            }else {
                System.out.println("s2<s3<s1");
            }
        } else if ((s3<s1) && (s3<s2)) {
            if(s1<s2){
                System.out.println("s3<s1<s2");
            }else{
                System.out.println("s3<s2<s1");
            }
        }
    }
}