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
public class jogo_velha {
    public static void main (String []args){
        Scanner ent = new Scanner (System.in);
        
        char [][] matriz = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        
        int l = 0;
        int c = 0;
        boolean reload = true;
        boolean condicao = true;
        int xy = 0;
        int linha = 0;
        int coluna = 0;
        int anterior_l = 5;
        int anterior_c = 5;
        int pula = 0;
        
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
                    if (pula == 0){
                        anterior_l = l;
                        anterior_c = c;
                    }else if (anterior_l == l && anterior_c == c) {
                        System.out.println("\nESPACO PREENCHIDO!");
                        System.out.println("\n\nJogador X");
                        System.out.print("Linha (0, 1 ou 2): ");
                        l = ent.nextInt();
                        System.out.print("Coluna (0, 1 ou 2): ");
                        c = ent.nextInt();
                        anterior_l = l;
                        anterior_c = c;
                    }
                    pula = 1;
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
                    if (pula == 0){
                        anterior_l = l;
                        anterior_c = c;
                    }else if (anterior_l == l && anterior_c == c) {
                        System.out.println("\n\nESPACO PREENCHIDO!");
                        System.out.println("\n\nJogador O");
                        System.out.print("Linha (0, 1 ou 2): ");
                        l = ent.nextInt();
                        System.out.print("Coluna (0, 1 ou 2): ");
                        c = ent.nextInt();
                        anterior_l = l;
                        anterior_c = c;
                    }
                    pula = 1;
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
            while (condicao){
                for (l = 0; l < 3; l++){
                    for(c = 0; c < 3; c++){
                        if(matriz[0][l] == matriz[c][l]){
                            System.out.printf("\nJogador %s VENCEU!!!", matriz[0][l]);
                            condicao = false;
                            break;
                        }else if (matriz[l][0] == matriz[l][c]){
                            System.out.printf("\nJogador %s VENCEU!!!", matriz[l][0]);
                            condicao = false;
                            break;
                        }else if (matriz[l][l] == matriz[c][c]){
                            System.out.printf("\nJogador %s VENCEU!!!", matriz[l][l]);
                            condicao = false;
                            break;
                        }else if (matriz[0][3] == matriz[1][1] && matriz[1][1] == matriz[3][0]){
                            System.out.printf("\nJogador %s VENCEU!!!", matriz[0][3]);
                            condicao = false;
                            break;
                        }else {
                            System.out.println("\nVELHAAAAA!!!!!!");
                            condicao = false;
                            break;
                        }
                    }
               }
            }
        }
    }
}
