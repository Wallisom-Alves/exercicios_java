package aula_sabado;


import Assinatura.assinatura;
import cliente.Cliente;
import plano.Plano;


public class Main {
    public static void main(String[] args)  {
        Cliente cliente = new  Cliente();
        cliente.cadastrarCliente();

        Plano plano = new Plano();
        plano.exibirCatalogoPlanos();
        
        assinatura Assinatura = new assinatura();
        Assinatura.cadastrarAssinatura();
    }
}

