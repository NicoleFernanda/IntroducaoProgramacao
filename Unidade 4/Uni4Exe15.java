/*               || ou          && e 
Elabore um algoritmo para exibir o valor de -reajuste- que um funcionário receberá no seu salário. 
A empresa irá conceder 5% de reajuste para o funcionário que for admitido há menos de 12 meses. 
Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. O seu algoritmo deve solicitar ao usuário
que digite a quantidade de meses que o funcionário foi admitido.
*/

import java.util.Scanner;
public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //entradas
        System.out.println("Digite a quantidade de meses que o funcionário foi admitido: ");
        int meses = teclado.nextInt();
        
        //processamento e saida                       perguntar: o que colocar se colocarem mais de 48 meses e se vai ter
        if (meses <= 12 && meses > 0) {
            System.out.println("Reajuste de 5%");
        } else if (meses > 12 && meses <= 48 && meses > 0) {
            System.out.println("Reajuste de 7%");
        }


        teclado.close();
    }
}
