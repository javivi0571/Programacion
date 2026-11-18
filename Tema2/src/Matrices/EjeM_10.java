package Matrices;

public class EjeM_10 {
    static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6},{4,5,6},{1,2,3}};
        System.out.println(matrizSimetrica(matriz));
    }

    public static boolean matrizSimetrica(int[][] matriz) {
        for (int[] unaFila : matriz) {
            for (int j = 0; j < unaFila.length / 2; j++) {
                if (unaFila[j] != unaFila[unaFila.length - 1 - j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
