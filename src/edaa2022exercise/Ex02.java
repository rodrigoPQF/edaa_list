package edaa2022exercise;

import java.util.Arrays;

public class Ex02 {

    public static void main(String[] args) {

        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int[] vector = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            vector[i] = rand;
        }
        System.out.print(Arrays.toString(vector)+"\n");

        for(i = 0; i < vector.length; i++){
            if (!(vector[i] % 2 == 0)){
                System.out.println("Primo ["+vector[i]+"]");
            }
        }

    }

}
