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
public class ex06 {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
    
        System.out.print("Digite uma letra: ");
        char letra = Character.toLowerCase(ent.next().charAt(0));
        
        switch(letra){
            case 'a','e','i','o','u':
                System.out.println("\nE uma vogal");
                break;
            default:
                System.out.println("\nE uma consoante");
        }
    }
}
