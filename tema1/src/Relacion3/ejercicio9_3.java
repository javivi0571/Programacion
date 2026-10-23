package Relacion3;

public class ejercicio9_3 {
    static void main(String[] args) {

        int res;
        for (int i = 0; i < 11; i++) {
            System.out.println("tabla del " + i);
            System.out.println();

            for (int j = 0; j < 11; j++) {
                res = i * j;
                System.out.println(i + "x" + j + "=" + res);

            }
            System.out.println();

        }
    }
}
