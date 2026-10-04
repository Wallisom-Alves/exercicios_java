/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.ex08;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Ex08 {

    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Arqueiro");
        System.out.println("4 - Assassino");
        
        System.out.print("\nEscolha uma das opcoes: ");
        int nume = ent.nextInt();
        
        switch (nume){
            case 1:
                System.out.println("\n1 - Guerreiro");
                System.out.println("Arma principal: Soco");
                System.out.println("Habilidade especial: Super forca ");
                break;
            case 2:
                System.out.println("\n2 - Mago");
                System.out.println("Arma principal: Bola de fogo");
                System.out.println("Habilidade especial: Resistente ao fogo");
                break;
            case 3:
                System.out.println("\n3 - Arqueiro");
                System.out.println("Arma principal: Arco e Flecha");
                System.out.println("Habilidade especial: Mira");
                break;
            case 4:
                System.out.println("\n4 - Assasino");
                System.out.println("Arma principal: Faca");
                System.out.println("Habilidade especial: Agilidade");
                break;
        }
    }
}
