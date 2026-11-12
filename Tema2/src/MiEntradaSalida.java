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

    public static int[] elementosComunesArray(int[]array1, int[]array2){
        int posiciones = 0;
        int[] arrayRes = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]){
                    arrayRes[posiciones] = array1[i];
                    posiciones++;

                }
                for (int k = 0; k < arrayRes.length; k++) {
                    for (int l = 0; l < arrayRes.length; l++) {

                        if (k != l){

                            if((arrayRes[k] != 0) && (arrayRes[k] == arrayRes[l])){
                                arrayRes[l] = 0;
                            }

                        }
                    }
                }
            }
        }

        return arrayRes;
    }

    //----------------------------------------------------------------------------------------------------------------
    static void main(String[] args) {
        int numero = leerIntRang("¿cuál es tu número?");
        System.out.println("El número " + numero + " es valido");
    }
}
