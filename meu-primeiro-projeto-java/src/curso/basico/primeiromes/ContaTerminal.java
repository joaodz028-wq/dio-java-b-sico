package curso.basico.primeiromes;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[]argStrings){

        Scanner scanner= new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor,digite o número da Agência! ");
        int Numero_Agencia=scanner.nextInt();

        System.out.println("Por favor,digite sua Agência! ");
        String Agencia=scanner.next();

        System.out.println("Por favor,digite seu Nome! ");
        String Nome_Usuario=scanner.next();

        System.out.println("Por Fim,digite seu Saldo! ");
        double Saldo=scanner.nextDouble();

        System.out.println("Olá "+Nome_Usuario+",obrigado por criar uma conta em nosso banco,sua agência é "+Agencia+",conta "+Numero_Agencia+",e seu saldo "+Saldo +" já está disponivel para saque");
    }
    }
