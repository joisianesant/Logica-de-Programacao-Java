import java.util.Scanner;

public class Exercicio2a {
    public static void main(String[] args) {
        System.out.println("Informe o valor da base do seu triangulo:" );
        double base =  new Scanner(System.in).nextDouble();

        System.out.println("Informe o valor da altura do seu triangulo:" );
        double altura =  new Scanner(System.in).nextDouble();

        double resultadoBA = base * altura;
        double area = resultadoBA /2;

        System.out.println("O valor da area do seu triangulo é: " + area);
    }
}
