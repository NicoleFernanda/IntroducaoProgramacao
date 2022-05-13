/*Um motorista deseja abastecer seu tanque de combustível. 
Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento e exibir quantos litros 
ele conseguiu colocar no tanque.

*/
import java.util.Scanner;
public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o preço da gasolina por litro: ");
        float gasolina = teclado.nextFloat();
        System.out.print("Insira o pagamento: ");
        float pagamento = teclado.nextFloat();
        float total = pagamento/gasolina;
        System.out.print("Conseguistes colocar " + total + " litros no seu tanque");

        teclado.close();
    }

    
}
