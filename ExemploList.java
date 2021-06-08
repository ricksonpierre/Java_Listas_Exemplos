package JavaListas;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList();
//método .add() será utilizado para adicionar novos objetos à lista
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        System.out.println(nomes); //Exibir a lista no console
        nomes.set(2,"Roberto"); //Substituir o nome Carlos por Roberto
        System.out.println(nomes); //Exibir a lista no console
        String nomePos1 = nomes.get(1);
        System.out.println(nomePos1); //Exibir o nome da posição 1
        nomes.remove(4); // Remover o objeto do índice posição 4
        System.out.println(nomes);
        nomes.remove("João"); // Remover o objeto "João"
        System.out.println(nomes);
        int tamanhoLista = nomes.size(); // Atribuir o tamanho da lista a uma variável
        System.out.println("Essa lista possui: "+tamanhoLista+" itens."); // Imprimir o tamanho da lista
        // Duas formas para saber se o nome Juliana existe nessa lista:
        System.out.println("O nome Juliana existe nessa lista? T/F = "+nomes.contains("Juliana")); //atribuição direta
        boolean temJuliana = nomes.contains("Juliana"); // Criando uma nova variável
        System.out.println("O nome Juliana existe nessa lista? T/F = "+temJuliana);
        // Criando uma nova lista para ser adicionada a anterior:
        List<String> novaLista = new ArrayList<>();
        novaLista.add("Ismael");
        novaLista.add("Rodrigo");
        System.out.println("Minha nova lista:  "+novaLista);
        nomes.addAll(novaLista);
        System.out.println("------ NOVA LISTA ADD ------");
        System.out.println(nomes); // Imprimir a nova lista com os novos itens adicionados
        //Próxima solicitação é para ordenar os elementos em ordem alfabética
        Collections.sort(nomes);
        System.out.println(nomes); // Imprimir a nova lista com os novos itens ordenados
        System.out.println(novaLista.isEmpty());
        novaLista.clear();
        System.out.println(novaLista.isEmpty());
        System.out.println(nomes);
    }
}
