/*
As tarifas de um estacionamento são as seguintes:

1° e 2° hora - R$ 5,00 cada
3° e 4° hora - R$ 7,50 cada
5° hora e seguintes - R$ 10,00 cada

O número de horas a pagar é sempre inteiro e arredondado para cima ou para baixo dependendo do tempo. 

Até 29 minutos depois da chegada, arredonda-se para baixo e após 30 minutos arredonda-se para cima. 

1 hora e 15 minutos = 1 hora                          1 hora e 35 minutos = 2 horas
menos de 30 minutos = 1 hora. 

Os horários de chegada e partida são apresentados na forma de pares de inteiros, representando horas e minutos. Por exemplo, 
o par 12 50 representará meio dia e cinquenta. Assim, faça um algoritmo que 

leia os horários de chegada e de partida e 
escreva na tela o preço a ser cobrado. Deverá haver validação de dados. 

Admite-se que a chegada e a partida se dão com 
intervalo não superior a 24 horas. Entretanto, se uma dada hora de chegada for superior à da partida, isso não é uma 
situação de erro, significará que a partida ocorreu no dia seguinte ao da chegada.


*/

import java.util.Scanner;
public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Horas da entrada:");
        int horasEntrada = tec.nextInt(); //ao entrar no estacionamento
        System.out.println("Minutos da entrada:");
        int minutosEntrada = tec.nextInt();

        System.out.println("Horas da saída:");
        int horasSaida = tec.nextInt();//ao sair do estacionamento
        System.out.println("Minutos da saída");
        int minutosSaida = tec.nextInt();
        
        //lendo os horarios da entrada e saida
        System.out.println("Horário de chegada:       " + horasEntrada + ":" + minutosEntrada);
        System.out.println("Horário de saída:         " + horasSaida + ":" + minutosSaida);
        
        
        //processamento (tranformando horas em minutos e subtraindo)
        int totalEntrada = (horasEntrada * 60) + minutosEntrada; //tranforma tudo em minutos
        int totalSaida = (horasSaida * 60) + minutosSaida; //tranforma tudo em minutos
        
        int total =  totalSaida - totalEntrada; //minutos que ficou no estacionamento
        
        //transformação de volta em horas
        int horas = total/60;                 //quantas horas o veiculo ficou no estcionamento
        int minutos = total % 60;             //quantos minutos o veiculo ficou no estcionamento
        

        //processamento e saidas
    if (horas == 0 && minutos > 0) {
        horas++;

    } else if (horas >= 0 && minutos > 29) {
            horas++;
            minutos = 0;

        } else if (horasSaida <= horasEntrada) {
            total = 1440 - (totalEntrada - totalSaida); //para saber quantas horas ficou lá

            horas = total/60;
            minutos = total % 60;
            
            if (minutos > 29) {
                horas++;
                minutos = 0;
            }
        }
        switch (horas) {
            case 1:
                   System.out.println("R$:5,00"); 
                break;
            
            case 2:
                System.out.println("R$:10,00");
                break;
            
            case 3:
                System.out.println("R$:17,50");
                break;

            case 4:
                System.out.println("R$:25,00");
                break;

            case 5:
                System.out.println("R$:35,00");
                break;

            default:
                if (horas > 5) {
                int x = horas - 5; //10 reais a hora (até 4 horas é um valor diferente)
                int pagar = 35 + (10 * x);
    
                System.out.println("R$:" + pagar + ",00");
    
    
            }

                break;
        }

        
        tec.close();
    }
    
}
