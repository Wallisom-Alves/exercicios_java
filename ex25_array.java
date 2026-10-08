/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.ex;

/**
 *
 * @author 54258530840
 */
import java.util.Scanner;
public class ex01 {
    public static void main (String []args){
        Scanner ent = new Scanner (System.in);
        
        String [] nome = new String [100];
        double [] media = new double [100];
        double [] nota;
        String resposta;
        double soma = 0;
        int nume = 0;

            for(int i = 0; i < nome.length; i++){
                
                System.out.printf("Digite o nome do %d aluno: ", i+1);
                nome[i] = ent.next(); 
        
                System.out.println ("\nQuantas notas voce ira digitar?");
                nume = ent.nextInt();
                nota = new double [nume];
        
                for (int contador = 0; contador < nume; contador++){
                    System.out.printf("\nDigite a %d nota: ", contador+1);
                    nota [contador] = ent.nextInt();
                    media[i] = media[i] + nota[contador];
                }
                media[i] = media[i] / nume;
                System.out.println("\nVoce quer digitar um novo aluno?");
                resposta = ent.next();
            
                if(resposta.equalsIgnoreCase("nao")){
                    for(int posicao = 0; posicao <= i; posicao++){
                        System.out.printf("\nNome: %s", nome[posicao]);
                        System.out.printf("\nMedia: %.0f", media[posicao]);
                        if(media[posicao] >= 7){
                            System.out.print("\nAPROVADO");
                        }else {
                            System.out.print("\nREPROVADO");
                        }
                    }
                    break;
                }
            }   
    }
}
