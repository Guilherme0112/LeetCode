package Two_Sum;

import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int[] array = {3, 3};
        int target = 6;
        boolean achou = false;
        int[] indices = {0, 0};

        for(int indice = array.length-1; indice >= 0 && !achou; indice--){
            int numeroIndice = array[indice];
            for(int j = array.length-1; j >= 0; j--){
                if(indice == j)break;
                int total = array[indice] + array[j];
                if(total == target){
                    indices[0] = indice;
                    indices[1] = j;
                    achou = true;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(indices));
    }
}

// Feito em:
// 08/12/2024