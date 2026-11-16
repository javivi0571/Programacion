package Matrices;

public class EjeM_5 {
    static void main(String[] args) {
        int [][] mimatriz = {{4,6,7},{6,8,5},{0,1,3}};
        imprimirColumnasMatriz(mimatriz);
    }
    public static void imprimirColumnasMatriz(int[][] matriz){

        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

    }
}
