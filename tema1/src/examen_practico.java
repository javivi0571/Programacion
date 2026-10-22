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
        while( numVueltas < 3 || numVueltas > 10){
            System.out.println("Introduce un número entre 3 y 10");
            numVueltas = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Tiempo objetivo");
        double temp = Double.parseDouble(sc.nextLine());
        while( temp < 1.0) {
            System.out.println("Introduce un número mayor que 0");
            temp = Double.parseDouble(sc.nextLine());
        }

        double tempV;
        double sumatorio = 0;
        double mt=0;

        for (int i = 1; i < numVueltas + 1 ; i++) {
            System.out.println("Introduce tu tiempo en la vuelta " + i);

            tempV = Double.parseDouble(sc.nextLine());

            if(temp<tempV){
                System.out.println("Por encima del objetivo " + nombre);
            }

            else if(temp==tempV){
                System.out.println("Objetivo igualado " + nombre);
            }

            else {
                System.out.println("Objetivo superado " + nombre );
            }
            System.out.println();

            sumatorio = sumatorio + tempV;



        }


        System.out.println("-------------------------INFORME-------------------------");

        System.out.println("Piloto: " + nombre);
        System.out.println("Tiempo Total: " + sumatorio + " segundos");
        System.out.println("Tiempo medio por vuelta: " + sumatorio/numVueltas + " segundos");
        System.out.println("Mejor tiempo: " + mt + " segundos");


    }
}
