import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int i = 1, contas = 0; 
        byte opcao;
        do {
            System.out.println("sabendo que: \n(1) - encerrar a conta de um hóspede; \n(2) - verificar número de contas encerradas; \n(3) - sair. \nescolha uma opcao :");
            opcao = tec.nextByte();

            if (opcao == 3) {break;}
            if (opcao == 1) {
                System.out.println("nome do hospede : ");
                String nome = tec.next();
                System.out.println("quantas diarias : ");
                int diarias = tec.nextInt();
                double valor = 0;
                if (diarias < 15) {valor = 7.50;}
                else if (diarias == 15) {valor = 6.50;}
                else if (diarias > 15) {valor = 5;}
                else {contas--;}

                valor = (valor * diarias) + (diarias * 50);
                System.out.println("a estada do(a) hospede " + nome + " deve pagar = R$: " + valor);
                contas++;
                continue;

            } else if (opcao == 2) {
                System.out.println("contas encerradas = " + contas);
                continue;
            }

        } while (i == 1);


        tec.close();
    }
    
}
