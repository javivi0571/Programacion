package Matrices;

import java.util.Scanner;

public class EjeM_15_Raro {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {

        System.out.println("Dime las dimensiones de la matriz");
        System.out.print("Filas:");
        int filas = sc.nextInt();
        System.out.print("Columnas:");
        int columnas = sc.nextInt();

        int coordFila;
        int coordColumna;

        System.out.println("Dime la posición");
        do{
            System.out.print("Introduce la fila:");
            coordFila = sc.nextInt();
        }while (coordFila < 0 || coordFila >= filas);

        do{
            System.out.print("Introduce la columna:");
            coordColumna = sc.nextInt();
        }while (coordColumna < 0 || coordColumna >= columnas);

        System.out.println(coordFila * (columnas + 1) + coordColumna + 1);
    }
}
