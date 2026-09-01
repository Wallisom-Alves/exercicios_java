/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex.mavenproject1;

/**
 *
 * @author 54258530840
 */
import java.util.Scanner;
public class ex09 {
 
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Digite um caractere: ");
        char carac = entrada.next().charAt(0);
        char maiusc = Character.toUpperCase(carac);
        
        if (carac >= '0' && carac <= '9'){
            System.out.println("E um numero");
        }else if (maiusc == 'A' || maiusc == 'E' || maiusc == 'I' || maiusc == 'O' || maiusc == 'U'){
            System.out.println("E uma vogal");
        }else{  
            System.out.println("E uma consoante");
        }
     }
}
