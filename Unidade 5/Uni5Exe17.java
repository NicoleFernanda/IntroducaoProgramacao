

/*
Descreva um algoritmo que leia o número de inscrição e a altura de um atleta em uma
competição e informe:

o número de inscrição e a altura do atleta mais alto;
o número de inscrição e a altura do atleta mais baixo;

a altura média do grupo de atletas.
A leitura deve ser finalizada ao digitar 0 para o número de inscrição.
*/
import java.util.Scanner;
public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double alto = 0, baixo = 0, altura = 0, somaAlturas = 0, media = 0;
        String numero, numeroBaixo = "", numeroAlto = "";
        int i = 1, atletas = 0;
        


        while (i >= 1) {
            System.out.println("numero de inscricao   ["+i+"]");
            numero = tec.next();
            
            if (numero.equals("0")) {
            break;
            }

            System.out.println("altura do atleta   ["+i+"]");
            altura = tec.nextDouble();

            if (i == 1) {
                alto = altura;
                numeroAlto = numero;

                baixo = altura;
                numeroBaixo = numero;

            } 
            if (altura > alto) {
                alto = altura;
                numeroAlto = numero;
            
            } else if (altura < baixo) {
                baixo = altura;
                numeroBaixo = numero;
            
            }
        
            somaAlturas += altura;
            atletas++;
            i++;
       
        }

        media = somaAlturas/atletas;
        System.out.println("altura e numero de inscricao do mais alto = " + alto + "m e incricao: " + numeroAlto);
        System.out.println("altura e numero de inscricao do mais baixo = " + baixo + "m e incricao: " + numeroBaixo);
        System.out.println("a altura média do grupo de atletas" + media);

        tec.close();
    }
}