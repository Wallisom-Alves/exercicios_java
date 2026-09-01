/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex.mavenproject1;

/**
 *
 * @author 54258530840
 */
import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        int numero1 = entrada.nextInt();
        
        System.out.println("Digite outro numero: ");
        int numero2 = entrada.nextInt();
        
        if (numero1 > numero2){
            System.out.println(numero1 + " e maior que " + numero2);
        }else if (numero1 == numero2){
            System.out.println("Os dois numeros sao iguais");
        }else{
            System.out.println(numero2 + " e maior que " + numero1);
        }
    }    
}
