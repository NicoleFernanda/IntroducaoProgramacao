//Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele 
//no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
//informar o total a receber no final do mês, com duas casas decimais.


import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe07 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
        
            System.out.println("Informe o nome do funcionário: ");
            String nomeFuncionario = teclado.nextLine();
            
            System.out.println("Informe o salário fixo: ");
            double salario = teclado.nextDouble();
            
            System.out.println("Informe o total de vendas: ");
            double totalVendas = teclado.nextDouble();
        

            DecimalFormat F = new DecimalFormat ("0.00");
            double valorfinal = salario * (totalVendas * 0.15);

            System.out.print("O funcionário " +  nomeFuncionario + " recebe " + F.format(valorfinal));
        
        
        
        }
    
}
}