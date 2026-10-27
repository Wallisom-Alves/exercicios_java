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
public class ex03 {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
    
        int [] temperaturas = {22, 31, 18, 27, 35, 19, 24};
        int i = 0;
        int maior = 0;
        int menor = 0;
        int indice_maior = 0;
        int indice_menor = 0;
        
        for (; i < temperaturas.length; i++){
            
            if (i == 0){
                maior = temperaturas [i];
                menor = temperaturas [i];
            }
            if (maior < temperaturas [i]){
                maior = temperaturas [i];
                indice_maior = i;
            }
            if (menor > temperaturas [i]){
                menor = temperaturas [i];
                indice_menor = i;
            }
        }   
        System.out.printf("Maior: %d no indice: %d; Menor: %d no indice: %d", maior, indice_maior, menor, indice_menor);
    }
}
