/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula.desafio;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
/**
 *
 * @author 54258530840
 */
public class Desafio {

    public static void main(String[] args){
        try{
            Scanner ent = new Scanner (System.in);
            int opcao ;
            System.out.println("1 - Importar JSON e gerar TXT\n" +
            "2 - Listar registros do TXT\n" +
            "3 - Consultar registro\n" +
            "4 - Alterar registro no TXT\n" +
            "5 - Salvar e sair");
            opcao = ent.nextInt();
            System.out.print("Voce escolheu: " + opcao);
            FileReader leitor = new FileReader("ocorrencias_300_registros.json"); //Ve se o arquivo existe
            FileWriter arquivo = new FileWriter("ocorrencias.txt"); //Cria o arquivo txt
            JsonArray lista = JsonParser.parseReader(leitor).getAsJsonArray(); //Ele le os 300 registros
            
            for(int i = 0; i < lista.size(); i++){
                JsonObject ficha = lista.get(i).getAsJsonObject();
                
                int id = ficha.get("id").getAsInt();
                String dataHora = ficha.get("dataHora").getAsString();
                String ip = ficha.get("ip").getAsString();
                String tipo = ficha.get("tipo").getAsString();
                int risco = ficha.get("risco").getAsInt();
                String descricao = ficha.get("descricao").getAsString();
                
                arquivo.write(id + ";" + dataHora + ";" + ip + ";" + tipo + ";" + risco + ";" + descricao + "\n");
            }
            arquivo.close();
            System.out.println("Arquivo aberto!");
            System.out.println("Total: "+ lista.size());
        }catch (Exception e){
            System.out.println("Arquivo JSON nao encontrado");
        }
    }
}
