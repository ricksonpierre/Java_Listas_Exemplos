package JavaListas;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, String> estadosBR = new HashMap<>();
//Adicionar os 26 estados do Brasil, onde a sigla será a chave e o nome será o valor
        estadosBR.put("AC", "Acre");
        estadosBR.put("AL", "Alagoas");
        estadosBR.put("AP", "Amapá");
        estadosBR.put("AM", "Amazonas");
        estadosBR.put("BA", "Bahia");
        estadosBR.put("CE", "Ceará");
        estadosBR.put("ES", "Espirito Santo");
        estadosBR.put("GO", "Goiás");
        estadosBR.put("MA", "Maranhão");
        estadosBR.put("MT", "Mato Grosso");
        estadosBR.put("MS", "Mato Grosso do Sul");
        estadosBR.put("MG", "Minas Gerais");
        estadosBR.put("PA", "Pará");
        estadosBR.put("PB", "Paraíba");
        estadosBR.put("PR", "Paraná");
        estadosBR.put("PE", "Pernambuco");
        estadosBR.put("PI", "Piauí");
        estadosBR.put("RJ", "Rio de Janeiro");
        estadosBR.put("RN", "Rio Grande do NOrte");
        estadosBR.put("RS", "Rio Grande do Sul");
        estadosBR.put("RO", "Rondônia");
        estadosBR.put("RR", "Roraima");
        estadosBR.put("SC", "Santa Catarina");
        estadosBR.put("SP", "São Paulo");
        estadosBR.put("SE", "Sergipe");
        estadosBR.put("TO", "Tocantins");
        System.out.println(estadosBR);
//Remova o estado de Minas Gerais
        estadosBR.remove("MG");
        System.out.println(estadosBR);
//Adicione o Distrito Federal
        estadosBR.put("DF", "Distrito Federal");
        System.out.println(estadosBR);
//Retornar a quantidade de itens nesse mapa
        System.out.println("Este mapa contém: "+estadosBR.size()+" itens!");
//Remover o estado do Mato Grosso do Sul, utilizando o nome
        estadosBR.remove("MS","Mato Grosso do Sul" );
        System.out.println(estadosBR);
// Navegue todos os itens no console, utilizando o formato NOME (SIGLA)
        for (Map.Entry<String, String> entry : estadosBR.entrySet()){
            System.out.println(entry.getValue()+" ("+entry.getKey()+")");
        }
// Verifique se o estado de Santa Catarina existe no mapa, buscando por sua sigla SC
        System.out.println("Existe o estado de Santa Catarina? T/F -> "+estadosBR.containsKey("SC"));
// Verifique se o estado do Maranhão existe no mapa, buscando por seu nome
        System.out.println("Existe o estado do Maranhão? T/F -> "+estadosBR.containsValue("Maranhão"));



    }
}
