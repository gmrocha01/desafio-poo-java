package Map;

import java.util.*;

public class ExemploMap {
    //Map é composto por Chave e Valor SEMPRE. É sempre em par.
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione o modelo e seus respectivos consumos: ");
        Map<String, Double> carros = new HashMap<>(); //HashMap a ordem é aleatória com valores unicos.
        carros.put("Gol", 14.4);
        carros.put("Uno", 15.3);
        carros.put("Palio", 12.1);
        carros.put("Ferrari", 18.0);
        carros.put("Porshe", 16d);
        carros.put("Eclipse", 17d);
        System.out.println(carros);

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
        carros.put("Gol", 15.2);
        System.out.println(carros);
        System.out.println("\nConfira se o modelo Palio está no dicionario: ");
        System.out.println(carros.containsKey("Palio"));//Testa se contem ou não no Map
        System.out.println(carros.containsKey("Celta"));//Testa se contem ou não no Map
        System.out.println("Exiba o consumo do Uno: " +carros.get("Uno")); //vai trazer as informações da chave passada

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o valor dos consumos: ");
        Collection<Double> consumos = carros.values();
        System.out.println("\n"+consumos);

        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carros.values()); //Colocou o resultado do .max dentro da var
        System.out.println("\nAquiiiiiiiiiiiiiiii vai exibir a variavel de consumo ->  "+consumoMaisEficiente);
        Set<Map.Entry<String, Double>> entries = carros.entrySet(); //Entry serve para trabalhar com chave e o valor saparado
        String modeloMaisEficiente = "";
        for(Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
            }
        }
        System.out.println("Modelo mais eficiente: " +modeloMaisEficiente +" - " + consumoMaisEficiente);
        System.out.println("\nExiba o modelo com o menos economico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carros.values());
        //String modeloMenosEficiente;
        for(Map.Entry<String, Double> entry : carros.entrySet()){
            if (entry.getValue().equals(Collections.min(carros.values()))){
                System.out.println("Modelo menos eficiente: "+entry.getKey() +" - " +entry.getValue() +" KM/L");
            }
        }
        //Exibindo a soma dos valores com um iterator
        Iterator<Double> iterator = carros.values().iterator();
        double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " +soma);
        System.out.println("Exiba a média dos consumos deste dicionário de carros: ");
        System.out.println(soma/carros.size());
        System.out.println("Remova os modelos com o consumo igual a 15.3");
        Iterator<Double> iterator1 = carros.values().iterator();
        System.out.println("\nAntes da remoção: " + carros);
        while (iterator1.hasNext()){ //Enquanto possui elementos
            if(iterator1.next().equals(15.3)){
                iterator1.remove();
            }
        }
        System.out.println("Após a remoção: " +carros);
        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carros1 = new LinkedHashMap<>(){{//LinkedHashMap é na ordem é de entrada.
        put("Gol", 14.4);
        put("Uno", 15.3);
        put("Palio", 12.1);
        put("Ferrari", 18.0);
        put("Porshe", 16d);
        put("Eclipse", 17d);
        }};
        System.out.println(carros1);

        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carros2 = new TreeMap<>(carros1); //O TreeMap ordena pela chave (Key)
        System.out.println(carros2);

        System.out.println("\nApague o dicionário de carros: ");
        System.out.println("Antes: " +carros);
        carros.clear(); //Apaga completamente o dicionário
        System.out.println("Depois: "+carros);

        System.out.println("\nConfira se a lista está vazia: ");
        System.out.println(carros.isEmpty());




    }
}
