package Matrices;

public class EjeM_2 {
    public static int sumatorioMatriz(int[][] matriz){

        int sumatorio = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumatorio = sumatorio + matriz[i][j];
            }
        }

        return sumatorio;

    }

    static void main(String[] args) {
        int [][] miMatriz = {{4,6,7},{-7,8,5},{0,1,3}};
        System.out.println(sumatorioMatriz(miMatriz));
    }
}