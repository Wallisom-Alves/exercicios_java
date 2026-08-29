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
public class ex06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite um numero inteiro: ");
        int nume = entrada.nextInt();
        
        if (nume %2 == 0 && nume >= 0) {
            System.out.println("O numero " + nume + " e par e positivo");
        } else if (nume %2 == 0 && nume < 0) {
            System.out.println("O numero " + nume + " e par e negativo");
        } else if (nume %2 != 0 && nume >= 0){
            System.out.println("O numero " + nume + " e impar e positivo");
        } else {
            System.out.println("O numero " + nume + " e impar e negativo");
        }
            
        
    }
}
