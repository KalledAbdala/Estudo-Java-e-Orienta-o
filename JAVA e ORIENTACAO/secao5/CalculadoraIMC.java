
import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        double resultado = peso / (altura * altura);

        if (resultado > 18.5) {
            System.out.println("Abaixo do peso");
        } else if(resultado >= 18.5 && resultado <= 24.9){
            System.out.println("Peso normal");
        } else if(resultado >= 25 && resultado < 29.9){
            System.out.println("Sobrepeso");
        } else{
            System.err.println("Obesidade");
        }

    }
}
