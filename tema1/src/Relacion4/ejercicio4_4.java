package Relacion4;

import java.util.Scanner;

public class ejercicio4_4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora actual");

        int h1;
        int m1;
        int s1;

        do{
            System.out.println("hora");
            h1 = sc.nextInt();
        }while(h1>23 || h1<00);

        do{
            System.out.println("minutos");
            m1 = sc.nextInt();
        }while(m1>59 || m1<00);

        do{
            System.out.println("segundos");
            s1 = sc.nextInt();
        }while(s1>59 || s1<00);


        int suma1 = 3600*h1 + 60*m1 + s1;


        System.out.println("Introduce la hora que quieras sumarle");

        System.out.println("hora");
        int h2 = sc.nextInt();

        System.out.println("minutos");
        int m2 = sc.nextInt();

        System.out.println("seg");
        int s2 = sc.nextInt();

        int suma2 = 3600*h2 + 60*m2 + s2;

        int suma12 = suma1 + suma2;

        int sr = suma12 % 60;

        int mr = (suma12 / 60) % 60;

        int hr = (suma12 / 3600) % 24;

        int d = (suma12 / (3600 * 24)) % 365;

        int y = d / 365;

        System.out.println("Serán las " + hr + ":" + mr + ":" + sr + " de " + d + " días después");

        if(y > 0){
            System.out.println( y + " años después");

        }

    }
}

