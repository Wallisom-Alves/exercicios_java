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
public class ex01_scanner {
    public static void main (String [] args){
        Scanner ent = new Scanner (System.in);
        
        System.out.println("Digite a populacao do pais A:");
        double paisA = ent.nextDouble();
        System.out.println("Digite a populacao do pais B:");
        double paisB = ent.nextDouble();
        System.out.println("Digite a taxa de crescimento do pais A:");
        double txA = ent.nextDouble();
        System.out.println("Digite a taxa de crescimento do pais B:");
        double txB = ent.nextDouble();
        
        int anos = 0; 
        
        if(paisB >= paisA && txB <= txA){
            for(; paisA <= paisB; anos++){
                paisA *= (1 + txA);
                paisB *= (1 + txB);
            }
            System.out.printf("%nO pais A ultrapassa o pais B em %d anos", anos);
        }else if(paisA >= paisB && txA <= txB){
            for(; paisB <= paisA; anos++){
                paisA *= (1 + txA);
                paisB *= (1 + txB);  
                }
            System.out.printf("%nO pais B ultrapassa o pais A em %d anos", anos);
        }else{
                System.out.println("ERRO, VOCE DIGITOU AS INFORMACOES ERRADAS!!!");    
        }   
        System.out.printf("%nPopulacao pais A: %.0f habitantes", paisA);
        System.out.printf("%nPopulacao pais B: %.0f habitantes", paisB);
    }
}
