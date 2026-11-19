package Matrices;

import java.util.Scanner;

public class EjeM_15 {
    static Scanner sc = new Scanner(System.in);
    static void main(String[] args) {
        int[][] matriz = {{1,2,3,4},{5,6,7,8},{8,7,6,5},{4,3,2,1}};

        System.out.println(elementoCoordenadas(matriz));
    }

    public static int elementoCoordenadas(int[][] matriz){
        int f;
        int c;

        do{
            System.out.print("Introduce la fila:");
            f = sc.nextInt();
        }while (f < 0 || f >= matriz.length);

        do{
            System.out.print("Introduce columna:");
            c = sc.nextInt();
        }while (c < 0 || c > matriz[f].length);

        return matriz[f][c];
    }
}
