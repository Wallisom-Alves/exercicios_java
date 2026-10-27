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

        int [][] matriz = new int [3][3];
        
        int soma = 0;
        
        for (int l = 0; l < 3; l++){    
            for (int c = 0; c < 3; c++){
                System.out.printf("Digite o valor da linha %d da coluna %d: ", l+1, c+1);
                matriz[l][c]= ent.nextInt();
                soma += matriz [l][c];
            }   
        }
        for (int l = 0; l < 3; l++){    
            for (int c = 0; c < 3; c++){
                System.out.print(matriz[l][c]);
            }    
            System.out.print("\n");
        }
        System.out.printf("Soma de todos os elementos da matriz: %d", soma);
    }
}
