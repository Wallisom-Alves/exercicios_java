/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ex01.aula04;

/**
 *
 * @author 54258530840
 */
import java.util.Scanner;
public class Aula04 {

    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        
        for(int nume1= 1; nume1 <= 10; nume1++){
            System.out.println("\n");
            for(int nume2= 1; nume2 <= 10; nume2++){
                System.out.printf("\n%d x %d = %d", nume1, nume2, nume1*nume2);
            }
        }
            
    }
}   
 