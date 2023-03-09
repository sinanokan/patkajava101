import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s1,s2;
        int token,ebob=1,i=1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        s1 = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        s2 = scan.nextInt();

        if(s1>s2){
            token = s1;
            s1 = s2;
            s2 = token;
        }

        while(i<s1){
            if(s1%i == 0 && s2%i == 0){
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + (s1*s2)/ebob);
    }
}