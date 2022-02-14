package ListaOrdenada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
           add(new Gato("Jon", "Preto", 3));
           add(new Gato("Simba", "Branco", 4));
           add(new Gato("Jon", "Amarela", 1));
        }};

        System.out.println("----- Ordem de Inserção -----");
        System.out.println(meusGatos); //Imprime a lista pq o toString foi montado na classe.
        //Se não tivesse montado o ToString, apareceria o endereço de memória.
        System.out.println("----- Ordem Aleatória -----");
        Collections.shuffle(meusGatos); //Shuffle mostra em ordem aleatória a lista passada.
        System.out.println(meusGatos);
        System.out.println("----- Ordem Natural -----");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println("----- Ordem de Idade -----");
        Collections.sort(meusGatos, new ComparatorIdade());
        //meusGatos.sort(new ComparatorIdade());  Também funciona desse jeito
        System.out.println(meusGatos);
        System.out.println("----- Ordem de Cor -----");
        meusGatos.sort(new ComparatorCor());
        //Collections.sort(meusGatos, new ComparatorCor());  Também funciona desse jeito
        System.out.println(meusGatos);
        System.out.println("----- Ordem Nome/Cor/Idade -----");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);


    }
}
