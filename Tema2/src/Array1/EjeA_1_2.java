package Array1;

import java.util.Scanner;

public class EjeA_1_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numElem;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int repMax = 0;
        int repMin = 0;
        double suma = 0.0;

        do{
            System.out.println("Introduce el número de elementos que tendrá:");
            numElem = sc.nextInt();
        }while (numElem < 0);

        int [] miArrayInt = new int[numElem];

        for (int i = 0; i < numElem; i++) {

            System.out.println("Introduce el valor del elemento " + (i + 1));

            miArrayInt[i] = sc.nextInt();

            if(miArrayInt[i] < min){

                min = miArrayInt[i];
            }

            if(miArrayInt[i] > max){

                max = miArrayInt[i];
            }

            suma = suma + miArrayInt[i];
        }

        for (int i = 0; i < miArrayInt.length; i++) {
            if(max == miArrayInt[i]){
                repMax += 1;
            }

            if(min == miArrayInt[i]){
                repMin += 1;
            }


        }



        System.out.printf("El mayor número introducido es: " + max + " (Se repite %d veces)",repMax);
        System.out.println();
        System.out.printf("El menor número introducido es: " + min + " (Se repite %d veces)",repMin);
        System.out.println();
        System.out.println("La media de los números introducidos es: " + (suma/numElem));
    }
}
