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

        String texto = "Kalled";
        if (texto.equals("Kalled")){
            System.out.println("O texto e: " + texto);
        }
        
    }
}
