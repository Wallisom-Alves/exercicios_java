/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.ex01;

/**
 *
 * @author 54258530840
 */
public class Ex01 {
    public static void main(String [] args){
        
        double paisA = 500000;
        double paisB = 800000;
        double txA = 0.053;
        double txB = 0.02;
        int anos = 0;
        
        for(; paisA <= paisB; anos++){
            paisA *= (1+txA);
            paisB *= (1+txB);
        }
        System.out.printf("%nO pais A ultrapassara o pais B em %d anos", anos);
        System.out.printf("%nPopulacao pais A: %.0f", paisA);
        System.out.printf("%nPopulacao pais B: %.0f", paisB);
    }
}
