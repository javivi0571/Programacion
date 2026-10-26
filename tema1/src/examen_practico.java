import javax.swing.*;
import java.util.Scanner;

public class examen_practico {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a los entrenamientos del GP de Isla Cristina de F1");

        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();

        System.out.println("Número de vueltas");
        int numVueltas = Integer.parseInt(sc.nextLine());
        while (numVueltas < 3 || numVueltas > 10) {
            System.out.println("Introduce un número entre 3 y 10");
            numVueltas = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Tiempo objetivo");
        double temp = Double.parseDouble(sc.nextLine());
        while (temp < 1.0) {
            System.out.println("Introduce un número mayor que 0");
            temp = Double.parseDouble(sc.nextLine());
        }

        double tempV;
        double sumatorio = 0;
        double mt = Double.MAX_VALUE;
        int vmo = 0;

        for (int i = 1; i < numVueltas + 1; i++) {

            System.out.println("Introduce tu tiempo en la vuelta " + i);

            do{
                System.out.println("Recuerda que debe ser mayor que 0");

                tempV = Double.parseDouble(sc.nextLine());
            }while (tempV < 0 );


            if (temp < tempV) {
                System.out.println("Por encima del objetivo " + nombre);
            } else if (temp == tempV) {
                System.out.println("Objetivo igualado " + nombre);
            } else {
                System.out.println("Objetivo superado " + nombre);
            }
            System.out.println();

            sumatorio = sumatorio + tempV;

            if (mt > tempV){
                mt = tempV;
            }

            if (temp > tempV){
                vmo++;
            }


        }

        double tempMedio = sumatorio / numVueltas;


        System.out.println("-------------------------INFORME-------------------------");

        System.out.println("Piloto: " + nombre);
        System.out.println("Tiempo Total: " + sumatorio + " segundos");
        System.out.println("Tiempo medio por vuelta: " + tempMedio + " segundos");
        System.out.println("Mejor tiempo: " + mt + " segundos");
        System.out.println("Cantidad de vueltas que mejoraron estrictamente el tiempo objetivo: " + vmo);

        if ((tempMedio < temp) && (vmo >= (numVueltas/2.0))){
            System.out.println("Preparado para competir");
        }
        else{
            System.out.println("Necesita otra tanda de entrenamiento");
            System.out.println("Necesita mejorar el objetivo en al menos " + (numVueltas - vmo) + " de " + numVueltas + " vueltas.");
        }
    }
}
