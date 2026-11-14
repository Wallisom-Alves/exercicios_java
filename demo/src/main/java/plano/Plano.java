package plano;

import java.util.Scanner;
    

public class Plano {

    String regraPeriodo;
    Double valorBase;
    String [] plano ={"Mensal", "Semestral", "Anual"};
    Double [] precosPlanos = {56.23, 169.56, 256.23};
    Scanner escolha = new Scanner(System.in);

    public void exibirCatalogoPlanos(){
        
        System.out.println("\n" + plano[0]+" - R$"+precosPlanos[0]);
        System.out.println(plano[1]+" - R$"+precosPlanos[1]);
        System.out.println(plano[2]+" - R$"+precosPlanos[2]);
        escolhaPlanos();
    }
    public void escolhaPlanos(){
        System.out.println("\nQual plano você deseja escolher ?");
        regraPeriodo = escolha.nextLine();

        if (regraPeriodo.equals("Anual")){
            System.out.println("\nPlano " + regraPeriodo + " escolhido");
            precosPlanos [2] -= precosPlanos[2] *0.2;
            System.out.println("Voce ganhou 20% de desconto\nAgora seu valor Anual é de R$" + precosPlanos[2]);
       }else if (regraPeriodo.equals("Mensal")){
            System.out.println("\nPlano " + regraPeriodo + " escolhido");
            System.out.println("Infelizmente, não temos nenhum disponibilidade de desconto para você neste momento");
       }else {
            System.out.println("\nPlano " + regraPeriodo + " escolhido");
       }
    }
}
