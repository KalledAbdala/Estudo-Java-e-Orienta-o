package secao8;

public class FuncaoB {
    public static void main(String[] args) {

        verificarAutenticacao("ADM","Senha#123");



        String p1 = verificarAcesso(18, true, true);
        String p2 = verificarAcesso(17, false, false);
        String p3 = verificarAcesso(18, true, false);

        System.out.println("Primeira pessoa: " + p1);
        System.out.println("Segunda pessoa : " + p2);
        System.out.println("Terceira pessoa: " + p3);


        System.out.println(obterDiaDaSemana(4));


        
    }

    public static String verificarAcesso(int idade, boolean temCarteira, boolean temHistoricoNegativo){

        if (idade >= 18 && temCarteira && !temHistoricoNegativo) {
            return "Parabens vc esta em dia com o Detran";
        } else if (idade >= 18 && temCarteira && temHistoricoNegativo) {
            return "Meu mano, vc tem o historico negativo com o Detran";
        } else {
            return "Vc nao tem os requisitos com Detran";
        }

    }

    

    public static String obterDiaDaSemana(int dia){
        switch (dia) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terca-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sabado";
            default:
                return "Dia invalido";
        }
    }

    /**
     * Verifica se a senha e o usuario sao os mesmos anteriores
     * @param usuario nome do usuario digitado anteriormente 
     * @param senha senha digitada pelo usuario anteriormente 
     */
    public static void verificarAutenticacao(String usuario, String senha){
        if (!usuario.equals("ADM") && !senha.equals("Senha#123")){
            System.out.println("Autenticacao falhou!");
            System.exit(1);
        }
        System.out.println("Autenticacao bem sucedida!!");
    }

}
