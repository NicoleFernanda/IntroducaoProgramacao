/* Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a partir de um menu de opções:

se opção = 1, escreva os 3 valores em ordem crescente
se opção = 2, escreva os 3 valores em ordem decrescente
se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio*/
import java.util.Scanner; 
public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //entradas
        System.out.println("Escolha 3 valores numéricos: ");
        float x = teclado.nextFloat();
        float y = teclado.nextFloat();
        float z = teclado.nextFloat();
        
        System.out.println("Sabendo que: " + "\nopção = 1, escreve os 3 valores em ordem crescente;" 
        + "\nopção = 2, escreve os 3 valores em ordem decrescente; e" 
        + "\nopção = 3, escreve os 3 valores de forma que o maior valor fique no meio. " + "\nEscolha uma opção:");
        int opcao = teclado.nextInt();

        //processamento e saidas
        
       switch (opcao) {
           
            case 1://ordem crescente
                if (x > y && x > z) {//x maior
                    if (y > z) { // z é o menor
                    System.out.println(z + " , " + y + " , " + x);
                
                    } else if (z > y) { //y menor
                    System.out.println(y + " , " + z + " , " + x);

                    }
            
                
                } else if (y > z && y > x) { //y maior
                    if (x > z) { //z menor
                    System.out.println(z + " , " + x + " , " + y);

                    } else if (z > x) { //x menor
                    System.out.println(x + " , " + z + " , " + y);

                    }
            
                
                } else if (z > x && z > y) { //z maior
                    if (x > y) { //y menor
                    System.out.println(y + " , " + x + " , " + z);
                    
                    } else if (y > x) { //x menor
                    System.out.println(x + " , " + y + " , " + z);
                    }
            
                }
                
                break;

            
            
            case 2 : //ordem descrescente
                if (x > y && x > z) { //x maior
                    if (y > z) { // z é o menor
                    System.out.println(x + " , " + y + " , " + z);
            
                    } else if (z > y) { //y menor
                    System.out.println(x + " , " + z + " , " + y);

                    }
        
            
                } else if (y > z && y > x) { //y maior
                    if (x > z) { //z menor
                    System.out.println(y + " , " + x + " , " + z);

                    } else if (z > x) { //x menor
                    System.out.println(y + " , " + z + " , " + x);

                    }
        
            
                } else if (z > x && z > y) { //z maior
                    if (x > y) { //y menor
                    System.out.println(z + " , " + x + " , " + y);
                    
                    } else if (y > x) { //x menor
                    System.out.println(z + " , " + y + " , " + x);
                    
                    }
        
                }
                
                break;



            case 3 : //maior no meio              !!!só precisa determinar qual é o maior numero
            if (x > y && x > z) { //x maior
            
                System.out.println(y + " , " + x + " , " + z);        
            
            
            } else if (y > z && y > x) { //y maior
                System.out.println(z + " , " + y + " , " + x);

            
            
            } else if (z > x && z > y) { //z maior
                System.out.println(x + " , " + z + " , " + y);

            }
            
            break;

            default:
               break;
       }
       
       
       

    teclado.close();
    
    }   
}
