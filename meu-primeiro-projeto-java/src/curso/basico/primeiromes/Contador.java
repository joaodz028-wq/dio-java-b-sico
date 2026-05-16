package curso.basico.primeiromes;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro número:");
        int num1=scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2=scanner.nextInt();
       

        try{
            Contar(num1, num2);
             if(num1>num2){
            throw new ContadorExcecao();
        }
        

        }catch(ContadorExcecao ex){
            System.out.println("ERROR! O VALOR DO SEGUNDO NÚMERO TEM QUE SER MAIOR QUE O PRIMEIRO!");
        }
    }
    static void Contar(int num1,int num2)throws ContadorExcecao{
        int contar=num2-num1;
        for(int i=1;i<=contar;i++){
            System.out.println(i);
        }
    }
}
