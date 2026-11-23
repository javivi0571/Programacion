package Matrices;

public class EjeM_Bermudito {

    static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}
        };

        int[][] matrizRes = casillasAdyacentesPares(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matrizRes[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] casillasAdyacentesPares(int[][] matriz) {

        int[][] matrizRes = new int[matriz.length][matriz[0].length];
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {

                        if (k == i && l == j){
                            continue;
                        }
                        if (k < 0 || l < 0 || k >= matriz.length || l >= matriz[k].length){
                            continue;
                        }

                        if (matriz[k][l] % 2 == 0) {
                            contador++;
                        }
                    }
                }
                matrizRes[i][j] = contador;
                contador = 0;

            }
        }
        return matrizRes;
    }
}