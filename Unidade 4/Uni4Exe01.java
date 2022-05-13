/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá
hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de
horas trabalhadas em um mês, o valor por hora e escreva o salário total do funcionário, que deverá ser acrescido das
horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).*/ 

import java.util.Scanner;
public class Uni4Exe01 {
    public static void main(String[] args) {
    
        Scanner tec = new Scanner(System.in);
        
        //entradas
        System.out.println("Entre com as horas trabalhadas no mês: ");
        float horasMes = tec.nextFloat();
        System.out.println("Entre com o valor pago por hora: ");
        double horasValor = tec.nextDouble();

        
        

        //processamento
        
        double salarioTotal = horasValor * horasMes ; //salario do mes
       
        if (horasMes > 160) { //40 * 4 = horas trabalhadas dentro do um mes
            double SalarioExtra = ((horasMes - 160) * (horasValor * 0.50)); //quantas horas a mais de 160
            salarioTotal = salarioTotal + SalarioExtra; 
        } 


        
        //saida
        System.out.println("O salário é de: " + salarioTotal);
        
        tec.close();
        
    }
    
}

