package edaa2022exercise;

import edaa2022exercise.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner valorInput = new Scanner(System.in);  // Create a Scanner object
        int opt;
        boolean cont = true;
        while (cont){
            System.out.println("Qual exercicio voce deseja visualizar ? - 0 até 5 \n 6 - Para sair");
            opt = valorInput.nextInt();
            switch (opt){
                case 1:
                    Ex01.main(args);
                    break;
                case 2:
                    Ex02.main(args);
                    break;
                case 3:
                    Ex03.main(args);
                    break;
                case 4:
                    Ex04.main(args);
                    break;
                case 5:
                    Ex05.main(args);
                    break;
                case 6:
                    cont = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }
    }
}
