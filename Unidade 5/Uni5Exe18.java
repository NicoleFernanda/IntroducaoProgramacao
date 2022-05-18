import java.util.Scanner;
public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        byte canal = 0;

        int i = 1;
        
        double audiencia4 = 0, audiencia5 = 0, audiencia9 = 0, audiencia12 = 0, pessoas = 0;
        
        int individuos;

        while (i >= 1) {
            System.out.println("qual canal vc assistiu? (4,5,9,12 e 0)      ["+i+"]");
            canal = tec.nextByte();

            System.out.println("numero de pessoas assistindo             ["+i+"]");
            individuos = tec.nextInt();
            
            if (canal == 0 && individuos == 0) {
                System.out.println("televisao desligada");
                continue;
            } else if (canal == 0 && individuos != 0) {
                System.out.println("terminar loop");
                System.out.println("publico acima desconsiderado na estatistica");
                break;
            }

            switch (canal) {
                case 4:
                    audiencia4+= individuos;
                break;
                
                case 5:
                    audiencia5+= individuos;
                break;
                
                case 9:
                    audiencia9+= individuos;

                break;
                    
                case 12:
                    audiencia12+= individuos;
                break;
                
                default:
                    individuos = 0 ;

                    break;
                }
                          
                i++;
            }

            pessoas += audiencia4 + audiencia5 + audiencia9 + audiencia12; 
            audiencia4 = audiencia4 * 100/pessoas;
            audiencia5 = audiencia5 * 100/pessoas;
            audiencia9 = audiencia9 * 100/pessoas;
            audiencia12 = audiencia12 * 100/pessoas;
            System.out.println();
            System.out.println("percentual de audiencia do canal 4 = " + audiencia4+ "%");
            System.out.println("percentual de audiencia do canal 5 = " + audiencia5+ "%");
            System.out.println("percentual de audiencia do canal 9 = " + audiencia9+ "%");
            System.out.println("percentual de audiencia do canal 12 = " + audiencia12+ "%");
            

            tec.close();
        
        
        
        
        
        
        }

        
    }
    

