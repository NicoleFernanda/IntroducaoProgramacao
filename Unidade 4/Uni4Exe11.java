/*Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma mensagem que indique se eles são 
TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro 
diferente dos demais, e apenas irmãos se todas as idades forem diferentes.

*/ 
import java.util.Scanner;
public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        //entradas
        System.out.println("Insira o ano de nascimento do primeiro irmão: ");
        int primeiro = tec.nextInt();
        System.out.println("Insira o ano de nascimento do segundo irmão: ");
        int segundo = tec.nextInt();
        System.out.println("Insira o ano de nascimento do terceiro irmão: ");
        int terceiro = tec.nextInt();
        
        //processamento
        if ((primeiro == segundo) && (segundo == terceiro)) { //todas idades iguais
            System.out.println("TRIGÊMEOS!");
        
        } else if ((primeiro == segundo) || (primeiro == terceiro) || (segundo == terceiro)) {
            System.out.println("GÊMEOS!"); //podem ser gemeos
        
        } else { //e se nao, serao irmaos
            System.out.println("IRMÃOS!");
        } 
        
        tec.close(); 
    
    } 
       
}
