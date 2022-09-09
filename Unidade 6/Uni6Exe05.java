//Crie um método que possa ler tanto as respostas do rapaz como da moça, e outro para calcular e retornar a afinidade

import java.util.Scanner;

public class Uni6Exe05 {
   
   public Uni6Exe05() {
        
        String pergunta[] = new String[5];
        perguntas(pergunta); //um metodo para agrupar as perguntas

        String moca[] = new String[5];
        String rapaz[] = new String[5];
        respostas(pergunta, rapaz, moca); //outro para receber as respostas
    
        int somaPontos = calcular(moca, rapaz); //calcular pontos
        resultado(somaPontos);//imprimir o resultado das perguntas
   }
   
   private void perguntas(String pergunta[]) {
        pergunta[0] = "gosta de musica sertaneja?";
        pergunta[1] = "gosta de futebol?";
        pergunta[2] = "gosta de seriados?";
        pergunta[3] = "gosta de redes sociais?";
        pergunta[4] = "gosta da Oktoberfest?";
   }
   
   private void respostas(String pergunta[], String rapaz[], String moca[]){
        Scanner t = new Scanner(System.in);
        
        for (int i = 0; i < pergunta.length; i++) {
            System.out.println("\n" + pergunta[i] + "\nrapaz e moca, respectivamente: ");
            rapaz[i] = t.next();
            moca[i] = t.next();
        }

        t.close();
    
   
    }

    private int calcular(String moca[], String rapaz[]) {
        int pontos = 0;

        int i = 0;

        for (i = 0; i < moca.length; i++) {
            
            if (moca[i].equals(rapaz[i])) {//simsim
                pontos = pontos + 3;
            
            } else if (moca[i].equalsIgnoreCase("sim") && (!rapaz[i].equalsIgnoreCase(moca[i]))) {
                //moca - sim            rapaz - !sim
                if (rapaz[i].equalsIgnoreCase("nao")) { //rapaz - nao
                    pontos = pontos - 2;
                } else if (rapaz[i].equalsIgnoreCase("ind")) { //rapaz - ind
                    pontos = pontos + 1;
                }
            
            } else if (rapaz[i].equalsIgnoreCase("sim") && (!moca[i].equalsIgnoreCase(rapaz[i]))) {
                //rapaz - sim           moca - !sim
                if (moca[i].equalsIgnoreCase("nao")) {//moca - nao
                    pontos = pontos - 2;
                } else if (moca[i].equalsIgnoreCase("ind")) {//moca - ind
                    pontos = pontos + 1;
                }
            
            } else if (moca[i].equalsIgnoreCase("ind") && (!rapaz[i].equalsIgnoreCase(moca[i]))) {
                //moca - ind           rapaz - !ind
                if (rapaz[i].equalsIgnoreCase("nao") || rapaz[i].equalsIgnoreCase("sim")) {
                    pontos = pontos + 1;//rapaz - sim ou nao
                }
            
            } else if (rapaz[i].equalsIgnoreCase("ind") && (!moca[i].equalsIgnoreCase(rapaz[i]))) {
                //rapaz - ind          moca - !ind
                if (moca[i].equalsIgnoreCase("nao") || moca[i].equalsIgnoreCase("sim")) {
                    pontos = pontos + 1;//moca - sim ou nao
                }
            }

        }

        return pontos;
    
    }
    
    private void resultado(int somaPontos){
        
        System.out.println();
        if (somaPontos == 15) {System.out.println("casem!");}
        else if (somaPontos >= 10 && somaPontos < 15) {System.out.println("voces tem muita coisa em comum!");}
        else if (somaPontos >= 5 && somaPontos < 10) {System.out.println("talvez nao de certo :(");}
        else if (somaPontos >= 0 && somaPontos < 5) {System.out.println("vale um encontro.");}
        else if (somaPontos >= -9 && somaPontos < - 1) {System.out.println("melhor nao perdem tempo");}
        else if (somaPontos == - 10) {System.out.println("voces se odeiam!");}
        System.out.println();

    }
   
   
   
    public static void main(String[] args) {
        new Uni6Exe05();
        
    }
    
}
