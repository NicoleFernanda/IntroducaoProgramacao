import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int i = 1, dia;
        double manha, tarde, soma, valor;

        while (i == 1) {
            System.out.println("dia do mes de abril: ");
            dia = tec.nextInt();

            if (dia > 0 && dia < 31) {
                System.out.println("total de peças produzidas no turno da manha: ");
                manha = tec.nextDouble();
                System.out.println("total de peças produzidas no turno da tarde: ");
                tarde = tec.nextDouble(); 
                soma = manha + tarde;
                
                if (dia <= 15 && soma > 100 && (tarde > 30 && manha > 30)) {
                    valor = soma * 0.8;
                } else if (dia <= 15) {
                    valor = soma * 0.5;
                } else {//dia > 15      
                    valor = (manha * 0.4) + (tarde * 0.3);
                }
            
                System.out.println("dia = " + dia); System.out.println("manha = " + manha); 
                System.out.println("tarde = " + tarde); System.out.println("R$ " + valor + " (valor recebido)");
                System.out.println("\nnovo funcionario? 1.sim/2.nao");
                dia = tec.nextInt();

                if (dia == 1) {continue;} else {break;}
                
            
            }
        
        
        }

        tec.close();
    }
    
}
