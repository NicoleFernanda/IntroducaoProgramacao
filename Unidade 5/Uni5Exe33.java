import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int i = 1, voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, nulos = 0, branco = 0;
        double total;
        do {
            System.out.println("seu voto: ");
            byte voto = tec.nextByte();

            switch (voto) {
                case 1:
                    voto1 += 1;
                    break;
                
                case 2:
                    voto2 += 1;
                    break;
                    
                case 3:
                    voto3 += 1;
                    break;
                    
                case 4:
                    voto4 += 1;
                    break;
                    
                case 5:
                    nulos += 1;
                    break;
                
                case 6:
                    branco += 1;
                    break;
            
                default:
                    break;
            }
            System.out.println("mais um voto? 1.sim/2.nao");
            i = tec.nextInt(); 
            if (i == 1) {continue;} 
            else {
                total = voto1 + voto2 + voto3 + voto4 + nulos + branco;
                System.out.println("\nvotos para candidato 1 = " + voto1 + "\nvotos para candidato 2 = " + voto2 + "\nvotos para candidato 3 = " + voto3
                + "\nvotos para candidato 4 = " + voto4);
                System.out.println("total de votos nulos = " + nulos + "\n" + "percentual de votos nulos = " + (nulos/total *(100)) + "%");
                System.out.println("total de votos em branco = " + branco + "\n" + "percentual de votos em branco = " + (branco/total *( 100)) + "%");
                break;}

        } while (i == 1);

        tec.close();
    }
    
}
