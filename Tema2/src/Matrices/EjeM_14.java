package Matrices;

public class EjeM_14 {
    public static int[][] conversorFilasColumnas(int[][] matriz) {

        int[][] matrizInversa = new int[matriz[0].length][matriz.length];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matrizInversa[j][i] = matriz[i][j];

            }
        }

        return matrizInversa;
    }

    static void main(String[] args) {
        int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,0,1,2}};

        int[][] matrizCambiada = conversorFilasColumnas(matriz);

        for (int[] fila : matrizCambiada) {
            for (int c : fila) {

                System.out.print(c + " ");

            }
            System.out.println();
        }
    }
}
