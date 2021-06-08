package JavaListas;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

    public static void main(String[] args) {

        Set<Integer> numeros = new TreeSet<>();
        
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3); // Perceba que esse número não foi adicionado
        System.out.println(numeros);
        numeros.remove(3);
        System.out.println(numeros);
        numeros.add(23);
        System.out.println(numeros);
        System.out.println("O tamanho do Set é: "+numeros.size());
        System.out.println("O Set está vazio? T/F -> "+numeros.isEmpty());
        numeros.clear();
        System.out.println("O Set está vazio? T/F -> "+numeros.isEmpty());
    }
}
