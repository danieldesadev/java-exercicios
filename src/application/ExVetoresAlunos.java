package application;

import entities.AlunosVetores;

import java.util.Scanner;

public class ExVetoresAlunos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serão digitados?");
        int n = sc.nextInt();

        sc.nextLine();

        AlunosVetores[] alunos = new AlunosVetores[n];

        for(int i = 0; i< alunos.length; i++){

            alunos[i] = new AlunosVetores();

            System.out.println("Digite o nome do " + (i+1) + "º aluno:");
            alunos[i].setAluno(sc.nextLine());

            System.out.println("Digite a primeira nota:");
            alunos[i].setNota1(sc.nextDouble());

            System.out.println("Digite a segunda nota:");
            alunos[i].setNota2(sc.nextDouble());

            sc.nextLine();
        }
    }
}
