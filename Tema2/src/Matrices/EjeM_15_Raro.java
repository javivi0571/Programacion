package Matrices;

import java.util.Scanner;

public class EjeM_15_Raro {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {

        System.out.println("Dime las dimensiones de la matriz");
        System.out.print("Filas:");
        int f = sc.nextInt();
        System.out.print("Columnas:");
        int c = sc.nextInt();

        int g;
        int v;

        System.out.println("Dime la posición");
        do{
            System.out.print("Introduce la fila:");
            g = sc.nextInt();
        }while (g < 0 || g >= f);

        do{
            System.out.print("Introduce la columna:");
            v = sc.nextInt();
        }while (v < 0 || v >= c);

        System.out.println(g * (c + 1) + v + 1);

    }
}
