package edaa2022exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
    /*
     Implemente um array de escrita única de valores de um tipo numérico qualquer.
      Um array de escrita única é um array cujos elementos só podem ser modificados uma única vez.
       Para a implementação, devemos ter, para cada elemento do array, um valor booleano associado que diz se o elemento
        pode ser modificado ou não. Faça um for que percorra esses arrays e na primeira vez, todos os elementos do array
         poderão ser modificados, mas assim que um elemento for modificado pela primeira vez o seu valor booleano associado
         será modificado de forma que da próxima vez que o elemento for modificado nada ocorrerá.

     */
    public static void main(String[] args) {
        int[] values = new int[10];
        boolean[] valid = new boolean[10];
        int change = 0;
        int newValue = 0;
        int opt;
        boolean cont = true;
        Scanner valorInput = new Scanner(System.in);  // Create a Scanner object

        for (int i =0; i < values.length; ++i){
            System.out.println("Digite um valor :");
            values[i] = valorInput.nextInt();
            valid[i] = false;

        }
        while (cont){
            System.out.println("Seu array é esse: "+ Arrays.toString(values));

            System.out.println("Qual elemento deseja alterar ?");
            change = valorInput.nextInt();
            System.out.println("Qual o novo valor ?");
            newValue = valorInput.nextInt();
            for (int j =0; j < values.length; ++j){
                if(values[j] == change){
                    if(valid[j] == false){
                        values[j] = newValue;
                        valid[j] = true;
                    }else {
                        System.out.println("Esse valor nao pode ser alterado");
                    }
                }
            }
            System.out.println("Deseja sair ? 0 - Sim, 1 - Não");
            opt = valorInput.nextInt();
            if (opt == 0){
                cont = false;
            }

        }


    }
    }
