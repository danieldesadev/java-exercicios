package application;

import java.util.Scanner;

public class ExVetores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] listanat = new int[num];
        sc.nextLine();

        for (int i = 0; i<listanat.length; i++){
            System.out.print("Digite um número: ");
            listanat[i] = sc.nextInt();

        }
        
        System.out.println("Números negativos:");

        for (int i = 0; i<listanat.length; i++){
            if (listanat[i] < 0){
                System.out.println(listanat[i]);
            }
        }
    }
}
