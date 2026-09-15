/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.aula04;

/**
 *
 * @author 54258530840
 */
import java.util.Scanner;
public class ex02 {
    public static void main(String[]args){
        Scanner ent = new Scanner (System.in);

        System.out.print("Digite um numero: ");
        int n1 = ent.nextInt();
    
        System.out.print("Digite outro numero: ");
        int n2 = ent.nextInt();
        
        if (n1 > n2){
            for(;n2 <= n1; n2++){
                System.out.printf("\n");
                System.out.printf("\n Tabuada do %d",n2);
                System.out.printf("\n===================");
                for(int n3 = 1; n3<=10; n3++){
                    System.out.printf("\n%d x %d = %d", n2,n3,n2*n3);
                }
            }
        }else{
            for(;n1 <= n2; n1++){
                System.out.printf("\n");
                System.out.printf("\n Tabuada do %d",n1);
                System.out.printf("\n===================");
                for(int n3=1; n3 <=10; n3++){
                    System.out.printf("\n%d x %d = %d", n1,n3, n1*n3);
                }
            }
        }
    }
}
