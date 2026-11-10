public class EjeA_1_11{
    /*public static int[] elementosComunesArray(int[]array1, int[]array2){
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
    }*/

    static void main(String[] args) {
        int[] array1 = {5,7,4,9,8};
        int[] array2 = {1,4,8,4,2};
        int[] prueba = new int [5];
        prueba = MiEntradaSalida.elementosComunesArrays(array1,array2);
        for (int i = 0; i < prueba.length; i++) {
            System.out.println(prueba[i]);
        }
    }

}
