import java.util.Locale;
import java.util.Scanner;

public class Classe {
    public static void main(String[]arasStrings){
      

        Scanner scanner= new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome=scanner.next();

        System.out.println("Digite sua idade");
        int idade=scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura=scanner.nextDouble();

        

        System.out.println("Olá me chamo " + nome);
        System.out.println("Tenho " + idade +" Anos ");
        System.out.println("Minha altura é " + altura +"cm " );
    }

    
}
