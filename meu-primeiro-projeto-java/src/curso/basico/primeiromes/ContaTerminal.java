package curso.basico.primeiromes;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[]arStrings){

        Scanner scanner=new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor,digite o número da Agência! ");
        int Numero_Agencia=scanner.nextInt();

        System.out.println("Por favor,digite sua Agência! ");
        String Agencia=scanner.next();

        System.out.println("Por favor,digite seu Nome! ");
        String nome=scanner.next();

        System.out.println("Por Fim,digite seu Saldo! ");
        double Saldo=scanner.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco,sua agência é "+Agencia+",conta "+Numero_Agencia+",e seu saldo "+Saldo+" já está diponivel para saque");

    }
    
}
