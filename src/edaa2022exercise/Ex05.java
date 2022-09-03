package edaa2022exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {

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
