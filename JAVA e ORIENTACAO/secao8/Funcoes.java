package secao8;

public class Funcoes {
    public static void main(String[] args) {
        saudacao();

        soma(2,4);

        saudar("Kalled Abdala");



        int d1 = dobrar(4);
        System.out.println("Primeiro dobrado: "+d1);

        int d2 = 10;
        int dobrouD2 = dobrar(d2);
        System.out.println( "Segundo dobrado: "+dobrouD2);

        int d3 = 15;
        System.out.println("Terceiro a dobrar: "+dobrar(d3));


        int num1 = 20;
        String n1 = verificarPar(num1);
        System.out.println(n1);

        String n2 = verificarPar(13);
        System.out.println(n2);

    }

    public static void saudacao(){
        System.out.println("Primeira funcao");
    }
    
    public static void soma(int a, int b){
        int resultado = a + b;
        System.out.println("o resultado eh: " + resultado);
        
    }
    
    public static void saudar(String nome){
        System.out.println("Ola, " + nome + ", tranks?");
    }

    public static int dobrar(int d){
        return d * 2;
    }

    public static String verificarPar(int n){
        if (n % 2 == 0) {
            return "O numero " + n + " eh Par";
        } else{
            return "O numero " + n + " eh Impar";
        }
    }

}
