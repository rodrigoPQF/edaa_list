package edaa2022exercise;

import java.util.Arrays;

public class Ex03 {
    /*
   Faça um programa que preencha um vetor com os modelos de cinco carros (exemplos de modelos: Fusca, Gol, Vectra etc).
    Carregue outro vetor com o consumo desses carros, isto é, quantos quilômetros cada um deles faz com um litro de combustível.
     Calcule e mostre:
        o modelo de carro mais econômico;
        e quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma distância de 1.000 km

     */
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
