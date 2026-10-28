import java.util.Scanner;

public class MiEntradaSalida {
    public static String leerCadena(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        String cadenaIntroducida = sc.nextLine();
        return cadenaIntroducida;
    }

    public static int leerEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        int numLeido = Integer.parseInt(sc.nextLine());
        return numLeido;
    }

    public static int leerIntPoss(String mensaje) {
        Scanner sc = new Scanner(System.in);

        int numLeidoPoss;

        do {
            System.out.printf("%s: ", mensaje);
            numLeidoPoss = Integer.parseInt(sc.nextLine());
            if (numLeidoPoss < 0) {
                System.out.println("Debe ser positivo");
            }

        } while (numLeidoPoss < 0);
        return numLeidoPoss;
    }


    public static double leerDouble(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        double numLeido = Double.parseDouble(sc.nextLine());
        return numLeido;
    }


    public static int leerIntRang(String mensaje) {
        Scanner sc = new Scanner(System.in);

        int numLeidoRang;

        System.out.println("Introduce el primer número del rango");
        int x = Integer.parseInt(sc.nextLine());


        int y;
        do {
            System.out.println("Introduce el segundo número del rango");
            System.out.println("(Recuerda que debe ser mayor que el anterior)");
            y = Integer.parseInt(sc.nextLine());
        } while (x > y);


        do {
            System.out.printf("%s: ", mensaje);
            numLeidoRang = Integer.parseInt(sc.nextLine());
            if (numLeidoRang > y || numLeidoRang < x) {
                System.out.println("Debe de estar entre " + x + " y " + y);
            }

        } while (numLeidoRang > y || numLeidoRang < x);
        return numLeidoRang;
    }

    //----------------------------------------------------------------------------------------------------------------
    static void main(String[] args) {
        int numero = leerIntRang("¿cuál es tu número?");
        System.out.println("El número " + numero + " es valido");
    }
}
