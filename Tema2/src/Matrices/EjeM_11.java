package Matrices;

public class EjeM_11 {

    public static boolean matrizInversa(int[][] unoMatriz,int [][] dosMatriz){

        boolean inversa = true;

        for (int i = 0; i < unoMatriz.length; i++) {
            for (int j = 0; j < unoMatriz[i].length; j++){

                if(unoMatriz[i][j] != dosMatriz[dosMatriz.length - 1 - i][dosMatriz[i].length - 1 - j]){

                    inversa = false;
                    break;
                }
            }
        }
                
        return inversa;
    }

    static void main(String[] args) {
        int[][] unoMatriz = {{1,2,3} , {4,5,6,7} , {8,9,0}};
        int[][] dosMatriz = {{0,9,8} , {7,6,7,4} , {3,2,1}};

        if(EjeM_8.mismasFilasColumnas(unoMatriz,dosMatriz)){
            System.out.println(matrizInversa(unoMatriz,dosMatriz));
        }
    }
   
}
