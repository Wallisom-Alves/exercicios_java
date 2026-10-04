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
public class ex04 {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        
        System.out.println("1 - Cadastrar usuario");
        System.out.println("2 - Listar usuario");
        System.out.println("3 - Atualizar usuario");
        System.out.println("4 - Excluir usuario");
        System.out.println("0 - Sair");
        
        System.out.print("\nDigite uma opcao: ");
        int nume = ent.nextInt();
        
        String nome = "Nao tem usuario";
        
        switch (nume){
            case 1:
                System.out.println("\nInforme seu nome:");
                nome = ent.next();
                break;
            case 2:
                System.out.printf("\n%s", nome);
                break;
            case 3:
                System.out.println("\nInforme seu novo nome:");
                nome = ent.next();
                break;
            case 4:
                System.out.println("\nUSUARIO EXCLUIDO!");
                break;
            case 0:
                System.out.println("\nVOCE SAIU!");
                break;
        }
    }
}
