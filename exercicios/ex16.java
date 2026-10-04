/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.ex01;

/**
 *
 * @author 54258530840
 */
import java.util.Scanner;
public class Ex01 {

    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        
        System.out.println("Digite um valor de 1 ate 7:");
        int nume = ent.nextInt();
        
        switch (nume){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
        
    }
}
