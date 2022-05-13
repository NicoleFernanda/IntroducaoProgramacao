//Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares 
//para o atendente. Considerando que o atendente tem a cotação do dólar, calcule quantos reais o atendente 
//deve devolver para a pessoa.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercício9 {
public static void main(String[] args) {
    //decidi colocar 4 casas decimais.
    //sabendo que o dólar hoje (15/03/22) está 5,13 reais. 
    DecimalFormat F = new DecimalFormat("0.000");
    Scanner entrada = new Scanner(System.in);
    System.out.print("Informe a quantidade de dólares que deseja trocar por reais: ");
    float quant = entrada.nextFloat();
    float reais = (quant * 5.13f);
    //saída
    System.out.print(quant + " dólares equivale à " + F.format(reais) + " reais hoje.");

entrada.close();

}
    
}