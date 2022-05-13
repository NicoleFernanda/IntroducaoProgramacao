import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //entradas 
        //dei nomes! para ficar mais facil
        System.out.println("Idade de um homem: ");
        int marcos = teclado.nextInt();
        System.out.println("Idade de outro homem: ");
        int paulo = teclado.nextInt();
        System.out.println("Idade de uma mulher: ");        
        int juliana = teclado.nextInt();
        System.out.println("Idade de outra mulher: ");
        int sheila = teclado.nextInt();
        

        //          soma : homem mais velho       +      mulher mais nova
        //          produto: homem mais novo      *      mulher mais velha

        if (marcos > paulo) { //marcos mais velho
            if (juliana > sheila) {  //juliana mais vleha
                int soma = marcos + sheila;               
                int produto = paulo * juliana; 
                System.out.println("A soma das idades do homem mais velho com a mulher mais nova é " + soma);
                System.out.println("O produto das idades do homem mais novo com a mulher mais velha é " + produto);

            } else { //sheila é mais velha
                int soma = marcos + juliana;               
                int produto = paulo * sheila;
                System.out.println("A soma das idades do homem mais velho com a mulher mais nova é " + soma);
                System.out.println("O produto das idades do homem mais novo com a mulher mais velha é " + produto); 
            }
        
        } else if (paulo > marcos) { //paulo mais velho
            if (juliana > sheila) { //juliana mais velha
                int soma = paulo + sheila;               
                int produto = marcos * juliana;
                System.out.println("A soma das idades do homem mais velho com a mulher mais nova é " + soma);
                System.out.println("O produto das idades do homem mais novo com a mulher mais velha é " + produto);

            } else { //sheila mais velha
                int soma = paulo + juliana;               
                int produto = marcos * sheila; 
                System.out.println("A soma das idades do homem mais velho com a mulher mais nova é " + soma);
                System.out.println("O produto das idades do homem mais novo com a mulher mais velha é " + produto);

            }
        }
        
        teclado.close();
    }
    
}
