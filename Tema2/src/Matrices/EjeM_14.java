package Matrices;

public class EjeM_14 {
    public static void conversorFilasColumnas(int[][] matriz) {

       // int[][] matrizInversa = new int[matriz[EjeM_8.dondeColumnaMayor(matriz)].length][matriz.length];
        int[][] matrizInversa;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matrizInversa = new int[matriz[i].length][matriz.length];
                matrizInversa[j][i] = matriz[i][j];
                System.out.print(matrizInversa[i][j]);
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        int[][] matriz = {{1,2},{3,4,5,6},{7}};

        conversorFilasColumnas(matriz);

    }
}
