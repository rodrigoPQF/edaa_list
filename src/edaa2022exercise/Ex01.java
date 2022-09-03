package edaa2022exercise;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 119118901
 */
public class Ex01 {
        public static void main(String[] args) {
        int[][] myNumbers = new int[10][10];
        int i;
        int j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                myNumbers[i][j] = i + j;
            }
        }
        for (i = 0; i < myNumbers.length; ++i) {
            for (j = 0; j < myNumbers[i].length; ++j) {
                System.out.println("Tabela"+"["+i+"]"+"["+j+"] = "+myNumbers[i][j]);
            }
        }

    }
    
}
