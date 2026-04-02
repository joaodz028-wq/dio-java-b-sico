package curso.basico.primeiromes;

public class UsúarioDaSmartv {
    public static void main(String[]argStrings) throws Exception{
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? "+ smartTv.ligada);
        System.out.println("Canal Atual: "+smartTv.canal);
        System.out.println("Volume Atual: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada? "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada? "+smartTv.ligada);


        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo volume -> Volume Atual: "+smartTv.volume);

        smartTv.mudardeCanal();
        System.out.println("Canal Atual: "+smartTv.canal);

        smartTv.EscolherCanal(15);
        System.out.println("Canal Atual: "+smartTv.canal);




    }
    
}
