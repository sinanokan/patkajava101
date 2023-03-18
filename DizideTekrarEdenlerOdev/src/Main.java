import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] number = {10, 20, 20, 10, 10, 20, 5, 20};
        int sayac = 0;

        System.out.println("Dizi : " + Arrays.toString(number));

        for(int i = 0; i< number.length; i++){
            for(int j = 0; j< number.length; j++){
                if(number[i] == number[j]){
                    if(j < i){
                        break;
                    }
                    sayac++;
                }
            }
            if(sayac > 0){
                System.out.println(number[i] + " sayısı " + sayac + " tekrar edildi.");
                sayac = 0;
            }
        }

    }
}