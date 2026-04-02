package curso.basico.primeiromes;
public class teste {
    public static void main(String[]aStrings){
        String primeiroNome ="João";
        String segundoNome="Augusto";

        String nomeCompleto=nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    
    }
    public static String nomeCompleto(String primeiroNome,String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
