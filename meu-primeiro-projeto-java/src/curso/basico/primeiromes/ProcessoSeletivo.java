package curso.basico.primeiromes;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
         String candidatos[]={"João","Igor","Lucas","Luan","Paulo"};
         for (String candidato : candidatos) {
            EntrandoemContato(candidato);

         }
    }
    static void EntrandoemContato(String candidato){
        int TentativasRealizadas=1;
        boolean continuarTentando=true;
        boolean atendeu=false;
        do{
            atendeu=atender();
            continuarTentando=!atendeu;
            if(continuarTentando){
                TentativasRealizadas++;
            }
            else{
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }

        }while(continuarTentando && TentativasRealizadas<3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM "+ candidato +" NA "+TentativasRealizadas+" TENTATIVA");
        }
        else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM "+candidato+", NÚMERO MAXIMO TENTAIVAS "+TentativasRealizadas+" REALIZADA");
        }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void ImprimirSelecionados(){
        String candidatos[]={"João","Igor","Lucas","Luan","Paulo"};
        System.out.println("Imprimindo os selecionados pelo seu indice");
        
        for(int indice=0;indice<candidatos.length;indice++){
            System.out.println("O cadidade de n "+(indice+1)+ " é o "+candidatos[indice]);
        }
        System.out.println("Forma abreviada de intereção for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi "+ candidato);
        }
    }

    static void selecaoCandidatos(){
        String[]candidatos={"João","Igor","Lucas","Luan","Gabriel","Augusto","Xavier","Paulo","Tonny"};
        int candidatosSelecionados=0;
        int candidatosAtual=0;
        double salarioBase=2000.0;
        while(candidatosSelecionados<5 && candidatosAtual <candidatos.length){
            String candidato=candidatos[candidatosAtual];
            double salarioPretendido=valorPretendido();
            System.out.println("O candidato "+ candidato + " Solocitou este valor de salário " + salarioPretendido);
            if(salarioBase>=salarioPretendido){
                System.out.println("O candidato "+ candidato + " Foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

  static void analisarCandidato(double salarioPretendido){
    double salarioBase=2000.0;
    if(salarioBase>salarioPretendido){
        System.out.println("LIGAR PARA O CANDIDATO!");
    }
    else if(salarioBase==salarioPretendido){
        System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA!");
    }
    else{
        System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS!");
    }
    }
}