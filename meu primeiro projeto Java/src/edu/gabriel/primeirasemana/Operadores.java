package edu.gabriel.primeirasemana;

public class Operadores {

    //x tipos variaveis
    String nome = "Gabriel";
    int idade = 21;
    double peso = 63.5;
    char sexo = 'M';
    boolean doadorOrgao = false;
    Date dataNascimento = new Date() ;

    //x tipos operações
    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20/4);

    public static void main(String[] args) {
        
        int numero = 5;
        numero = numero + 2;
        System.out.println(numero);
    }

    public static void main(String[] args) {
        
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);
    }

}

