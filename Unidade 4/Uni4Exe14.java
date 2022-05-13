/*            || ou          && e 
Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e 12, e se o dia existe naquele mês.
Note que fevereiro tem 29 dias em anos bissextos, e 28 dias em anos não bissextos.
*/
import java.util.Scanner;
public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = tec.nextInt();
        System.out.println("Digite o mês: ");
        int mes = tec.nextInt();
        System.out.println("Digite o ano: ");
        int ano = tec.nextInt();

        //variavel intermediaria
        int invalido = 0;

        //ver se o ano é bissexto ou não; false = nao é; true = é bissexto
        boolean bissexto = false;
        
        //ano (bissexto ou nao)
        if ( ano % 4 != 0 ) {
            bissexto = false;
        } else if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0)) {
            bissexto = true;
        }
        
        //datas invalida
        if ((ano < 1) || (mes > 12) || (mes < 1) || ( 1 > dia) || (dia > 31)) {   //ano, mes e dia existentes
            invalido++;
        } else if ((dia == 31) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {  //meses de ate 30 dias
            invalido++;
        } else if ( (mes == 2) && (dia > 29)) { //mes de fevereiro (geral)
            invalido++;
        }

        //saidas
        if (invalido == 1) {                              
            System.out.println("Data Inválida!");
        } else if (bissexto == true && mes == 2 && dia > 30) {
            System.out.println("Data Inválida!");
        } else if (bissexto == false && mes == 2 && dia > 28) {
            System.out.println("Data Inválida!");
        } else {
            System.out.println("Data Válida!");
        }

        tec.close();
    }
    
}
