// Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
//o valor que recebe por hora e calcular o salário desse funcionário. A seguir, 
//mostre o número e o salário do funcionário, com duas casas decimais.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercício6 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Indique seu número de funciorário:  ");
            int nf = teclado.nextInt();
            System.out.print("Indique o número de horas diárias trabalhadas: ");
            float hr = teclado.nextFloat();
            System.out.print("Indique o valor por hora trabalhada:  ");
            float vlr = teclado.nextFloat();
            float salario = (hr * vlr);

            DecimalFormat F = new DecimalFormat ("0.00");
            System.out.println("Funcionário " + nf);
            System.out.println("Seu salário é: " + F.format(salario));
        
        teclado.close();
        }
    }
}
