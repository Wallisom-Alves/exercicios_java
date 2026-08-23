/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ex04.exercicios;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Exercicios {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Quanto voce ganha por hora? ");
        double ganhoHora = entrada.nextDouble();
        
        System.out.println("Quantas horas voce trabalha no mes? ");
        double horasTrabalho = entrada.nextDouble();
        
        double salario = ganhoHora * horasTrabalho;
        
        System.out.println("Voce pagou ao IR R$" + salario * 0.11);
        System.out.println("Voce pagou ao INSS R$" + salario * 0.08);
        System.out.println("Voce pagou ao Sindicato R$" + salario * 0.05);
        System.out.println("Voce tera no final do mes R$" + (salario - (salario * 0.11) - (salario * 0.08) - (salario*0.05)));
        System.out.println();

    }
}
