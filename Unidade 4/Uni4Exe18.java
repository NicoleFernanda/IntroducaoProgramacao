/*|| ou          && e 
Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até o dia do vencimento, 

o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. 
Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto, 
e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% 
por cada dia de atraso. 

Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e 
calcule o valor a ser pago pelo cliente, exibindo as devidas mensagens. Suponha que todo vencimento ocorre até o dia 
dez de cada mês e os clientes nunca deixam para pagar no mês seguinte.
*/
import java.util.Scanner;
public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //entradas
        System.out.println("Dia de vencimento:");
        int vencimento = teclado.nextInt();

        System.out.println("Dia do pagamento:");
        int pagamento = teclado.nextInt();

        System.out.println("Valor do produto:");
        float produto = teclado.nextFloat();
        
        //processamento e saida
        int dias = vencimento - pagamento;   //quantos dias antes ou depois da data de vencimento o valor foi pago


        if (dias >= 0) {  //ate a data do vencimento, desconto de 10%
            double pagar = (produto - (produto * 0.1));
            System.out.println("Pagamento em dia!");
            System.out.println("O valor a ser pago é de R$: " + pagar);

        } else if (dias < 0 && dias >= -5 ) { //ate cinco dias depois, sem desconto e sem multa
            float pagar = produto;
            System.out.println("Não há desconto!");
            System.out.println("O valor a ser pago é de R$: " + pagar);

        } else {
            int diasPositivos = dias * (-1); //descobrir a quantidade de dias sem estar um numero negativo
            int diasAtraso = diasPositivos - 5; //quantos dias depois dos cinco dias (sem multa) vai receber multa
            double pagar = (produto + (produto * diasAtraso * 0.02));
            System.out.println("Recebe multa!");
            System.out.println("O valor a ser pago é de R$: " + pagar);

        }

        teclado.close();
    }
    
}
