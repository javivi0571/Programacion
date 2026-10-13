import java.util.Scanner;

public class ejercicio2_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.println("Introduzca un número del 1 al 10");
            num = sc.nextInt();
        } while(num<0 || num>10);


        for (int i = 0; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }

    }
}
