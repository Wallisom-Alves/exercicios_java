package cliente;

import java.util.Scanner;

public class Cliente {
    String nome, celular, dataNascimento, email, endereco;
    Scanner leitor = new Scanner(System.in);

    public void cadastrarCliente(){
        System.out.println("Informe os dados para cadastro:");
        System.out.println("\nNome:");
        nome = leitor.nextLine();
        System.out.println("\nCelular:");
        celular = leitor.nextLine();
        System.out.println("\nData de Nascimento aaaa-mm-dd:");
        dataNascimento = leitor.nextLine();
        System.out.println("\nE-mail:");
        email = leitor.nextLine();
        System.out.println("\nEndereço:");
        endereco = leitor.nextLine();

        System.out.println("\n✅ O cliente "+nome+" foi registrado com sucesso!");
        System.out.println("Cell: "+celular);
        System.out.println("Data de Nascimento: "+dataNascimento);
        System.out.println("E-mail: "+email);
        System.out.println("Endereço: "+endereco);

    }
}
