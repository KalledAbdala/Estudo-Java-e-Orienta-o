package secao2;

import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome!");
        String nome = scanner.nextLine();
        System.out.println("Ola " + nome + "!");


        System.out.println("Digite sua idade!");
        String idade = scanner.nextLine();
        System.out.println("Voce tem " + idade + " anos!");


        scanner.close();


        
    }

}
