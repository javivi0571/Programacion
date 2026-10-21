//Realizar un programa que calcule las soluciones de una ecuación de
//segundo grado. Deben pedirse los tres coeficientes A, B, C e informar de si
//la ecuación tiene dos soluciones, una solución, o ninguna solución.
//A*x2+ B*x+C= 0

import java.util.Scanner;

public class ejercicio8_3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("dale un valor a A");
        double a = sc.nextDouble();

        System.out.println("dale un valor a B");
        double b = sc.nextDouble();

        System.out.println("dale un valor a C");
        double c = sc.nextDouble();


        double x1 = (-b+Math.pow((b*b-4*a*c),(0.5)))/(2*a);
        double x2 = (-b-Math.pow((b*b-4*a*c),(0.5)))/(2*a);

        if ((b*b-4*a*c)>0){
            System.out.println("tiene dos soluciones");
        }

        else if ((b*b-4*a*c)==0){
            System.out.println("tiene una solución");
        }

        else if ((b*b-4*a*c)<0){
            System.out.println("no tiene solución");
        }

        System.out.println("x1=" + x1 + " , " + "x2=" + x2);


    }
}
