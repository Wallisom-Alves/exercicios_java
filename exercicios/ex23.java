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
public class ex07 {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
    
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retangulo");
        System.out.println("3 - Triangulo");
        System.out.println("4 - Circulo");
        
        System.out.print("\nEscolha uma das figuras para calcular a area: ");
        int figu = ent.nextInt();
        
        int lado;
        int altu;
        int raio;
        double calc;
        
        if (figu == 1){
            System.out.print("\nDigite o valor do lado do quadrado: ");
            lado = ent.nextInt();
            calc = lado*lado;
            
        }else if (figu == 2){
            System.out.print("\nDigite o valor da base do retangulo: ");
            lado = ent.nextInt();
            System.out.print("\nDigite o valor da altura do retangulo: ");
            altu = ent.nextInt();
            calc = lado*altu;
            
        }else if (figu == 3){
            System.out.print("\nDigite o valor da base do triangulo: ");
            lado = ent.nextInt();
            System.out.print("\nDigite o valor da altura do triangulo: ");
            altu = ent.nextInt();
            calc = (lado*altu)/2;
        
        }else if (figu == 4) {
            System.out.print("\nDigite o valor do r: ");
            raio = ent.nextInt();
            calc = 3.14 * (raio * raio);   
        }
        
        switch (figu){
            case 1:
                System.out.printf("\n%.0f area(m)", calc);
                break;
            case 2:
                System.out.printf("\n%.0f area(m)", calc);
                break;
            case 3:
                System.out.printf("\n%.1f area(m)", calc);
                break;
            case 4:
                System.out.printf("\n%.1f area(m)", calc);
                break;
        }
    }
}
