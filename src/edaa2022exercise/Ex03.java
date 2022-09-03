package edaa2022exercise;

import java.util.Arrays;

public class Ex03 {

    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] gas = new int[]{22,12,13,14};
        int cont = 0;
        float[] gasTotal = new float[4];
        int i;
        for ( i = 0; i < gas.length ; ++i){
            if(gas[i] > gas[cont]){
                cont = i;
            }
            gasTotal[i] = (float) 1000/gas[i];
        }
        System.out.println("Carro mais economico ["+cars[cont]+"]");
        for (int j =0; j < gasTotal.length; ++j){
            System.out.println("Gasto litros 1000km ["+gasTotal[j]+"] - Modelo ["+cars[j]+"]");
        }
    }
}
