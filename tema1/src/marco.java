import java.util.Scanner;

public class marco {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");

        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            System.out.print("*  ");
        }

        for (int i = 1; i < num; i++) {
            System.out.println("*");
            for (int j = 1; j <num -1; j++) {
                System.out.print("    ");

            }
            System.out.println("*");
        }
        for (int i = 0; i < num; i++) {
            System.out.print("*  ");
        }



    }
}
