import java.util.Scanner;

public class Conversor_de_binario_a_decimal{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un número");
        int num = sc.nextInt();
        while (num/2!=1){
            System.out.println(num%2);
            num=num/2;
        }
        System.out.println(num%2);
        System.out.println("1");
    }
}
