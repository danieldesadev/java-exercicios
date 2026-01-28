package cursodevdojo.introducao;

import entities.Triangle;

import java.util.Scanner;

public class poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite as medidas do triàngulo x:");
        x.a = sc.nextInt();
        x.b = sc.nextInt();
        x.c = sc.nextInt();

        System.out.println("Digite as medidas do triàngulo y:");
        y.a = sc.nextInt();
        y.b = sc.nextInt();
        y.c = sc.nextInt();

        double areax = x.area();
        double areay = y.area();

        System.out.printf("A área do triângulo x é: %.4f%n" , areax);
        System.out.printf("A área do triângulo y é: %.4f%n" , areay);

        if (areax>areay){
            System.out.println("A maior área é do triâgulo x");
        }
        else if (areax<areay){
            System.out.println("A maior área é do triâgulo y");
        }
        else {
            System.out.println("Os triângulos são iguais");
        }
    }
}
