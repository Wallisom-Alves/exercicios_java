/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02.ex_aula;

/**
 *
 * @author 54258530840
 */
import java.util.Scanner;
public class ex_desafio_jogo_da_velha {
    public static void main (String []args){
        Scanner ent = new Scanner (System.in);
        
        String [][] matriz = new String [3][3];
        int l = 0;
        int c = 0;
        String player ;
        boolean reload = true;
        
        System.out.println("====================");
        System.out.println("   JOGO DA VELHA  ");
        System.out.println("====================");
        
        while(reload){
        System.out.print("\nInsira:");
        System.out.print("\nX para jogador 1");
        System.out.println("\n0 para jogador 2");
        player = ent.next();
        
        if (!player.equalsIgnoreCase("x") && !player.equalsIgnoreCase("0")){
            System.out.println("\n====================");
            System.out.println("        ERRO");
            System.out.println("====================");
            System.out.println("Digite:");
            System.out.print("X para jogador 1");
            System.out.println("\n0 para jogador 2");
            player = ent.next();
        }
        
            System.out.print("\nLinha: ");
            l = ent.nextInt();
            System.out.print("Coluna: ");
            c = ent.nextInt();
        
            matriz [l][c] = player;
            /*System.out.print("\n %d | %d | %d \n__________ \n %d | %d | %d \n___"
            + "_______ \n %d | %d | %d");*/
            for (l = 0; l == 3; l++){
                for (c = 0; c == 3; c++){
                    System.out.printf(matriz[l][c]);
                }
            }
        }
    }
}
