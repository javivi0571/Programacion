import java.util.Scanner;

public class ejercicio9_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int div = 0;
        int sumatorio = 0;

        do {

            do {
                System.out.println("introduzca un número mayor que 1");
                num = sc.nextInt();
            } while (num < 2);


            for (int i = 1; i < num; i++) {
                div = num % i;

                if (div == 0) {
                    System.out.println(i);
                    sumatorio += i;
                }

            }
            if (sumatorio == num) {
                System.out.println("el número " + num + " es perfecto");
            } else {
                System.out.println("el número " + num + " no es perfecto");
            }

        } while (sumatorio != num) ;
    }
}
