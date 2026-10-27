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
        boolean verificacao = true;
        int xy = 0;
        int contagem = 0;

        estrutura(matriz);
            
        while (reload){
            jogador(matriz, xy, verificacao, l, c, contagem, ent);
            
            estrutura(matriz);
            
            condicao(matriz, l, c, reload, contagem);
        }
    }
    public static void estrutura (char [][] matriz){
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(" " + matriz[l][c] + " ");
                if (c < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (l < 2) {
                System.out.println("-----------");
            }
        }
    }
    public static void jogador (char [][] matriz, int xy, boolean verificacao, int l, int c, int contagem, Scanner ent){
        switch (xy){
                case 0:
                    verificacao = true;
                    System.out.println("\n\nJogador X");
                    System.out.print("Linha (0, 1 ou 2): ");
                    l = ent.nextInt();
                    System.out.print("Coluna (0, 1 ou 2): ");
                    c = ent.nextInt();
                    while (verificacao){
                        if (matriz[l][c] == 'X' || matriz[l][c] == 'O'){
                            System.err.print("\nERRO, ESPACO PREENCHIDO\n");
                            System.out.println("\n\nJogador X");
                            System.out.print("Linha (0, 1 ou 2): ");
                            l = ent.nextInt();
                            System.out.print("Coluna (0, 1 ou 2): ");
                            c = ent.nextInt();
                        }else {
                            verificacao = false;
                        }
                    }
                    xy = 1;
                    contagem++;
                    matriz [l][c] = 'X';
                    System.out.print("\n");
                    break;
                case 1:
                    verificacao = true;
                    System.out.println("\n\nJogador O");
                    System.out.print("Linha (0, 1 ou 2): ");
                    l = ent.nextInt();
                    System.out.print("Coluna (0, 1 ou 2): ");
                    c = ent.nextInt();
                    while(verificacao){
                        if (matriz[l][c] == 'X' || matriz[l][c] == 'O'){
                            System.err.print("\nERRO, ESPACO PREENCHIDO\n");
                            System.out.println("\n\nJogador O");
                            System.out.print("Linha (0, 1 ou 2): ");
                            l = ent.nextInt();
                            System.out.print("Coluna (0, 1 ou 2): ");
                            c = ent.nextInt();
                        }else {
                            verificacao = false;
                        }
                    }
                    xy = 0;
                    contagem++;
                    matriz [l][c] = 'O';
                    System.out.print("\n");
                    break;
            }
    }
    public static void condicao (char [][] matriz, int l, int c, boolean reload, int contagem){
        for (l = 0; l < 3; l++){
                if (matriz [l][0] == 'X' && matriz [l][1] == 'X' && matriz [l][2] == 'X' || matriz [l][0] == 'O' && matriz [l][1] == 'O' && matriz [l][2] == 'O'){
                    System.out.printf("\nJogador %s VENCEU", matriz[l][0]);
                    reload = false;
                }else if (matriz [0][l] == 'X' && matriz [1][l] == 'X' && matriz [2][l] == 'X' || matriz [0][l] == 'O' && matriz [1][l] == 'O' && matriz [2][l] == 'O'){
                    System.out.printf("\nJogador %s VENCEU", matriz[0][l]);
                    reload = false;   
                }else if (matriz [0][0] == 'X' && matriz [1][1] == 'X' && matriz [2][2] == 'X' || matriz [0][0] == 'O' && matriz [1][1] == 'O' && matriz [2][2] == 'O'){
                    System.out.printf("\nJogador %s VENCEU", matriz[0][0]);
                    reload = false;
                }else if (matriz [0][2] == 'X' && matriz [1][1] == 'X' && matriz [2][0] == 'X' || matriz [0][2] == 'O' && matriz [1][1] == 'O' && matriz [2][0] == 'O'){
                    System.out.printf("\nJogador %s VENCEU", matriz[0][2]);
                    reload = false;
                }
            }
            if (contagem == 9){
                System.out.print("\nVELHA!!!");
                reload = false;
            }
    }
}