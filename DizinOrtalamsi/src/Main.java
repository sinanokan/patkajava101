public class Main {
    public static void main(String[] args) {
        double number[] ={1.0,2.0,3.0,4.0,5.0,6.0};
        double sum = 0;
        for(int i = 0; i<number.length; i++){
            sum += number[i];
        }
        double avarage = sum/ number.length;
        System.out.println("Ortalama: " + avarage);
    }
}