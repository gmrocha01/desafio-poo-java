package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(7.0); //Apresenta erro se colocar sem a casa decimal pois é Double
        notas.add(8.0);
        notas.add(5.4);
        notas.add(5.0);
        notas.add(8.2);
        notas.add(8.0);
        notas.add(9.0);
        System.out.println(notas);
        System.out.println(notas.toString());
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d); //Esse .add é usado para adicionar em um indice o elemento que queremos.
        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pela nota 6.0 ");
        notas.set(notas.indexOf(5.0), 6.0); //Set modifica. Nesse caso está modificando o 5.0 pelo 6.0
        System.out.println(notas);
        System.out.println("Confira se a nota 5.0 está na lista" + notas.contains(5D)); //Vai retornar TRUE OU FALSE
        System.out.println("Confira se a nota 5.0 está na lista" + notas.contains(8D)); //Vai retornar TRUE OU FALSE
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (double nota : notas) System.out.println(nota);
        System.out.println("Exiba a terceira nota adicionada: " +notas.get(2)); //.get pega o valor do indice solicitado
        System.out.println(notas.toString());
        System.out.println("Exiba a menor nota: ");
        System.out.println(Collections.min(notas)); //Exibe a menor nota da lista.
        System.out.println("Exiba a maior nota: ");
        System.out.println(Collections.max(notas)); //Exibe a maior nota da lista.
        Iterator<Double> iterator = notas.iterator();
        double soma = 0;
        while (iterator.hasNext()){ //iterator.hasNext realiza o teste se possui algum elemento depois
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores da lista: " +soma);
        System.out.println("Exiba a média dos valores da lista: ");
        System.out.println(soma / notas.size()); // .size mostra o tamanho da lista.
        System.out.println("Remova a nota 8.0 ");
        notas.remove(8.0); //Remove o elemento passado
        System.out.println(notas);
        System.out.println("Remova a nota da posição 0");
        notas.remove(0); //Remove o elemento do indice passado


        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){ //Pergunta se tem próximo, se for TRUE continua
            Double next = iterator1.next(); //Cria uma variável e armazena iterator1.next()
            if (next < 7){ //Testa a variável
                iterator1.remove(); //Remove
            }

        }
        System.out.println("Remova as notas menores que 7 e mostre a lista ");
        System.out.println(notas.toString());
        System.out.println("Apague toda a lista: ");
        notas.clear(); //Método Clear apaga TODA a lista
        System.out.println(notas);
        System.out.println("Confira se a lista está vazia: " +notas.isEmpty()); //TRUE se tiver vazia, False se não tiver
        if(notas.isEmpty()) System.out.println("A lista está vazia");





    }
}
