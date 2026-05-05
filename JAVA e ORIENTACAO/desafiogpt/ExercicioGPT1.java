package desafiogpt;

//🔢 Par ou ímpar
//Crie um programa que receba um número inteiro e diga se ele é par ou ímpar.

import java.util.Scanner;

public class ExercicioGPT1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saiba se o seu numero eh impar ou par!! Digite um numero:");
        int numero = scanner.nextInt();

        verificarSeEhPar(numero);

    }

    public static void verificarSeEhPar(int numero){
        if (numero * 2 == 0) {
            System.out.println("Seu numero eh PAR !!!");
            System.exit(0);

        } else {
            System.out.println("Seu numero eh IMPAR");
        }
    }

}
