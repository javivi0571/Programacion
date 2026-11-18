public class EjeM_12 {

    public static int[][] simetriaRara(int[][] matriz){

        int[][] matrizSimetrica = new int [matriz.length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matrizSimetrica [i][j] = matriz[j][i];
            }
        }
        return matrizSimetrica;
    }

    static void main(String[] args) {
        int[][] miMatriz = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrizSimetrica = simetriaRara(miMatriz);

        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {

                System.out.print(matrizSimetrica[i][j] + " ");
            }
            System.out.println();
        }
    }
}
