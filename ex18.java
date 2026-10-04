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
public class ex03 {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        
        System.out.print("Digite a temperatura: ");
        double temp = ent.nextDouble();
        
        System.out.println("\n1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        
        System.out.print("\nDigite a conversao que deseja: ");
        int nume = ent.nextInt();
       
        double conver;
        
        switch (nume){
            case 1:
                conver = (temp * 1.8) + 32;
                System.out.printf("%.1f F", conver);
                break;
            case 2:
                conver = (Math.ceil(temp - 32)/1.8);
                System.out.printf("%.0f C", conver);
                break;
            default:
                System.out.println("ERRO!!!");
        }
    }
}
