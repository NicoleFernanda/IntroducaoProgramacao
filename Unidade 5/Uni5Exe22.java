import java.util.Scanner;

/*
Um funcionário recebe aumento anual. 
Em 1995 foi contratado por 2000 reais. - por mes i == 0 
Em 1996 recebeu aumento de 1.5%. i == 1
A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. i >= 2
Faça programa que determine o salário atual do funcionário.
*/

public class Uni5Exe22 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double anual = 24000, mensal = 2000, aumento = 0;
        int ano = 1995;
        
        while (ano > 1994) {
            System.out.println("no ano de " + ano + " o salario do funcionario foi de = " + anual); //i == 0
            
            ano++;
            if (ano == 1996) {
                aumento = mensal * 0.015;
                anual = (aumento + mensal) * 12;
            } else {
                aumento *= 2;
                anual = (aumento + mensal) * 12;
                anual = (aumento + mensal) * 12;
            }
            
            System.out.println("quer parar? (1 - sim     0 - nao)");
            int parar = tec.nextInt();
            if (parar == 1) {break;}
            else {continue;}
        
        }
    
        tec.close();
    }
    
}
