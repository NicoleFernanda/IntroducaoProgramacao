/*O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com peso superior pagam um adicional de R$ 0,45 
por cada 20 gramas, ou fração, em que excedem aquele peso. Escreva um algoritmo que dado o peso da carta, em gramas, 
determine o custo do selo.*/

import java.text.DecimalFormat;
import java.util.Scanner;
public class Uni4Exe07 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //entradas
        System.out.print("Entre com o peso da carta em gramas: ");
        float peso = teclado.nextFloat();
        double valorPagar = (0.45);
        
        //processamento e saida
        if (peso <= 50) {
            System.out.println("Custo do selo: " + valorPagar);
        
        } else{
            float pesoMais = peso - 50; //o que excedeu 50 gramas 
            double valor = (0.45 + (pesoMais * 0.0225)); //0.0225 = valor por grama
            DecimalFormat F = new DecimalFormat("0.00");
            System.out.println("Custo do selo: " + F.format(valor));
        }

        teclado.close(); 
        }
}