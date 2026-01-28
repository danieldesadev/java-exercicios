package cursodevdojo.introducao;

import java.util.Scanner;

public class Cursoalgoritmoparajava {
    public static void main(String[] args){
       // System.out.println("Olá,mundo!"); Comentário simlpes
        /* Comentário contínuo*/
/* Variável: Armário com etiquetas
-identificadores(regras):1 começa com letra
2. letra depois número
3. não colocar simbolo, apenas _
4. não ter espaço
5. não ter acento
6. não utilizar palavras reservadas

Tipo primitivo
short / int / long = números inteiros
float / double = números reais
String = caracteres
boolean = verdadeiro e falso

Comando de saída: Mensagem que aparece para o usuário
("Daniel")-string (Daniel)-variável Daniel ("Daniel" + Daniel)

Comando de entrada: Interação com o usuário
{ Para criar um Scanner:*/
/*Scanner joao = new Scanner(System.in);
System.out.println("Digite seu nome: ");
String nome = joao.nextLine();

System.out.println("Olá,"+ nome+"! Seja bem vindo ao Java");

System.out.println("Digite um número: ");
int n1 = joao.nextInt();
System.out.println("Digite outro número: ");
int n2 = joao.nextInt();
int n3 = n1+n2;
System.out.println(n3);
joao.close();*/
//João= nome do Scanner Soma de números
/* Operadores Aritméticos
+Adição     - Subtração     *Multiplicação      /Divisão    \Divisão Inteira        ^Exponenciação     %Módulo
Ordem de precedência --> Parenteses --> Exponenciação --> Multiplica~ção/Divisão --> Soma/Subtração */
/*   Scanner media = new Scanner(System.in);
        System.out.println("n6");
        int n1 = media.nextInt();
        System.out.println("n5");
        int n2 = media.nextInt();
        int n3 = (n1+n2)/2;
        System.out.println(n3);
        media.close();

Operadores relacionais
> maior que
>= maior ou igual
< menor
<= menor ou igual
== igual
!= diferente de

Scanner relacionais = new Scanner(System.in);
int n1= 3;
int n2= 4;
int n3= 7;
System.out.println(n1!=n2);
System.out.println(n1>=3);
System.out.println(n1+n2==n3);
System.out.println(n1*n1==9);
System.out.print((n1==n2)||(n2==n3-n1));
System.out.print((n1==n2) && (n2==n3-n1));
relacionais.close();

Operadores lógicos
&& (E lógico)
|| (Ou)
! (Não logico) inversão valor booleano

Ordem de Precedência
Aritméticos () → ^ → * / → + - → Relacionais → Lógicos && → || → !

Estrutura condicional
Condicional simples - if
Condicional composta - if + else
Varios casos = if -> else if -> -> else if -> else
Switch: declaração da expressão a ser testada
case é a condicional
break faz parar quando o comando é executado para poupar memória (opcional)
default é caso dê erro (opcional)

Estruturas de repetição - Interar
Loop = fazer algo até chegar em outro algo (Por enquanto)
while
    nome do while -= ou += para alterar troca
    Comando Integer Classe para tratar int como objeto
    ++ soma 1
    -= 10 tira 10 /// +=10 soma 10

for
    3 variáveis
    int i - o que vai ser incrementado
    i<10 até onde quero alteração
    de quanto em quanto

do while
igual ao do while mas executa uma vez mesmo a condição sendo falsa*/
/*
Procedimentos
Rotinas - dar um nome a um somatório de comandos
Java=Metodo
Definir o metodo = colocar rotina na memoria
chamar o metodo = executar a rotina
public static void (nomedometodo)(){}t definir o metodo
nomedometodo();

Escopo - Onde está o objeto que quero citar
Global ou local- Todas as classes ou específicas
Variáveis de instância são declaradas dentro de uma classe, mas fora de qualquer metodo modificadores de acesso como public ou private
Variáveis declaradas dentro de um metodo, incluindo os argumentos passados para ele, são acessíveis apenas dentro daquele metodo.
Escopo de bloco (if, for)

Vetores - Variáveis compostas (Varios espaços) homogêneas(mesmo tipo) unidimensionais(um endereço)
Arrays


 */












    }
}
