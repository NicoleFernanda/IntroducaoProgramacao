import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("qual dia da semana comeca o mes: ");
        int primeiro = tec.nextInt();
        
        System.out.println("qual mes: ");
        byte mes = tec.nextByte();
        
        int dias = 0;
        //qual mes vai cair e quantos dias tem respectivo mes
        if (mes == 2) {
            dias = 28;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias = 31;
        } else {
            dias = 30;
        }
        
        //titulo
        System.out.println("D\tS\tT\tQ\tQ\tS\tS");
        System.out.println("----------------------------------------------------");
        

        tec.close();

        //primeira linha        
        for (int i = 1; i < primeiro; i++) {System.out.print("\t");} //espacox vazios
        if (primeiro == 1) {primeiro = 7;}
        else {primeiro = 8 - primeiro;} //se colocar 3, por ex, ainda tem que imprimir terca (por isso 8)
        
        int j = 1; //conseguir acompanhar onde j parou (j = dia do mes)
        String zero; //colocar zero antes dos numeros antes de 10

        for (j = 1; j <= primeiro ; j++) { //semana 1
            zero = (j <= 9) ? "0" : ""; //operador ternario dentro, se nao nao funciona
            System.out.print(zero + j + "\t");
        }

        
        System.out.println();
        //outras semanas
        for (int h = 1; h <= j && j <= dias; h++) { //numero que parou no j eh a continuacao de dias
            
            for (int l = 1; l <= 7; l++) {
                zero = (j <= 9) ? "0" : ""; //operador ternario aqui tbm
                if (j > dias) {
                    System.out.println("\t");
                    break;
                } else {
                    System.out.print(zero + j + "\t");
                    }
                
                j++;
            }
            System.out.println();

        }

        
    
    }

}