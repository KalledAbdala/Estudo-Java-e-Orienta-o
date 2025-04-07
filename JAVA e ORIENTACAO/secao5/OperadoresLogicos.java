package secao5;

public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        int idade = 18;
        boolean cateiraDeMotora = true;

        if(idade >= 18 && cateiraDeMotora){
            System.out.println("---------------------------------------");
            System.out.println("Direito de direcao");
        } else{
            System.out.println("---------------------------------------");
            System.out.println("Vc nao possui o direrito de direcao");
        }
        


       
        boolean jogaMine = true;
        boolean jogaVava = true;
        boolean jogaDarkSouls =  true;
        
        if(jogaDarkSouls && jogaMine && jogaVava){
            System.out.println("VC EH UM DEUS GAMER");
        } else if (jogaDarkSouls || jogaMine || jogaVava){
            System.out.println("Vc eh gamer");
        } else{
            System.out.println("Vc eh NADA");
        }

        
        // Not

        boolean estaChovendo = true;
        boolean temGuardaChuva = true;

        System.out.println(!estaChovendo || !temGuardaChuva);
        System.out.println(!(!estaChovendo || !temGuardaChuva));








    }

}
