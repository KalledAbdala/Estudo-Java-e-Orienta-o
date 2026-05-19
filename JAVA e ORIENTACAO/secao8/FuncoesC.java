import java.util.Arrays;
import java.util.List;


public class FuncoesC {
    
    public static void main(String[] args) {
    
        // Recursiva
        System.out.println(funcaoRecursiva(13));


        // Overloanding
        System.out.println(soma(6, 8, 2));
        System.out.println(soma(2, 6));
        System.out.println(soma(2.2, 4.4));


        // anonima
        Runnable print = () -> System.out.println(" teste funcao anonima");
        print.run();


        List<String> nomes = Arrays.asList("Jessica", "Kalled", "Pedro", "Luan");
        nomes.forEach(nome -> System.out.println(nome));

    }

    // Recursiva
    public static int funcaoRecursiva(int n){
        if(n == 1){
            return n;
        } else{
            return n + funcaoRecursiva( n -1);
        }
    }

    // Overloanding
    public static int soma(int a, int b){
        return a + b;
    }
    public static int soma(int a, int b, int c){
        return a + b + c;
    }
    public static double soma(double a, double b){
        return a + b;
    }


}
