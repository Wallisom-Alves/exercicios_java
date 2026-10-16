/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author 54258530840
 */
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        
        String [] produ = new String [5];
        int i = 0;
        
        for (; i < produ.length; i++){
            System.out.printf("Digite o nome do %da produto: ", i+1);
            produ [i] = ent.next();
        }
        for (i = 0; i < produ.length; i++ ){
            System.out.printf("\n%da Produto: %s", i+1, produ[i]);
        }
    }
}
