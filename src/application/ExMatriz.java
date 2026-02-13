package application;

import java.util.Scanner;

public class ExMatriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas: ");
        int l = sc.nextInt();

        System.out.println("Digite o número de colunas: ");
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];

        for (int i=0; i< matriz.length; i++){
            for (int j = 0; j<c; j++){
                matriz [i][j] = sc.nextInt();
            }
        }

        for (int i=0; i< matriz.length; i++){
            for (int j = 0; j<c; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Digite o número que você gostaria de verificar se há repetição: ");
        int num = sc.nextInt();

        for (int i=0; i< matriz.length; i++){
            for (int j = 0; j<c; j++){

                if (matriz [i][j] == num){
                    System.out.println("Position: " + i + ", " + j);

                    if(j > 0){
                        System.out.println("Left: " + matriz[i][j-1]);
                    }


                    if(j < matriz[i].length - 1){
                        System.out.println("Right: " + matriz[i][j+1]);
                    }

                    if (i > 0){
                        System.out.println("Up: " + matriz[i-1][j]);
                    }

                    if (i < matriz.length - 1){
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
        }



    }
}
