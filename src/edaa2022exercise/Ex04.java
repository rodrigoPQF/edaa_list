package edaa2022exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {

    /*
     Armazene em um vetor a quantidade de dinheiro que as 10 pessoas presas possuíam Este vetor deve ser preenchido pelo usuário.

     */
    public static void main(String[] args) {
        int[] values = new int[4];
        Scanner valorInput = new Scanner(System.in);  // Create a Scanner object
        int valor;
        int valueConfess = 0;
        int totalValue  = 0;
        for (int i = 0; i < values.length; ++i){
            System.out.println("Digite o valor da pessoa ["+(i+1 )+"]");

            values[i] = valorInput.nextInt();
        }
        System.out.println("Digite o valor que o bandido confesso robou ");
        valor = valorInput.nextInt();
        if (valor % 10 == 0){
            valueConfess = valor;
        }
        for (int j = 0; j < values.length; ++j){
            if(valueConfess <= values[j]){
                if (values[j] % 10 == 0) {
                    totalValue = totalValue + values[j];
                }
            }
        }
        System.out.println("Valor total roubado R$"+totalValue);
    }
}
