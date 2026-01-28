package application;

import entities.Alturas;

import java.util.Scanner;

public class ExAlturas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Alturas[] pessoas = new Alturas[n];

        for (int i = 0; i<n; i++){
            System.out.println("Dados da " + (i+1) + "ª pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            pessoas[i] = new Alturas(nome, idade, altura);
        }

        double sumAlt = 0;

        for (int i = 0; i<n; i++){
            sumAlt += pessoas[i].getAltura();
        }

        double mediaAlt = sumAlt/n;

        System.out.printf("Altura média: %.2f%n", mediaAlt);

        int mais16 = 0;

        for (int i=0; i<n; i++){
            if(pessoas[i].getIdade()<16){
                mais16++;
            }
        }

        System.out.print("Pessoas com menos de 16 anos: " + mais16*100/n +"%");


        for (int i=0; i<n; i++){
            sc.nextLine();
            if(pessoas[i].getIdade()<16){
                System.out.println(pessoas[i].getNome());
            }
        }
    }
}
