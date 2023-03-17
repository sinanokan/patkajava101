public class Main {

    static  boolean varMi(int[] arr,int value){
        for(int i: arr){
            if(i == value){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] sayi ={1,2,56,45,1,5,2,56};
        int[] tekrar = new int[sayi.length];
        int baslangicIndex = 0;

        for (int i = 0; i<sayi.length; i++){
            for(int j = 0; j< sayi.length; j++){
                if((i!=j) && (sayi[i] == sayi[j]) && (sayi[i]%2 == 0)){
                    if(varMi(tekrar,sayi[i])){
                        tekrar [baslangicIndex++] = sayi[i];
                    }
                    break;
                }
            }
        }
        for(int value : tekrar){
            if(value != 0){
                System.out.println(value);
            }
        }
    }
}