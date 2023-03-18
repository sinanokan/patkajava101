public class Main {
    public static void main(String[] args) {
        int[][] matris ={{2,3,4},{5,6,4}};
        int[][] transpoze = new int[3][2];

        for(int i = 0; i<2; i++){
            for(int j = 0; j<3; j++){
                transpoze[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris: ");
        for(int[] satir : matris){
            for(int sutun : satir){
                System.out.print(sutun + " ");
            }
            System.out.println();
        }

        System.out.println("Transpoze: ");
        for(int[] sat : transpoze){
            for(int sut : sat){
                System.out.print(sut + " ");
            }
            System.out.println();
        }
    }
}