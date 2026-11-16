package Matrices;

public class EjeM_3 {
    public static void leerMatriz(int[][] matriz){

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

    }

    static void main(String[] args) {
        int [][] mimatriz = {{4,6,7},{6,8,5},{0,1,3}};
        leerMatriz(mimatriz);
    }
}
