import java.util.Scanner;

/*
Um funcionário recebe aumento anual. 
Em 1995 foi contratado por 2000 reais. - por mes i == 0 
Em 1996 recebeu aumento de 1.5%. i == 1
A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. 
Faça programa que determine o salário atual do funcionário.
*/

public class Uni5Exe22 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        double taxa = 1.5/100;
        double mensal = 2000;
        double anual = 0;

        for (int i = 1996; i <= 2022; i++) {
            
            if (i == 1996) {
                mensal = (mensal * taxa) + mensal; 
            } else {
                mensal = (mensal * taxa) + mensal;
            }
            
            taxa = taxa * 2;
        }
        anual = mensal * 12;
        System.out.println("o salario mensal em 2022 sera de R$: " + mensal);
        System.out.println("o salario anual em 2022 sera de R$: " + anual);
        tec.close();
    }
    
}
