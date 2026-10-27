/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ex02.ex_aula;

/**
 *
 * @author 54258530840
 */
import java.util.Scanner;
public class Ex_aula {

    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        
        int [] [] matriz = new int [3][3];
        int [] soma = new int [10];
        
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz.length; c++){
                System.out.printf("Digite o valor da %da linha %da coluna: ", l+1, c+1);
                matriz [l][c]= ent.nextInt();
                soma [l] += matriz [l][c];
            }
        }
        for (int l = 0; l < matriz.length; l++ ){
            System.out.printf("\nLinha %d = %d ", l+1, soma[l]);
        }
    }
}
