package curso.basico.primeiromes;

public class PilhadeExecucao {
    public static void main(String[] args) {
      System.out.println("Iniciou o programa método main.");
       a();
       System.out.println("Finalizou o programa método main.");

    }
    static void a(){
        System.out.println("Iniciou o método a.");
        b();
        System.out.println("Finalizou o método a.");

    }
    static void b(){
        System.out.println("Iniciou o método b.");
        for(int x=0;x<=4;x++)System.out.println(x);
        c();
        System.out.println(("Finalizou o método b."));
    }
    static void c(){
        System.out.println("Iniciou o método c.");
        //Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}
