package curso.basico.primeiromes;

public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando Volume para: "+volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo Volume para: "+volume);
    }
    public void mudardeCanal(){
        canal++;

    }
        public void voltarCanal(){
            canal--;
        }
        public void EscolherCanal(int NovoCanal){
            canal=NovoCanal;
        }
    }


    
    

