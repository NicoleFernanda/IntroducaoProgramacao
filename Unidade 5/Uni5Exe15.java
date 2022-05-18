import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
    
        int i = 1;
        while (i >= 1) {
            System.out.println("nome do(a) aluno(a) " + i + ":");
            String nome = tec.next();

            if (nome.equalsIgnoreCase("fim")) {
                System.out.println("fim");

                break;

            }

            System.out.println("nota da prova 1:");
            double prova1 = tec.nextDouble();
            System.out.println("nota da prova 2: ");
            double prova2 = tec.nextDouble();



            double media = (prova1 + prova2) / 2;
            
            System.out.println("a media do aluno(a) " + nome + " foi " + media);

        
            
            i++;
            
        }



        tec.close();
    
    
    }
    
}
