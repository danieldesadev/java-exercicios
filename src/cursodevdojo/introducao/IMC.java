package cursodevdojo.introducao;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        Scanner imc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome1 = imc.nextLine();

        System.out.println("Olá,"+ nome1+"! Vamos achar seu IMC");

        System.out.println("Digite seu peso: ");
        int peso = imc.nextInt();
        System.out.println("Digite sua altura (em metros)");
        float altura = imc.nextFloat();

        double alturaquad = altura*altura;
        double resultadoimc = peso/alturaquad;

        System.out.println(resultadoimc);

        if (resultadoimc >=30){
            System.out.println("Você está obeso!");}
        else if (resultadoimc <30 && resultadoimc >=25){
            System.out.println("Você está com sobrepeso");}
        else if (resultadoimc <25 && resultadoimc >=18){
            System.out.println("Você está eutrófico");}
        else {
            System.out.println("Você está abaixo do peso");}


            }}









