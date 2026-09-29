/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.ex01;

/**
 *
 * @author 54258530840
 */
import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
    
        System.out.print("Digite um numero: ");
        int nume1 = ent.nextInt();
        
        System.out.print("Digite outro numero: ");
        int nume2 = ent.nextInt();
        
        System.out.println("\n1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        
        System.out.print("\nDigite o valor da operacao que deseja: ");
        int operacao = ent.nextInt();
        
        switch (operacao){
            case 1:
                System.out.printf("\n%d + %d = %d", nume1, nume2, nume1+nume2);
                break;
            case 2:
                System.out.printf("\n%d - %d = %d", nume1, nume2, nume1-nume2);
                break;
            case 3:
                System.out.printf("\n%d * %d = %d", nume1, nume2, nume1*nume2);
                break;
            case 4:
                System.out.printf("\n%d / %d = %d", nume1, nume2, nume1/nume2);
                break;
            default:
                System.out.println("ERRO!!!");
        }
    }
}
