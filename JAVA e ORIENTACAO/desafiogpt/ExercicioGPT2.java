package desafiogpt;

// 2. 📊 Maior de três números
// Receba 3 números e mostre qual é o maior.

import java.util.Scanner;

public class ExercicioGPT2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Maior numeros entre 3 !!!");
        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int num3 = scanner.nextInt();

        maiorNumero(num1, num2, num3);

    }
    
    public static void maiorNumero(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior numero entre os tres eh: " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("O maior numero entre os tres eh: " + num2);
        } else{
            System.out.println("O maior numero entre os tres eh: " + num3);
        }
    }

}
