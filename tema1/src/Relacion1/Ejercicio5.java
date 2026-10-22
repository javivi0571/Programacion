package Relacion1;

import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca 4 números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        double media = (num1 + num2 + num3 + num4) / 4.;

        System.out.println("la media es " + media);

        if (media < num1)
            System.out.println(num1 + " es mayor que la media");
        if (media < num2)
            System.out.println(num2 + " es mayor que la media");
        if (media < num3)
            System.out.println(num3 + " es mayor que la media");
        if (media < num4)
            System.out.println(num4 + " es mayor que la media");

    }
}

