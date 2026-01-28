package application;

import entities.Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExLista {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int emp = sc.nextInt();

        List<Lista> list = new ArrayList<>();

        for (int i = 0; i<emp; i++){
            System.out.println("Employee #" + (i+1) + ":");

            System.out.print("ID: ");
            int id = sc.nextInt();

            while (hasId(list, id) != null) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            Double salario = sc.nextDouble();

            Lista func = new Lista(id, nome, salario);

            list.add(func);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();
        Integer pos = position(list,idSalary);
        if (pos == null){
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Lista empItem : list) {
            System.out.println(empItem);
        }

        sc.close();

    }

    public static Integer position(List<Lista> list, int id){
        for (int i=0; i< list.size(); i++){
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
    public static Integer hasId(List<Lista> list, int id){
        for (int i=0; i< list.size(); i++){
            if (list.get(i).getId() ==id){
                return i;
            }
        }
        return null;
    }
}
