package curso.basico.primeiromes;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado=formatarCep("069882383");
            System.out.println(cepFormatado);
        } catch (CepinvalidoExcecao e) {
            System.out.println("O cep não corresponde com a regra de negocio!");;
        }
    }
    static String formatarCep(String cep)throws CepinvalidoExcecao{

    
        if(cep.length()!=8)
            throw new CepinvalidoExcecao();


        return "069.882-38";
     }

}
