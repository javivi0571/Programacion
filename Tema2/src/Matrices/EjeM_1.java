package Matrices;

public class EjeM_1 {
    public static boolean negativoEnMatriz(int[][] matriz){

        boolean negativo = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] < 0){
                    negativo = true;
                }
            }
        }

        return negativo;

    }

    static void main(String[] args) {
        int [][] miMatriz = {{4,6,7},{-7,8,5},{0,1,3}};
        if(negativoEnMatriz(miMatriz)){
            System.out.println("Si hay negativo");
        }
        else{
            System.out.println("No hay negativo");
        }
    }
}
