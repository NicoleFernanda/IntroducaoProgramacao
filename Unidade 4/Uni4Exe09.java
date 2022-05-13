//            || &&
//Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não
import java.util.Scanner;
public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //entradas
        System.out.println("Informe um valor inteiro: ");
        int valorUM = tec.nextInt();
        System.out.println("Informe outro valor inteiro: ");
        int valorDOIS = tec.nextInt();
       
       //processamento e saida
        float opcao1 = valorUM % valorDOIS; //se der 0, significa que o valor 1 é múltiplo do valor 2
        float opcao2 = valorDOIS % valorUM; //se der 0, significa que o valor 2 é múltiplo do valor 1
       
        //EXEMPLO: 5 % 15 = 5,        mas        15 % 5 = 0,       logo, são múltiplos e a ordem não importa

        if (opcao1 == 0.0 || opcao2 == 0.0) {
            System.out.println("Os números são múltiplos");
        } else {
            System.out.println("Os números não são múltiplos");
        }


        tec.close();
    }
    
}
