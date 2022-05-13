/*O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal.
O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, onde a massa está em quilogramas
e a altura está em metros.

< 18.5	Magreza
18.5 - 24.9	Saudável
25.0 - 29.9	Sobrepeso
30.0 - 34.9	Obesidade Grau I
35.0 - 39.9	Obesidade Grau II (severa)
>= 40.0	Obesidade Grau III (mórbida)

*/

import java.util.Scanner;
public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //entradas
        System.out.println("Insira sua massa corporal (em quilogramas): ");
        float massa = teclado.nextFloat();

        System.out.println("Insira a sua altura (em metros) : ");
        float altura = teclado.nextFloat();

        //processamento
        float imc = (massa)/(altura * altura);
        System.out.println(imc);

        if (imc < 18.5) {
            System.out.println("Magreza");
        
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Saudável");

        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");

        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");

        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (severa)");
        
        } else { //imc maior ou igual a 40
            System.out.println("Obesidade Grau III (mórbida)");
        }
        
        teclado.close();
    }
    
}
