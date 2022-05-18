import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int i = 1, soma1 = 0, soma2 = 0, soma3 = 0, soma4 = 0, total = 0;
        String vencedor = ""; 
        byte voto;

        while (i >= 1) {
            System.out.println("sabendo que: \n1 - Nenhum de Nós \n2 - CPM22 \n3 - Skank \n4 - Jota Quest \nescolha seu voto");
            voto = tec.nextByte();

            switch (voto) {
                case 1:
                    soma1 += 1; //testar depois com soma++
                    break;
                
                case 2:
                    soma2 += 1;
                    break;
                    
                case 3:
                    soma3 += 1;
                    break;
                
                case 4:
                    soma4 += 1;
                    break;
            
                default:
                    break;
            }

            System.out.println("mais um voto? s(SIM)/n(NAO)");
            char resp = tec.next().charAt(0);
            if (resp == 's') {continue;}
            else {
                total = soma1 + soma2 + soma3 + soma4; //total de votos
                System.out.println("votos para Nenhum de Nos = " + soma1 + "\npercentual Nenhum de Nos = " + (soma1 * 100/total)+ "%"); 
                System.out.println("votos para CPM22 = " + soma2 + "\npercentual CPM22 = " + (soma2 * 100/total) + "%"); 
                System.out.println("votos para Skank = " + soma3 + "\npercentual Skank = " + (soma3 * 100/total)+ "%"); 
                System.out.println("votos para Jota Quest = " + soma4 + "\npercentual Jota Quest = " + (soma4 * 100/total)+ "%");
                //percentual (variavel total) e vencedor
                if (soma1 > soma2 && soma1 > soma3 && soma1 > soma4) {vencedor = "Nenhum de Nos"; }
                if (soma2 > soma1 && soma2 > soma3 && soma2 > soma4) {vencedor = "CPM22"; }
                if (soma3 > soma1 && soma3 > soma2 && soma3 > soma4) {vencedor= "Skank"; }
                if (soma4 > soma2 && soma4 > soma3 && soma4 > soma1) {vencedor = "Jota Quest"; }

                System.out.println("o vencedor é : " + vencedor);


                break;}
        
        }


        tec.close();
    }
    
}
