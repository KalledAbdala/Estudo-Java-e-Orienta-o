package secao5;

public class condicionais {

    public static void main(String[] args) {
        
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue);
        System.out.println(isFalse);



        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1 == str2);
        System.out.println(str1 == "Java");

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));
        System.out.println(str1.equals("Java"));

        String str3 = "JaVa";

        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equals(str3));



        int num = 10;

        if (num > 5){
            System.out.println("O numero e maior que 5");
        }

        String texto = "Marisa";
        if (texto.equals("Marisa")){
            System.out.println("O texto e: " + texto);
        }else if (texto == ("Kalled")){
            System.out.println("O texto e: " + texto);
        } else{
            System.out.println("Nao e nao mano");
        }
        
        int q = 11;
        if(q > 10){
            System.out.println("Q e maior q 10");
        } else{
            System.out.println("Insira um numerro maior q 10");
        }


        double nota = 6;
        if(nota == 7){
            System.out.println("Vc esta na media e passou!!");
        } else if(nota == 9){
            System.out.println("Vc tirrou uma nota alta!! Parabens!!");
        } else if (nota == 10){
            System.out.println("Vc tirou a nota maxima PARABENS!!!");
        } else{
            System.out.println("Estude mais, vc n passou :( ");
        }


    }
}
