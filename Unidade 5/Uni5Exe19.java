import java.util.Scanner;

/*
Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da 
compra efetuada. O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja 
menor ou igual. Descreva um algoritmo que leia o valor da compra e escreva o total a pagar a cada compra. 
Informe também o valor total recebido pela loja ao final do dia. A leitura deve ser finalizada com a leitura
0 para o valor da compra.
*/

public class Uni5Exe19 {
    public static void main(String[] args) {
        int i = 1;
        Scanner tec = new Scanner(System.in);

        while (i >= 1) {
            System.out.println("valor da compra       ["+i+"]");
            double valor = tec.nextDouble();
            double total, desconto;

            if (valor >= 0) {
                if (valor == 0) {
                    break;
            
                } else if (valor <= 500) {
                    desconto = 0.15;
                } else {
                    desconto = 0.2;
                }

                total = valor - (desconto * valor);
                System.out.println("total a pagar = " + (total)); 

            } else {
                System.out.println("valor invalido");
                continue;
            }
        
        i++;
        }
    
     tec.close();
    }
    
}
