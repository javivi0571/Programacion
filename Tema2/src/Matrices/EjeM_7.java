package Matrices;

public class EjeM_7 {

    /**
     * Compara dos matrices para ver si son iguales
     * @param matriz1 Primera matriz
     * @param matriz2 Segunda matriz
     * @return true si las dos matrices son iguales
     */
    public static boolean comparadorMatriz(int[][] matriz1,int [][]matriz2) {

        boolean iguales = true;

        if(EjeM_8.mismasFilasColumnas(matriz1,matriz2)){

            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[i].length; j++) {

                    if (matriz1[i][j] != matriz2[i][j]) {
                        iguales = false;
                    }
                }
            }
        }
        else{
            iguales = false;
        }

        return iguales;
    }

    static void main(String[] args) {
        int [][] matriz1 = {{4,6,7,6},{-7,8,5},{0,1,3}};
        int [][] matriz2 = {{4,6,7},{-7,8,5},{0,1,3}};

        if(comparadorMatriz(matriz1 , matriz2)){
            System.out.println("Sí son iguales.");
        }
        else{
            System.out.println("No son iguales.");
        }
    }
}
