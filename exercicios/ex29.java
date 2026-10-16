/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 54258530840
 */
import java.util.Scanner;
public class ex05 {
    public static void main (String []args){
        Scanner ent = new Scanner (System.in);
        
        int [] nume = new int [10];
        int i = 0;
        
        for (; i < nume.length; i++){
            System.out.printf("Digite o %da numero: ", i+1);
            nume [i] = ent.nextInt();  
        }
        for (i = 0; i < nume.length; i++){
            if (nume[i] %2 == 0){
                System.out.printf("\n%d", nume[i]);
            }
        }
    }
}
