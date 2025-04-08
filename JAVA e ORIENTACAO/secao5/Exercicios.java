package secao5;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto:");
        double valor = scanner.nextDouble();

        if(valor < 50){
            System.out.println("O valor do seu produto eh Barato");
        } else if(valor >= 50 && valor <= 100){
            System.out.println("O valor do seu produto eh Medio");
        } else{
            System.out.println("O valor do seu produto eh Caro");
        }
 


        System.out.println("Digite um usuaio:");
        String usuario = scanner.next();

        System.out.println("Digite a senha:");
        String senha = scanner.next();

        if (usuario.equals("Kalled") && senha.equals("YesBaby")) {
            System.out.println("Acesso permitido");
        } else{
            System.out.println("Acesso negado");
        }



        scanner.close();
    }
}
