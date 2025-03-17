package secao2;

public class Exercicios {

    public static void main(String[] args) {
        
        int num1 = 10;
        int dobro = num1 * 2;
        System.out.println(dobro);


        char letra = 'B';
        int casting = (int) letra;
        System.out.println(casting);


        double nDouble1 = 15.75;
        double nDouble2 = 20.40;
        double valorFinal = nDouble1 + nDouble2;
        System.out.println(valorFinal);



        long numL = 2_000_000_000l;
        int exibicaoLong = (int) numL;
        System.out.println(exibicaoLong);



        String word = "Ola, Mundo!!";
        String java = word + " Bem vindo ao Java!!";
        System.out.println(java);

    }
}