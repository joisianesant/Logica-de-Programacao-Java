//Exercicio 3  Leia o nome;
//b) Leia o sobrenome;
//c) Concatene o nome com o sobrenome;
//d) Apresente o nome completo


import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        System.out.println("Informe o seu nome: ");
        String nome =  new Scanner(System.in).nextLine();

        System.out.println("Informe o seu sobrenome");
        String sobrenome = new Scanner(System.in).nextLine();

        System.out.println("O seu nome é: " + nome +  " " + sobrenome);




    }
}