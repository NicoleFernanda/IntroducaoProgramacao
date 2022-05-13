/*Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M' escreva “Masculino”. Se for digitada a letra 'F'
 escreva “Feminino”. Se for informado 'I' escreva “Não Informado”. Qualquer outra letra digitada escreva “Entrada 
 Incorreta”. Atenção: antes de testar a letra, converta-a para maiúscula.*/
import java.util.Scanner;
public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //entrada
        System.out.println("Digite um caractere:");
        char letra = teclado.next().charAt(0);
        letra = Character.toUpperCase(letra); //torna a carcatere maiusculo
        
        if ('F' == letra) {
            System.out.println("Mulher");

        } else if ('M' == letra) {
            System.out.println("Homem");
                    
        } else if ('I' == letra) {
            System.out.println("Não Informado");
        
        } else {
            System.out.println("Entrada Incorreta");

        }
    
        teclado.close();    
    }

}

