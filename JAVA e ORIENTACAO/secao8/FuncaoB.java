package secao8;

public class FuncaoB {
    public static void main(String[] args) {
        
        String p1 = verificarAcesso(18, true, true);
        String p2 = verificarAcesso(17, false, false);
        String p3 = verificarAcesso(18, true, false);

        System.out.println("Primeira pessoa: " + p1);
        System.out.println("Segunda pessoa : " + p2);
        System.out.println("Terceira pessoa: " + p3);
    }

    public static String verificarAcesso(int idade, boolean temCarteira, boolean temHistoricoNegativo){

        if (idade >= 18 && temCarteira && !temHistoricoNegativo) {
            return "Parabens vc esta em dia com o Detran";
        } if (idade >= 18 && temCarteira && temHistoricoNegativo) {
            return "Meu mano, vc tem o historico negativo com o Detran";
        } else {
            return "Vc nao tem os requisitos para o Detran";
        }

    }

}
