import java.util.Scanner;

public class MiEntradaSalida {
    public static String leerCadena(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ",mensaje);
        String cadenaIntroducida = sc.nextLine();
        return cadenaIntroducida;
    }

    public static int leerEntero(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ",mensaje);
        int numLeido = Integer.parseInt(sc.nextLine());
        return numLeido;
    }

    public static int leerIntPoss(String mensaje) {
        Scanner sc = new Scanner(System.in);

        int numLeidoPoss;

        do {
            System.out.printf("%s: ", mensaje);
            numLeidoPoss = Integer.parseInt(sc.nextLine());
            if(numLeidoPoss<0){
                System.out.println("Debe ser positivo");
            }

        }while (numLeidoPoss<0);
        return numLeidoPoss;




    }


    static void main(String[] args) {
        int numero = leerIntPoss("¿cuál es tu número?");
        System.out.println("Bonito número: " + numero);
    }
}
