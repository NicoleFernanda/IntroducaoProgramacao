import java.util.Scanner;


public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        /*
        Para cada mercadoria (20) ele tem o nome, o preço de compra (PC) e o preço
        de venda (PV). 
        */

        //PERGUNTAR - pq nao pede o nome da mercadoria mais que uma vez;
        //RESPOSTA - coloquei next() ao inves de nextLine();

        double lucrototal = 0, lucro, soma = 0, compra, venda, vendatotal = 0, compratotal = 0;
        int dez = 0, dezvinte = 0, vinte = 0; //tipos de lucro (quantas mercadorias vao ter esses tipos de lucro)
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("nome da mercadoria " +i+ ":");
            String nome = tec.next();

            System.out.println("preço de compra da mercadoria " + i + ":");
            compra = tec.nextDouble();

            System.out.println("preço de venda da mercadoria " + i + ":");
            venda = tec.nextDouble();

            lucro = ((venda - compra)/compra * 100);
            lucrototal = venda - compra;
            soma += lucrototal;
            vendatotal += venda;
            compratotal += compra;

            if (lucro < 10) {
                dez++;
            } else if (lucro >= 10 && lucro <= 20 ) {
                dezvinte++;
            } else if (lucro > 20) {
                vinte++;
            }
        
        
        }
        
        System.out.println(dez + " mercadorias proporcionam lucro < 10%");
        System.out.println(dezvinte + " mercadorias proporcionam 20% <= lucro >= 10%");
        System.out.println(vinte + " mercadorias proporcionam lucro > 20% ");
        System.out.println("\nvalor total de compra das mercadorias = " + compratotal);
        System.out.println("valor total de venda das mercadorias = " + vendatotal);
        System.out.println("lucro total = " + soma);
        System.out.println();
        

        
        tec.close();
    
    
    }
    
}
