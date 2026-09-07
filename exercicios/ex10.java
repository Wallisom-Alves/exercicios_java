/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04.exercicios;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ex10 {
    
    public static void main(String []args){
    Scanner entrada = new Scanner (System.in);
    
         System.out.print("Digite um numero: ");
        int nume1 = entrada.nextInt();
        System.out.print("Digite outro numero: ");
        int nume2 = entrada.nextInt();
        System.out.print("Digite outro numero: ");
        int nume3 = entrada.nextInt();
     
        if (nume1 >= nume2 && nume1 >= nume3){
            if (nume2 >= nume3){
                System.out.println(nume1 + " - " + nume2 + " - " + nume3);
            }else{
            System.out.println(nume1 + " - " + nume3 + " - " + nume2);
            }
        }else if (nume2 >= nume1 && nume2 >= nume3){
            if(nume1 >= nume3){
                System.out.println(nume2 + " - " + nume1 + " - " + nume3);
            }else {
                System.out.println(nume2 + " - " + nume3 + " - " + nume1);
            }
        }else if(nume3 >= nume1 && nume3 >= nume2){
            if (nume1 >= nume3){
                System.out.println(nume3 + " - " + nume1 + " - " + nume2);
            }else{
                System.out.println(nume3 + " - " + nume2 + " - " + nume1);
            }
        }
    }
}
