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
public class ex04 {
    public static void main (String [] args){
        Scanner ent = new Scanner (System.in);
        
        int [] nume = new int [6];
        int i = 0;
        int menor = 0;
        
        for (;i < nume.length; i++){
            System.out.printf("\nDigite o %da numero inteiro: ", i+1);
            nume[i] = ent.nextInt();
            if (i == 1){ 
                if (nume [i] < nume [i - 1]){
                    menor = nume [i]; 
                }else if (nume [i -1] < nume [i]){
                    menor= nume [i-1];
                }
            }
        }
        for (i = 2; i < nume.length; i++){
            if (menor > nume [i]){
                menor = nume [i];
            }
        }
        System.out.printf("\nO menor numero digitado foi %d", menor);
    }
}
