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
            if (matriz1[i].length != matriz2[i].length) {
                columnas = false;
            }
        }
        if(filas && columnas){
            mismas = true;
        }
        else{

            System.out.println("No tienen la misma cantidad de filas y/o columnas.");
        }

        return mismas;
    }

    public static int [][] sumaMatriz(int[][] matriz1,int [][]matriz2) {

        int [][] matrizResultado = new int [matriz1.length][matriz1[dondeColumnaMayor(matriz1)].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return matrizResultado;
    }

    public static int dondeColumnaMayor(int[][] matriz){

        int columnas = 0;
        int columnasAnterior = 0;
        int columnaMayor =0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                columnas++;
            }
            if (columnasAnterior < columnas){
                columnaMayor = i;
                columnasAnterior = columnas;
            }
            columnas = 0;
        }

        return columnaMayor;
    }

    static void main(String[] args) {
        int [][] matriz1 = {{4,6,7},{-7,8,5,5,4,4,8,5},{0,1,3}};
        int [][] matriz2 = {{8,4,1},{2,5,3,2,6,4,67,2},{-8,9,0}};
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
