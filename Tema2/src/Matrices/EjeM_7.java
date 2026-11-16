package Matrices;

public class EjeM_7 {
    public static boolean comparadorMatriz(int[][] matriz1,int [][]matriz2) {

        boolean iguales = true;
        int elementos1 = 0;
        int elementos2 = 0;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {

                elementos1++;
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {

                elementos2++;
            }
        }

        if(elementos1 == elementos2){
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
            System.out.println("No tienen la misma cantidad de elementos");
        }



        return iguales;
    }

    static void main(String[] args) {
        int [][] matriz1 = {{4,6,7,4},{-7,8,5},{0,1,3}};
        int [][] matriz2 = {{4,6,7},{-7,8,5},{0,1,3}};

        if(comparadorMatriz(matriz1 , matriz2)){
            System.out.println("Sí son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
    }
}
