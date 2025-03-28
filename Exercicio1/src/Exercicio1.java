//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//  Faça um algoritmo para calcular a área de uma circunferência, considerando a
//fórmula ÁREA = π * RAIO2. Utilize as variáveis AREA e RAIO, a constante π (pi =
//3,14159) e os operadores aritméticos de multiplicação.


import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        double pi = 3.14159;
        double raio;
        double area;
        double resultadoraio;

        System.out.println("Informe o valor do raio da sua circunferencia:");
        raio = new Scanner(System.in).nextDouble();
        resultadoraio = raio * raio;
        area = pi * resultadoraio;
        System.out.println("A área de sua circunferência:");
        System.out.println(area);

        }
    }
