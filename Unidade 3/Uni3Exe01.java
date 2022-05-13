import java.util.Scanner;

/* Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler as dimensões de um terreno e 
depois exibir a área do terreno.
- ENTRADAS
largura e comprimento
- PROCESSAMENTO
area = comprimento * largura
- SAIDAS
área
*/

public class Uni3Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a largura: ");
        double largura = teclado.nextDouble();
        System.out.println("Informe o comprimento: ");
        double comprimento = teclado.nextDouble();
        double area = largura * comprimento;

        System.out.println("Área é: " + area);

        teclado.close();

    }
    
}
