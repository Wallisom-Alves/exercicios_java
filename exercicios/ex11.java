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
public class ex11 {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite um numero inteiro menor que 1000:");
        int nume = entrada.nextInt();
        
        if (nume >= 1000){
            System.out.println("DIGITE UM NUMERO MENOR QUE 1000");
        }else{
           int cent = nume / 100;
           int deze = (nume % 100) /10;
           int unid = nume % 10;
           
           System.out.println(cent + " Centenas, " + deze + " Dezenas e " + unid + " Unidades");
        }
    }
}