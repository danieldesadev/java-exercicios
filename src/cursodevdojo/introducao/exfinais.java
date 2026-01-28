package cursodevdojo.introducao;

import java.util.Scanner;

/*
class Calculadora {
    public int somar(int num1, int num2){
        return num1+ num2;
    }
}

public class MetodosJava {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        int soma= c.somar(15, 5);
        System.out.println("A soma é:" + soma);
    }
}
class parouimpar {
    public int res(int valor){
        if (valor%2==0){
            System.out.println("O número " + valor + "é par");
        }
        else {
            System.out.println("O número " + valor + "é impar");
        }
        return valor;
    }
}

public class MetodosJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        parouimpar p = new parouimpar();
        int resultado = p.res(num);
    }
}
class Numeros {
    int a;
    int b;
}

class Calculadora {

    public void soma(Numeros n) {
        n.a = n.a + 1;
        n.b = n.b + 2;

        System.out.println("Valor de a: " + n.a);
        System.out.println("Valor de b: " + n.b);
        System.out.println("Soma a + b: " + (n.a + n.b));
    }
}

public class MetodosJava {
    public static void main(String[] args) {

        Numeros valores = new Numeros();
        valores.a = 4;
        valores.b = 8;

        Calculadora c = new Calculadora();
        c.soma(valores);
    }
}
class Fibonacci {
    public void gerar(){

        int a = 0;
        int b = 1;

        for (int i = 3; i <= 10; i++){

            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}

public class exfinais{
    public static void main(String[] args) {

        int n1 = 0;
        System.out.println(n1);

        int n2 = 1;
        System.out.println(n2);

        Fibonacci f = new Fibonacci();
        f.gerar();

        }
    }

class Gerador{
    public void teste(String mensagem, int repetiçao, int borda) {
        String linha = "";

        switch (borda) {
            case 1:
                linha = "--------------------";
                break;
            case 2:
                linha = "~~~~~~~:::::::~~~~~~~";
                break;
            case 3:
                linha = "<<<<<<<<------->>>>>>>>";
                break;
            default:
                linha = "**********************";
        }

        System.out.println(linha);

        for (int i = 0; i < repetiçao; i++) {
            System.out.println(mensagem);
        }

        System.out.println(linha);
    }
}
public class exfinais {
    public static void main(String[] args) {

        Gerador g = new Gerador();
        g.teste("Aprendendo Portugol", 4,3);
    }
}
class Fatorial{
    public int jobson(int f){

        int fat =1;
        for (int n=f; n>1;n--){
            fat *=n;
        }
        return fat;
    }
}
public class exfinais{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int f = sc.nextInt();

        Fatorial n = new Fatorial();
        int resultado = n.jobson(f);
        System.out.println(resultado);

    }
}

public class exfinais{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("PASSO 1 - CADASTRO DE GABARITO");
        System.out.println("-------------------------------");

        String[] gab= new String[5];

        for (int i=0; i<5; i++){
            System.out.println("Questão "+ (i+1) +":");
            gab[i] = sc.next();
            }

        String[] nomes = new String[4];
        String[] resp1 = new String[4];
        String[] resp2 = new String[4];
        String[] resp3 = new String[4];
        String[] resp4 = new String[4];
        String[] resp5 = new String[4];

        int[] notas = new int[4];

        for (int i=0; i<4; i++){
        System.out.println("Aluno "+ (i+1));
        System.out.println("--------");
        System.out.println("Nome: ");
        nomes[i] = sc.next();
        System.out.println("Repostas: ");

        System.out.println("Questão 1:");
        resp1 [i] = sc.next();

        System.out.println("Questão 2:");
        resp2 [i] = sc.next();

        System.out.println("Questão 3:");
        resp3 [i] = sc.next();

        System.out.println("Questão 4:");
        resp4 [i] = sc.next();

        System.out.println("Questão 5:");
        resp5 [i] = sc.next();
        }

        System.out.println("Notas finais");
        System.out.println("-------------");

        for (int c=0;c<4;c++){
            if (resp1[c].equals(gab[0])){
                notas[c]+=2;
            }
            if (resp2[c].equals(gab[1])){
                notas[c]+=2;
            }
            if (resp3[c].equals(gab[2])){
                notas[c]+=2;
            }
            if (resp4[c].equals(gab[3])){
                notas[c]+=2;
            }
        }

        for (int i=0; i<4; i++){
            System.out.println(nomes[i] + "     " + notas[i]);
        }

        int soma = 0;

        for (int i: notas){
            soma+=i;
        }
        double media = (double) soma / notas.length;

        System.out.println("Soma = " + soma);
        System.out.println("Média = " + media);

        System.out.println("----------------------------");
        System.out.println("MEDIA DA TURMA: "+ media);
    }
}
*/
public class exfinais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[2][3];
        matriz[1][2] = 2;


        System.out.println(matriz[1][2]);

    }
}


