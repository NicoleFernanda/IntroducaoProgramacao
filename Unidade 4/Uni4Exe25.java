/*Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e execute a operação correspondente. 
O algoritmo deve exibir uma mensagem de erro se a opção for inválida. 
O menu tem as seguintes opções:
Escolha uma opção:
1 - Soma de dois números.
2 - Diferença entre dois números.
3 - Produto entre dois números.
4 - Divisão entre dois números (o denominador não pode ser zero). */
import java.util.Scanner;
public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //entradas
        System.out.println("Escolha uma opção:" +"\n1 - Soma de dois números." + "\n2 - Diferença entre dois números." 
        + "\n3 - Produto entre dois números." + "\n4 - Divisão entre dois números (o denominador não pode ser zero)");

        int opcao = teclado.nextInt();


        //processamento e saidas
        switch (opcao) {
            case 1: //soma
                System.out.println("Escolha dois números para somá-los");
                float a = teclado.nextFloat();
                float b = teclado.nextFloat();
                float soma = a + b;

                System.out.println("A soma dos dois números escolhidos é: " + soma);
                break;
            
                case 2: //subtração
                System.out.println("Escolha dois números para subtrai-los");
                float c = teclado.nextFloat();
                float d = teclado.nextFloat();
                float subtracao = c - d;

                System.out.println("A subtração dos dois números ecolhidos é: " + subtracao);
                break;
            
                case 3: //produto
                System.out.println("Escolha dois números para multiplicá-los");
                float e = teclado.nextFloat();
                float f = teclado.nextFloat();
                float produto = e * f;

                System.out.println("O produto dos dois números escolhidos é: " + produto);
                break;
            
                case 4: //divisão
                System.out.println("Escolha dois números para dividi-los" + "\nO numerador:");
                float numerador = teclado.nextFloat();
                System.out.println("O denominador (não pode ser zero):");
                float denominador = teclado.nextFloat();
                float divisao = numerador / denominador;
            
                System.out.println("A divisão dos dois números escolhidos é: " + divisao);  
                break;
                
                default:
                System.out.println("Opção Inválida!");
                break;
        }
        teclado.close();
    
    }
    
}
