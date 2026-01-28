package cursodevdojo.introducao;

import java.util.Objects;
import java.util.Scanner;

public class exercicios{
    public static void main(String[] args) {

        Scanner dolar = new Scanner(System.in);/*

        float real = 5.31F;

        System.out.println("Quantos reais você têm?");
        float reais = dolar.nextFloat();
        float dolares = (reais/real);

        System.out.println("Então você vai ter " + dolares + " dólares");

        System.out.println("Qual a temperatura em fahrenheit?");
        float temperaturaf = dolar.nextFloat();
        float temperaturaC = (float) ((temperaturaf-32)/1.8);

        System.out.println("A temperatura em celsius é "+ temperaturaC);

    System.out.println("Qual valor do empréstimo?");
    int emprestimo = dolar.nextInt();
        double v = emprestimo * 1.2;
    System.out.println("Quantas parcelas desejar pagar?");
        int parcelas = dolar.nextInt();
        double fim = v/parcelas;

    System.out.println("Você vai pagar " + parcelas + " parcelas de R$" + fim + " para concluir o empréstimo!");

        System.out.println("Em que ano estamos?");
    int idade = dolar.nextInt();
        System.out.println("Em que ano você nasceu?");
    int anonasc = dolar.nextInt();
    int idadeatual = idade-anonasc;
        System.out.println("Você tem "+ idadeatual + " anos");
        if (idadeatual>=18){
            System.out.println("Você já pode ser preso!");}
        else {
            System.out.println("Você ainda é um bebê");}

    System.out.println("Digite um número");
    int numero = dolar.nextInt();
    int div = numero%2;
    if (div>0){
        System.out.println("Seu número é impar");}
    else {
        System.out.println("seu número é par");}}

    System.out.println("--------------------------------");
    System.out.println("  SISTEMA NACIONAL DE TRANSITO  ");
    System.out.println("--------------------------------");

    System.out.println("Ano de nascimento: ");
    int nasc = dolar.nextInt();
    System.out.println("Ano atual: ");
    int atual = dolar.nextInt();
    int idade = atual-nasc;

    if (idade>=18){
        System.out.println("-----------------------------");
        System.out.println("  Você está apto a dirigir!  ");
        System.out.println("-----------------------------");}
    else {
        System.out.println("----------------------------------------");
        System.out.println("  Você tem que tomar muito leite ainda  ");
        System.out.println("----------------------------------------");}

    System.out.println("Quanto você quer doar?");
    System.out.println("1 para doar 5 reais");
    System.out.println("2 para doar 10 reais");
    System.out.println("3 para doar 50 reais");
    System.out.println("4 para doar 100 reais");
        int valor = dolar.nextInt();

        switch (valor) {
            case 1:
                System.out.println("Você doou 5 reais");
                break;
            case 2:
                System.out.println("Você doou 10 reais");
                break;
            case 3:
                System.out.println("Você doou 50 reais");
                break;
            case 4:
                System.out.println("Você doou 100 reais");
                break;
            default:
                System.out.println("Número inválido");
                break;

        System.out.println("Qual o nome do funcionário?");
        String nome = dolar.nextLine();
        System.out.println("Qual o salário do funcionário?");
        int sal = dolar.nextInt();
        System.out.println("Qual é a quantidade de dependentes do funcionário?");
        int dep = dolar.nextInt();

        switch (dep) {
            case 0:
                System.out.println("O salário de "+ nome + " é de R$"+ (sal+(sal*5/100)));
                break;
            case 1:;
            case 2:;
            case 3:;
                System.out.println("O salário de "+ nome + " é de R$"+ (sal+(sal*10/100)));
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("O salário de "+ nome + " é de R$"+ (sal+(sal*15/100)));
                break;
            default:
                System.out.println("O salário de "+ nome + " é de R$"+ (sal+(sal*18/100)));
                break;}

        int contador = 90;
        while(contador>0){
            System.out.println(+contador);
            contador -=10;}

        System.out.println("Diga um número");
        int cont = dolar.nextInt();
        int num = 0;

        while(num<cont){
            System.out.println(num);
            num +=2;}

        int contador = 1;
        int soma = 0;
        int n = Integer.MIN_VALUE;
        while(contador<=4){
            System.out.println("Digite o "+contador+ "o. valor: ");
            int resp = dolar.nextInt();
                if (resp>n){
                    n = resp;}
            soma +=resp;
            contador ++;}
        System.out.println("A soma deu "+ soma);
        System.out.println("O maior número é "+ n);

        int contador = 1;
        int soma = 0;
        int n = Integer.MAX_VALUE;
        while(contador<=4){
            System.out.println("Digite o "+contador+ "o. valor: ");
            int resp = dolar.nextInt();
            if (resp<n){
                n = resp;}
            soma +=resp;
            contador ++;}
        System.out.println("A soma deu "+ soma);
        System.out.println("O maior número é "+ n);

        System.out.println("Quantas vezes você quer converter a moeda?");
        int n = dolar.nextInt();
        int contador = 1;
        while (contador<=n){
            System.out.println("Quanto você tem em real?");
            int dolares = dolar.nextInt();
            float conv = dolares/5.31f;
            System.out.println("Então você tem $ "+ conv);
            contador++;}

        System.out.println("Contagem Inteligente");
        System.out.println("Digite o número do inicio da contagem: ");
            int inicio = dolar.nextInt();
        System.out.println("Digite o número do final da contagem: ");
            int fim = dolar.nextInt();

            if (inicio>fim){
                while (inicio>=fim){
                    System.out.println(inicio);
                    inicio -=1;}}

            else {
                while (fim>=inicio){
                    System.out.println(inicio);
                    inicio++;}

        System.out.println("Escolinha");
        System.out.println("Quantos alunos a turma tem?");
        int ndealunos = dolar.nextInt();
        int maiornota = 0;
        String melhoraluno ="";
        for (int i=1;i<=ndealunos;i++) {
            System.out.println("Aluno "+ i);
            System.out.println("Nome do aluno: ");
            String nome1 = dolar.next();
            System.out.println("Média do aluno");
                int media1 = dolar.nextInt();
                if (media1>maiornota){
                    maiornota=media1;
                    melhoraluno=nome1;}}
        System.out.println("A maior nota foi do aluno "+melhoraluno+" com a nota "+ maiornota);

                int S = 0;
                String resp;

                do {
                    System.out.println("Digite um valor:");
                    int valor = dolar.nextInt();
                    S += valor;

                    dolar.nextLine();

                    System.out.println("Quer continuar? (s/n)");
                    resp = dolar.nextLine();
                } while (resp.equalsIgnoreCase("s"));

                System.out.println("Soma total: " + S);
                System.out.println("Programa encerrado.");

        int contagem = 1;
        do{
            System.out.println(contagem++);
        } while (contagem<=10);
        int numerotabuada = 8;
        for (int i=1;i<=10;i++){
            System.out.println(numerotabuada +" x "+ i + " = " + numerotabuada*i);}
        int C=1;
        int Totalnegat = 0;
        do {
            System.out.println("digite um número: ");
                while (!dolar.hasNextInt()){
                    System.out.println("Digite um número válido: ");
                dolar.nextInt();}

            int numeroteste = dolar.nextInt();
                if (numeroteste<0){
                    Totalnegat+=1;}
            C++;

                } while (C<5);
        System.out.println("Foram digitados "+Totalnegat+ " números negativos");

        String R;
    do{
        System.out.println("Digite um número:");
        int calcfat = dolar.nextInt();

        int resultado = 1;
        while (calcfat>1){
            System.out.println(calcfat);
            resultado *= calcfat;
            calcfat-=1;
        }
        System.out.println(resultado);
        dolar.nextLine();
        System.out.println("Você quer continuar?");
        R= dolar.nextLine();
        }
        while (R.equals("s"));

        String resposta;
        do {
            System.out.println("Digite um número para iniciar sua contagem:");
            while (!dolar.hasNextInt()){
                System.out.println("Digite um número válido");
                dolar.next();}

            int continicio = dolar.nextInt();

            System.out.println("Digite um número para finalizar sua contagem:");
            int contfinal = dolar.nextInt();

            if (continicio > contfinal) {
                while (continicio >= contfinal) {
                    System.out.println(continicio);
                    continicio -= 1;
                }
            }
            if (contfinal > continicio) {
                while (contfinal >= continicio) {
                    System.out.println(continicio++);
                }
            }
            System.out.println("Você quer fazer outra sequência?[S]/[N]");
            resposta = dolar.next();
        }while (resposta.equalsIgnoreCase("S"));

        System.out.println("Programa finalizado");
        testedemetodo();
    }
    public static void testedemetodo(){
        int c1 = 1;
        do {
            int c2 = 1;
            do {
                System.out.println(c1 + " " + c2);
                c2++;
            } while (c2 <= 3);
            c1++;
        } while (c1 != 4);
        int mai=0;
        int i= 1;

        String Pesado= "";
        String N;

        System.out.println("Maior peso até agora: "+mai+ "kg");
        while (i!=5){
            System.out.println("Digite o nome: ");
            N = dolar.next();

            System.out.println("Digite o peso de "+N+": ");
            int P = dolar.nextInt();

            if (P>mai){
                mai = P;
                Pesado = N;}
            i++;
        }
        System.out.println("Maior peso até agora: "+mai+ "kg");
        System.out.println("A pessoa mais pesada foi "+Pesado+" com "+ mai+ " quilos");

        int n1= 0;
        System.out.println(n1);
        int n2=1;
        System.out.println(n2);
        for (int i=3;i<=15;i++){
            int n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
        int somavalor=0;
        int div5=0;
        int nulo=0;
        int pares=0;
        for (int i=1;i<=5;i++){
            System.out.println("Digite o "+i+"o valor");
            int valor= dolar.nextInt();
            if (valor==0){
                nulo+=1;}

            if (valor%2==0){
                pares+=1;}

            if(valor%5==0){
                div5+=1;}

            somavalor+=valor;}

        int media= somavalor/5;

        System.out.println("A soma dos valores é: " + somavalor);
        System.out.println("A média dos valores é: " + media);
        System.out.println("A quantidade de números divisíveis por 5 é: " + div5);
        System.out.println("A quantidade de números nulos é: " + nulo);
        System.out.println("A quantidade de números pares é: " + pares);

        int[] valores= new int[6];

        for (int c=0; c<6; c++){
            System.out.println("Digite o " + (c+1) +".o valor:");
            valores[c]= dolar.nextInt();
        }

        for (int c=0; c<6; c++){
            System.out.println("Esse é o "+ (c+1) +".o valor: " + valores[c]);
        }

        int[] valores = new int[7];
        int totpar = 0;

        for (int c=0; c<7; c++){
            System.out.println("digite o " + (c+1) + "o. valor: ");
            valores[c]= dolar.nextInt();

            if (valores[c]%2==0) {
                totpar+=1;
            }
        }
        System.out.println("pares " + totpar);

        for (int c=0; c<7; c++){
            if (valores[c]%2==0) {
                System.out.println("o valor da posição " + (c+1) + "é par");
            }
        }

        String[] nomes =new String[4];
        int[] n1= new int[4];
        int[] n2= new int[4];
        int[] m= new int[4];
        int sm = 0;
        int tot = 0;

        for (int c=0; c<4;c++){
            System.out.println("ALUNO "+ (c+1));
            System.out.println("Nome: ");
            nomes[c]= dolar.next();
            System.out.println("Primeira Nota: ");
            n1[c]= dolar.nextInt();
            System.out.println("Segunda Nota: ");
            n2[c]= dolar.nextInt();
            m[c]= ((n1[c]+n2[c])/2);
            sm= sm+m[c];
        }
        int mt= sm/4;

        System.out.println("LISTA DE ALUNOS");
        System.out.println("--------------------");
        for (int c=0; c<4;c++){
            System.out.println(nomes[c] +" "+ m[c]);
            if(m[c]>mt){
                tot+=1;
            }
        }
        System.out.println("Ao todo temos "+ tot+ " alunos acima da e media, que é "+ mt);*/

        double pi = 3.14159d;

        System.out.println("Qual o raio do seu círculo para saber a área?");
        int raio= dolar.nextInt();

        double area= pi*(Math.pow(raio,2));

        System.out.printf("A área do círculo é:%.2f%n", area);



    }
}

