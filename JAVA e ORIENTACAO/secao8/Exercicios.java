public class Exercicios {



    public static void main(String[] args) {
        

        // Exercicio 1
        double celsius = 22.0;
        double fahrenheit = converterTemperaruta(celsius);
        System.out.println("A temperatura de " + celsius + "C eh equivalente a " + fahrenheit + "F");


        // Exercicio 2
        System.out.println("O fatorial de 10 eh: " + calcularFatorial(10));


        // Exercicio 3
        System.out.println(verificarParidade(21));


        // Exercicio 4
        System.out.println(verificarNota(12));
        System.out.println(verificarNota(9));
        System.out.println(verificarNota(8));
        System.out.println(verificarNota(4));

    }

    // Exercicio 1
    public static double converterTemperaruta(double celsius){
        return (celsius * 9/5) + 32;
    }


    // Exercicio 2
    public static int calcularFatorial(int numero){
        if(numero == 0 || numero == 1){
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }


    // Exercicio 3
    public static String verificarParidade(int x){
        if(x % 2 == 0){
            return "O numero: " + x + " eh PAR";
        } else {
            return "O numero: " + x + " eh IMPAR";
        }
    }


    // Exercicio 4
    public static String verificarNota(int nota){
        if(nota < 0 || nota > 10){
            return "nota invalida";
        }
        switch (nota) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            case 5:
                return "E";
            default:
                return "F";
        }
    }

}



