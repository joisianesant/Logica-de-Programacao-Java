
//Faça um algoritmo que:
//a) Leia um número inteiro;
//b) Leia um segundo número inteiro;
//c) Efetue a adição dos dois valores;
//d) Apresente o valor calculado.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        int numeroP;
        int numeroS;
        int resultado;

System.out.println("Informe o valor de um numero inteiro");
numeroP = new Scanner(System.in).nextInt();

System.out.println("Informe o valor do seu segundo numero inteiro");
numeroS = new Scanner(System.in).nextInt();

resultado = numeroP + numeroS;
System.out.println("O resultado da soma dos seus numeros inteiros e de:" +resultado);

    }
}
