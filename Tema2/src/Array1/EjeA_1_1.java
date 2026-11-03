package Array1;

public class EjeA_1_1 {
    static void main(String[] args) {
        int [] miArrayInt = {1,2,3,4,5,6,7,8,9};

        int res = sumaPosicionesPares(miArrayInt);
        System.out.printf("La suma es: %d", res);

    }

    static int sumaPosicionesPares(int [] array){
        int sumatorio = 0;

        for (int i = 0; i < array.length; i++) {

            if( i % 2 == 0 ){
                sumatorio = sumatorio + array[i];
            }
        }

        return sumatorio;
    }
}
