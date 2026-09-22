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
public class jogo_adv {
    public static void main(String [] args){
        Scanner ent = new Scanner (System.in);
        
        int sorteio =(int)(Math.random() * 10) + 1;
        
        System.out.println("============================================");
        System.out.println("O computador sorteou um numero entre 1 e 100");
        System.out.println("Sua missao eh descobrir esse numero");
        System.out.println("\nBOA SORTE!!!");
        System.out.println("============================================");
        
        System.out.println("1. Facil(10 tentativas)");
        System.out.println("2. Medio(7 tentativas)");
        System.out.println("3. Dificil(5 tentativas)");
        System.out.println("============================================");
        System.out.print("\nEscolha o nivel de dificuldade: ");
        int nivel = ent.nextInt();
        
        int tentativas = 1;
        int nume_digi = 0;
        
    for(; tentativas <= 10; tentativas++){
                System.out.print("\nDigite um numero: ");
                nume_digi = ent.nextInt();
                if (sorteio > nume_digi){
                    System.out.println("\nO NUMERO SORTEADO EH MAIOR");
                }else if (sorteio < nume_digi){
                    System.out.println("\nO NUMERO SORTEADO EH MENOR");
                }
        if(nume_digi == sorteio){
                    System.out.println("\nPARABENS, VOCE CONSEGUIU!");
                    System.out.printf("\nNumero de tentativas: %d", tentativas);
                    System.out.printf("\nNumero sorteado: %d", sorteio);
                    break;
        }
        if(nivel == 1){
                if(tentativas == 10){
                    System.out.println("\nGAME OVER!!!");
                    System.out.printf("Numero sorteado: %d", sorteio);
                }
        }else if(nivel == 2){
                if(tentativas == 7){
                    System.out.println("\nGAME OVER!!!");
                    System.out.printf("Numero sorteado: %d", sorteio);
                }
            }else if(nivel == 3){
                if(tentativas == 5){
                    System.out.println("\nGAME OVER!!!");
                    System.out.printf("Numero sorteado: %d", sorteio);
                
                }
            }
        }
    }
}
