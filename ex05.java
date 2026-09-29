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
public class ex05 {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
    
        System.out.print("Informe a letra do seu combustivel: ");
        char combus = Character.toUpperCase(ent.next().charAt(0));
        
        
        switch (combus){
            case 'G':
                System.out.println("\nG - Gasolina");
                break;
            case 'E':
                System.out.println("\nE - Etanol");
                break;
            case 'D':
                System.out.println("\nD - Diesel");
                break;
            default:
                System.out.println("\nERRO!!!");
        }   
    }
}
