import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        int i = 1;
        String nome = "";
        Scanner tec = new Scanner(System.in);
        while (i >= 1) {

            if (i == 1) {
                System.out.println("nome do funcionario: ");
                nome = tec.next();
            }
            System.out.println("preco do produto: ");
            double preco = tec.nextDouble(), quantidade;
            System.out.println("quantidade do produto: ");
            quantidade = tec.nextDouble();
            
            System.out.println("deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            char resposta = tec.next().charAt(0);
            if (resposta == 's') {
                System.out.println("nome = " + nome);
                System.out.println("total de vendas (em R$) = " + (preco * quantidade));
                System.out.println("salario = " + (0.3 * preco * quantidade));
                i = 0;
            
            } else if (resposta == 'n') {
                System.out.println("deseja parar?     s (SIM) / n (NÃO)?");
                resposta = tec.next().charAt(0);

                if (resposta == 's') { break;} 
                else if (resposta == 'n') {
                    i++;
                    continue;
                }
            
            }
        
        
            i++;
        }
    
        tec.close();
    }
    
}
