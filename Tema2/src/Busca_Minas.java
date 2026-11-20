import java.util.Random;
import java.util.Scanner;

public class Busca_Minas {
    static void main(){
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Introduce las dimensiones del tablero");
        int filas = sc.nextInt();
        int columnas = sc.nextInt();
        int f;
        int c;

        char[][] ubicacionMinas = new char[filas][columnas];

        int minas;
        do {
            System.out.println("Indique la cantidad de minas que debe contener");
            minas = sc.nextInt();
        } while (minas < 0 || minas > (filas * columnas) / 2);


        for (int i = 0; i < minas; i++) {

            f = aleatorio.nextInt(filas);
            c = aleatorio.nextInt(columnas);
            ubicacionMinas[f][c] = 'X';
        }

        for (int i = 0; i < ubicacionMinas.length; i++) {
            for (int j = 0; j < ubicacionMinas[i].length; j++) {

                if (ubicacionMinas[i][j] != 'X') {
                    ubicacionMinas[i][j] = 'O';
                }

            }
        }

        char[][] tablero = dondeEstanMinas(ubicacionMinas);
        char[][] coordenadas = new char[filas][columnas];

        char ancho = '0';
        char alto = 'A';

        for (char i = alto; i < tablero.length; i++) {
            for (char j = ancho; j < tablero[i].length; j++) {
                coordenadas[i][j] = 'o';
                System.out.print(coordenadas[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println();
        }


    }

    public static char[][] dondeEstanMinas (char[][] matriz){

        char[][] matrizRes = new char [matriz.length][matriz[0].length];
        char contador = '0';

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == 'X'){
                   matrizRes[i][j] = 'X';
                }

                else{
                    if (i == 0 && j== 0){
                        for (int k = i; k < i + 2; k++) {
                            for (int l = j; l < j + 1; l++) {

                                if (matriz[k][l] == 'X'){
                                    contador++;
                                }
                            }
                        }
                        matrizRes[i][j] = contador;
                        contador='0';
                    }

                    else if(i == matriz.length - 1 && j== 0){
                        for (int k = i - 1; k < i + 1; k++) {
                            for (int l = j; l < j + 1; l++) {

                                if (matriz[k][l] == 'X'){
                                    contador++;
                                }
                            }
                        }
                        matrizRes[i][j] = contador;
                        contador='0';
                    }

                    else if(i == 0 && j == matriz[i].length - 1){
                        for (int k = i ; k < i + 2; k++) {
                            for (int l = j - 1; l < j + 1; l++) {

                                if (matriz[k][l] == 'X'){
                                    contador++;
                                }
                            }
                        }
                        matrizRes[i][j] = contador;
                        contador='0';
                    }

                    else if(i == matriz.length - 1 && j == matriz[i].length - 1){
                        for (int k = i - 1 ; k < i + 1; k++) {
                            for (int l = j - 1; l < j + 1; l++) {

                                if (matriz[k][l] == 'X'){
                                    contador++;
                                }
                            }
                        }
                        matrizRes[i][j] = contador;
                        contador='0';
                    }

                    else if(i > 0 && j == 0){
                        for (int k = i - 1 ; k < i + 2; k++) {
                            for (int l = j ; l < j + 2; l++) {

                                if (matriz[k][l] == 'X'){
                                    contador++;
                                }
                            }
                        }
                        matrizRes[i][j] = contador;
                        contador='0';
                    }

                    else if(i > 0 && j == matriz[i].length - 1){
                        for (int k = i - 1 ; k < i + 2; k++) {
                            for (int l = j - 1; l < j + 1; l++) {

                                if (matriz[k][l] == 'X'){
                                    contador++;
                                }
                            }
                        }
                        matrizRes[i][j] = contador;
                        contador='0';
                    }

                    else if(i == 0){
                        for (int k = i ; k < i + 2; k++) {
                            for (int l = j - 1; l < j + 2; l++) {

                                if (matriz[k][l] == 'X'){
                                    contador++;
                                }
                            }
                        }
                        matrizRes[i][j] = contador;
                        contador='0';
                    }

                    else if(i == matriz.length - 1){
                        for (int k = i - 1 ; k < i + 1; k++) {
                            for (int l = j - 1; l < j + 2; l++) {

                                if (matriz[k][l] == 'X'){
                                    contador++;
                                }
                            }
                        }
                        matrizRes[i][j] = contador;
                        contador='0';
                    }

                    else{
                        for (int k = i - 1 ; k < i + 2; k++) {
                            for (int l = j - 1; l < j + 2; l++) {

                                if (matriz[k][l] == 'X'){
                                    contador++;
                                }
                            }
                        }
                        matrizRes[i][j] = contador;
                        contador='0';
                    }
                }
            }
        }

        return matrizRes;
    }
}
