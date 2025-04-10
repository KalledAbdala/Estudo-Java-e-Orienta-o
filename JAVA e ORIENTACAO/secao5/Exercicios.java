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
 


        System.out.println("Digite um usuario:");
        String usuario = scanner.next();

        System.out.println("Digite a senha:");
        String senha = scanner.next();

        if (usuario.equals("Kalled") && senha.equals("YesBaby")) {
            System.out.println("Acesso permitido");
        } else{
            System.out.println("Acesso negado");
        }




        System.out.println("Insira um numero:");
        int numero = scanner.nextInt();

        String numeroArmazenado = "";

        if (numero % 2 == 0){
            numeroArmazenado = "Par";
        } else{
            numeroArmazenado = "Impar";
        }

        System.out.println("Seu numero eh: " + numeroArmazenado);





        System.out.println("Digite o número correspondente com o dia da semana:\n" +
                   "1 - Domingo\n" +
                   "2 - Segunda\n" +
                   "3 - Terça\n" +
                   "4 - Quarta\n" +
                   "5 - Quinta\n" +
                   "6 - Sexta\n" +
                   "7 - Sábado");
        int diaDaSemana = scanner.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo nao e dia Util");
                break;
            case 2:
                System.out.println("Segunda e dia Util !!!");
                break;
            case 3:
                System.out.println("Terca e dia Util !!!");
                break;
            case 4:
                System.out.println("Quarta e dia Util !!!");
                break;
            case 5:
                System.out.println("Quinta e dia Util !!!");
                break;
            case 6:
                System.out.println("sexta e dia Util !!!");
                break;
            case 7:
                System.out.println("Sabado nao e dia Util");
                break;
            default:
                System.out.println("Numero invalido");
                break;
        }
        



        System.out.println("\nInsira um numero: ");
        int numeroIntervalo = scanner.nextInt();

        if(numeroIntervalo >= 10 && numeroIntervalo <= 20){
            System.out.println("Dentro do intervalo");
        }else{
            System.out.println("Fora do intervalo");
        }





        System.out.println("\n\nInsira uma letra" + "\n________________________\n");
        char letra = scanner.next().toLowerCase().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.err.println("\nVogal!!!" + "\n________________________");
                break;
            default:
                System.out.println("\nConsoante!!!" + "\n________________________");
                break;
        }

        

        scanner.close();
    }
}
