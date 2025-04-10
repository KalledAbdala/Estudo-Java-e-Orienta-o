package secao5;

public class CondicionaisDois {
    public static void main(String[] args) {

        int numero = 4;

        String resultado = (numero % 2 == 0)? "Par":"Impar";

        System.out.println(resultado);




        int idade = 17;
        boolean cateira = true;

        if (idade >= 18) {
            if (cateira == true) {
                System.out.println("Vc e apto para pilotar");
            } else{
                System.out.println("Vc n tem carteira para pilotar");
            }
        } else {
            System.out.println("Vc n e nem maior dee idade pae!!");
        }




        int idade1 = 67;
            
        if (idade1 < 18){
            System.out.println("Menor de idade");
        } else if (idade1 >= 18 && idade1 <= 64){
            System.out.println("Adulto");
        } else{
            System.out.println("Idoso");
        }
    }
}
