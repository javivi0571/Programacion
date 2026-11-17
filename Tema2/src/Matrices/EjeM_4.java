package Matrices;

public class EjeM_4 {
    public static void imprimirMatrizInv(int[][] matriz){

        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
        }

    }

    static void main(String[] args) {
        int [][] miMatriz = {{4,6,7},{6,8,5},{0,1,3}};
        imprimirMatrizInv(miMatriz);
    }
}