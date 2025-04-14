package secao6;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        double resultado = peso / (altura * altura);

        if (resultado < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (resultado < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (resultado < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }


    }
}
