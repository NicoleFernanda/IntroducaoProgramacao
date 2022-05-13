/*                   || ou          && e 
Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda anual e o número de dependentes do
contribuinte. A renda líquida é calculada sobre a renda anual com um desconto de 2% para cada dependente do contribuinte.
O contribuinte com uma renda líquida de até R$ 2.000,00 não paga imposto. Para aqueles que possuem renda líquida entre 
R$ 2.000,00 e R$ 5.000,00 o imposto é de 5% sobre o valor da renda líquida; para rendas líquidas de R$ 5.000,00 até
R$ 10.000,00 é de 10%. Rendas superiores a R$ 10.000,00 pagam 15% de imposto.

*/
import java.util.Scanner;
public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //entradas
        System.out.println("Informe a renda anual: ");
        double renda = teclado.nextFloat();
        System.out.println("Informe o número de dependentes do contribuinte: ");
        int dependentes = teclado.nextInt();
        
        
        double imposto = 0;
        double pagar = 0;

        //processamento 
        if (renda <= 2000) { //menor ou igual a 2K
            System.out.println("Não paga imposto");

        } else if (renda > 2000 && renda < 5000) { //entre 2K e 5K, 5% sobre o valor
            imposto = (renda * 0.05);
            pagar = (imposto - (imposto * dependentes * 0.02));
            System.out.println("O imposto é de 5% sobre o valor e o total a pagar é: " + pagar);

        } else if (renda >= 5000 && renda <= 10000) { //entre 5K e 10K, 10% sobre o valor
            imposto = (renda * 0.1);
            pagar = (imposto - (imposto * dependentes * 0.02));
            System.out.println("O imposto é de 10% sobre o valor e o total a pagar é: " + pagar);

        } else { //maior que 10K, 15% sobre o valor 
            imposto = (renda * 0.15);
            pagar = (imposto - (imposto * dependentes * 0.02));
            System.out.println("O imposto é de 15% sobre o valor e o total a pagar é: " + pagar);
        }

        teclado.close();
    }
    
}
