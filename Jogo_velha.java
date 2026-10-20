/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.jogo_velha;

/**
 *
 * @author 54258530840
 */
import java.util.Scanner;
public class Jogo_velha {

    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        
        char [][] matriz = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        
        int l = 0;
        int c = 0;
        boolean reload = true;
        int xy = 0;
        int linha = 0;
        int coluna = 0;
        
        System.out.println("====================");
        System.out.println("   JOGO DA VELHA  ");
        System.out.println("====================\n");
       
        
            for (; linha < 3; linha++){
                System.out.print("   |   |   \n");
                if (linha == 2){
                    break;
                }
                for (coluna = 0; coluna < 1; coluna++){
                    System.out.println("-----------");
                }
            }
            
        while (reload){
            switch (xy){
                case 0:
                    System.out.println("\n\nJogador X");
                    System.out.print("Linha (0, 1 ou 2): ");
                    l = ent.nextInt();
                    System.out.print("Coluna (0, 1 ou 2): ");
                    c = ent.nextInt();
                    if (matriz[l][c].equals){
                        System.out.print("");
                    }
                    xy = 1;
                    matriz [l][c] = 'X';
                    System.out.print("\n");
                    break;
                case 1:
                    System.out.println("\n\nJogador O");
                    System.out.print("Linha (0, 1 ou 2): ");
                    l = ent.nextInt();
                    System.out.print("Coluna (0, 1 ou 2): ");
                    c = ent.nextInt();
                    xy = 0;
                    matriz [l][c] = 'O';
                    System.out.print("\n");
                    break;
            }
            for (l = 0; l < 3; l++){
                for (c = 0; c < 3; c++){
                    System.out.print(" " + matriz[l][c]);
                    if (c == 2){
                        break;
                    }
                    System.out.print(" |");
                }
                if (l == 2){
                    break;
                }
                System.out.println("\n-----------");
            }
        }
    }
}