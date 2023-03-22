import java.util.Random;
import java.util.Scanner;

public class MineSwepper {
    Scanner scan =new Scanner(System.in);
    int satir;
    int sutun;
    String[][] oyun;
    String[][] mayin;
    int satirNo;
    int sutunNo;
    int sayac = 0;
    int donguSayac = 0;
    boolean durum;


    MineSwepper(int satir,int sutun){
        this.satir = satir;
        this.sutun = sutun;
        this.oyun = new String[satir][sutun];
        this.mayin = new String[satir][sutun];
        fill(this.mayin);
    }
    void random(){
        Random rand = new Random();
        this.satirNo = rand.nextInt(this.satir);

        Random rand2 = new Random();
        this.sutunNo = rand2.nextInt(this.sutun);
    }
    String[][] fill (String[][] dizi){
        for(int i = 0; i<this.satir; i++){
            for(int j= 0; j<this.sutun; j++){
                dizi[i][j] = "-";
            }
        }
        return dizi;
    }
    boolean isFind(String[][] dizi,String value){
        if(dizi[this.satirNo][this.sutunNo] == "*"){
            return false;
        }
        return true;
    }
    void run(){
        for(int i = 0; i<this.satir; i++){
            for(int j = 0; j<this.sutun; j++){
                if(sayac<(this.satir*this.sutun)/4){
                    random();
                    sayac++;
                    if(isFind(this.oyun,"*")){
                        this.mayin[satirNo][sutunNo] = "*";
                        this.oyun[satirNo][sutunNo] = "*";
                    }else {
                        sayac--;
                    }
                }
            }
        }
        printMayin();
        fill(this.oyun);
        printOyun();
        kordinatGir();
    }
    void kordinatGir(){
        this.durum = true;
        while (durum) {
            int say = 0;
            this.donguSayac++;
            int satir = 0;
            int sutun = 0;
            boolean kontrol = true;
            while (kontrol) {
                System.out.print("Satır giriniz: ");
                satir = scan.nextInt();
                System.out.print("Sütun giriniz:");
                sutun = scan.nextInt();
                if ((satir < 0 || satir > (this.satir - 1)) || (sutun < 0 || sutun > (this.sutun - 1))) {
                    System.out.println("Girilen değerler hatalı!!! ");
                    kontrol = true;
                } else {
                    kontrol = false;
                }
            }
            System.out.println("------------------------");
            if(this.mayin[satir][sutun].equals("*")){
                System.out.println("Kaybettiniz.");
                printMayin();
                this.durum = false;
                break;
            }
            for (int i = -1; i<2; i++){
                for(int j = -1; j<2; j++){
                    if((satir+i>=0 && (satir+i)<=(this.satir-1)) && (sutun+j>=0 && (sutun+j)<(this.sutun-1))){
                        if(this.mayin[satir+i][sutun+j].equals("*")){
                            say++;
                            this.oyun[satir][sutun] = String.valueOf(say);
                        }else {
                            this.oyun[satir][sutun] = "0";
                        }
                    }
                }
            }
            if(this.donguSayac == (this.satir*this.sutun) - ((this.satir*this.sutun)/4)){
                System.out.println("Kazandınız:DDDDD");
                break;
            }
            printOyun();
        }
    }
    void printMayin(){
        for(int i = 0; i<this.satir; i++){
            for(int j = 0; j<this.sutun; j++){
                System.out.print(" " + this.mayin[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
    void printOyun(){
        for(int i = 0; i<this.satir; i++){
            for(int j = 0; j<this.sutun; j++){
                System.out.print(" " + this.oyun[i][j]);
            }
            System.out.println();
        }
    }

}
