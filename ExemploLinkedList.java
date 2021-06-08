package JavaListas;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {
//Crie uma fila
        Queue<String> fila = new LinkedList<>();
//Adicione cinco nomes
        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");
//Exibir cada nome no console
        System.out.println(fila);
//Retornar o primeiro item da fila, sem remove-lo
        System.out.println(fila.peek());
//Retornar o primeio item da fila, removendo-o
        System.out.println(fila.poll());
//Teste para saber se realmente foi removido
        System.out.println(fila);
//Adicionar um novo objeto à fila e verificar a sua posição
        fila.add("Daniel");
        System.out.println(fila);
//Retornar o tamanho da lista
        System.out.println(fila.size());
//Verifique se a lista está vazia
        System.out.println(fila.isEmpty());
//Verifique se o nome Carlos está na lista
        System.out.println(fila.contains("Carlos"));


    }
}
