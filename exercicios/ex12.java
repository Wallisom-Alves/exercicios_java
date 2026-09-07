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
public class ex12 {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Qual a area a ser pintada em metros quadrados?");
        double area = entrada.nextDouble();

        double litros = area/6;
        double litrosFolga = litros * 1.1; 
         
        double latas = Math.ceil(litrosFolga/18);
        double precoLatas = latas * 80;
         
        double galoes = Math.ceil(litrosFolga/4);
        double precoGaloes = galoes * 25;
        
        double precomistura = (latas *) + (ad);
        
        System.out.println(precoLatas + " se comprar apenas latas de 18 litros");
        System.out.println(precoGaloes + " se comprar apenas galoes de 4 litros");
        System.out.println(precomistura + " se misturar latas e galoes");
    }
}
