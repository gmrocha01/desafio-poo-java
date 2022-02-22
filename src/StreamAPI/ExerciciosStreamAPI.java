package StreamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//STREAM NÃO MODIFICA A FONTE, APENAS PEGA INFORMAÇÕES !!!!

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        //numerosAleatorios.stream().forEach(s -> System.out.println(s)); //LAMBDA
        numerosAleatorios.stream().forEach(System.out::println); //Reference Method

        //Vale lembrar que o Set recebe apenas elementos diferentes !!!
        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set e exiba: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("\nTransforme esta lista de String em uma lista de números inteiros (INT): ");
        //Criou uma variável para exibir em um sout.
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt) //Converteu de String para INT
                .collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("\n Pegue os números pares e maiores que 2 e coloque numa lista: ");
        List<Integer> numerosParesMaioresQueDois = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2) //% significa resto da divisão
                .collect(Collectors.toList());
        System.out.println(numerosParesMaioresQueDois);

        System.out.println("\n Mostre a média dos numeros: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("\nRemova os valores impares: ");
        List<Integer> numerosAleatoriosInt = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println("Numeros Aleatórios antes da exclusão: " + numerosAleatoriosInt);
        numerosAleatoriosInt.removeIf(i -> i % 2 != 0);
        System.out.println("Numeros Aleatórios depois da exclusão: " + numerosAleatoriosInt);

        System.out.println("\n Ignore os 3 primeiros elementos da lista: ");
        List<String> skipNumeros = numerosAleatorios.stream().skip(3).collect(Collectors.toList());
        System.out.println(skipNumeros);

        System.out.println("\n Retirando os numeros repetidos da lista, quantos ficariam: ");
        int tamanho = numerosAleatorios.stream().collect(Collectors.toSet()).size();
        Set<String> set = numerosAleatorios.stream().collect(Collectors.toSet());
        System.out.println("Set com os numeros: " + set);
        System.out.println("Quantidade de numeros que não são repetidos: " + tamanho);

        System.out.println("\n Mostre o menor valor da lista: ");
        int minimo = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .min(Integer::compare)
                        .get(); //Se não colocar o GET, a variavel terá que ser <Optional>
        System.out.println(minimo);

        System.out.println("\n Mostre o maior valor da lista: ");
        int maximo = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .max(Integer::compare)
                .get();
        System.out.println(maximo);

        System.out.println("\n Pegue apenas os numeros impares e some: ");
        int somaNumerosImpares = numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .filter(i -> i % 2 != 0)
                .sum();
        List<Integer> impares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("\n Numeros Impares: " +impares);
        System.out.println(" Soma: " + somaNumerosImpares);

        System.out.println("\n Agrupe os valores impares multiplos de 3 e de 5: ");
        Map<Boolean, List<Integer>> numerosImparesMultiplos3E5 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.groupingBy(i -> (i % 3 == 0) || (i % 5 == 0) && (i == 0 == false)));
        System.out.println(numerosImparesMultiplos3E5);

        System.out.println("\n Exiba os numeros Impares que são multiplos de 3 e 5");
        List<Integer> outraManeiraNumerosImparesMultiplos3E5 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 3 == 0 || i % 5 == 0) && (i != 0))
                .collect(Collectors.toList());
        System.out.println(outraManeiraNumerosImparesMultiplos3E5);




    }

}
