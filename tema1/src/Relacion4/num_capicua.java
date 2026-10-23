package Relacion4;

import java.util.Scanner;

public class num_capicua {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");

        int num = sc.nextInt();
        int aux = num;
        int inv = 0;

        while(num>0){

            int res = num % 10;
            inv = (inv * 10) + res;
            num = num / 10;
        }

        System.out.println(inv);

        if (aux==inv){
            System.out.println("es capicua");
        }

        else{
            System.out.println("no es capicua");
        }
    }
}