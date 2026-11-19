package Matrices;

public class EjeM_6 {
    static void main(String[] args) {
        int [][] mimatriz = {{4,6,7},{6,8,5},{0,1,3}};
        imprimirColumnasMatrizInv(mimatriz);
    }
    public static void imprimirColumnasMatrizInv(int[][] matriz){

        for (int j = matriz[0].length - 1; j >= 0; j--) {
            for (int i = matriz.length - 1; i >= 0; i--) {
                System.out.print(matriz[i][j] + " ");
            }
        }

    }
}
