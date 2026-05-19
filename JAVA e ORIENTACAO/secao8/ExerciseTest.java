public class ExerciseTest {
        public static void main(String[] args){
        
        System.out.println(verificarParOuImpar(10));
        System.out.println(verificarParOuImpar(7));
        System.out.println(verificarParOuImpar(0));

        System.out.println(verificarAnoBissexto(2020));
        
    }
    
    // impar e par
    public static String verificarParOuImpar(int n){
        if (n % 2 == 0){
            return "Número Par";
        } else{
            return "Número Ímpar";
        }
    }

    // ano bissexto
    public static String verificarAnoBissexto(int n){
        
        if(n % 4 == 0 && n % 100 != 0 || n % 400 == 0){
            return "Ano Bissexto";
        }else{
            return "Ano Não Bissexto";
        }

    }
}
