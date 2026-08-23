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
public class ex05 {
     public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         
         System.out.println("Qual a area a ser pintada em metros quadrados?");
         double area = entrada.nextDouble();

         double litros = area/6;
         double litrosFolga = litros * 1.1; 
         
         double latas = Math.ceil(litrosFolga/18);
         double precoLatas = latas * 80;
         
         double galoes = Math.ceil(litrosFolga/3.6);
         double precoGaloes = galoes * 25;
         
         System.out.println("Litros necessarios: " + litros);
         System.out.println("Litros com folga: " + litrosFolga);
         System.out.println("Quantidade de latas grandes: " + latas);
         System.out.println("Preco usando apenas latas grandes: R$" + precoLatas);
         System.out.println("Quantidade de galoes: " + galoes);
         System.out.println("Preco usando apenas galoes: R$" + precoGaloes);
     }
}
