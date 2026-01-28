package application;

import entities.Pensionato;

import java.util.Scanner;

public class ExPensionato {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pensionato[] pens = new Pensionato[10];

        System.out.print("How many rooms will be rented?  ");
        int rooms = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i<rooms; i++){
            System.out.println("RENT #" + (i+1) + ":");
            System.out.print("Name: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int numero = sc.nextInt();
            sc.nextLine();

            pens[numero] = new Pensionato(nome, email, numero);
        }

        System.out.println("Busy Rooms: ");

        for (int i= 0; i<10; i++){
            if(pens[i]!=null){
                System.out.println(pens[i].getNumero()
                        + ": "
                        + pens[i].getNome()
                        + ", "
                        + pens[i].getEmail());
            }
        }





    }
}
