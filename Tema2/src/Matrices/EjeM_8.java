package Matrices;

public class EjeM_8 {
    public static boolean mismasFilasColumnas(int[][] matriz1,int[][] matriz2){
        boolean filas = false;
        boolean columnas = true;
        boolean mismas = false;

        if(matriz1.length == matriz2.length){
            filas = true;
        }
        for (int i = 0; i < matriz1.length; i++) {
            if(matriz1[i].length != matriz2[i].length){
                columnas = false;
            }
        }
        if(filas && columnas){
            mismas = true;
        }
        else{

            System.out.println("No tienen la misma cantidad de filas y/o columnas, así que no los podré sumar.");
        }

        return mismas;
    }

    public static int [][] sumaMatriz(int[][] matriz1,int [][]matriz2) {

        int n = matriz1.length;
        int [][] matrizResultado = new int [n][matriz1[n-1].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return matrizResultado;
    }

    static void main(String[] args) {
        int [][] matriz1 = {{4,6,7},{-7,8,5},{0,1,3}};
        int [][] matriz2 = {{8,4,1},{2,5,3},{-8,9,0}};
        int [][] matrizRes;

        if(mismasFilasColumnas(matriz1,matriz2)) {

            matrizRes = sumaMatriz(matriz1,matriz2);

            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[i].length; j++) {

                    System.out.print(matrizRes[i][j] + " ");
                }
            }
        }
    }
}
