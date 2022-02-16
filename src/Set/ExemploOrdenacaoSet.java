package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        Set<Serie> minhasSeries = new HashSet<>(){{ //O Hashset é organizado baseado no valor do Hash
                add(new Serie("eweweGame of Throes", "Aventura", 60));
                add(new Serie("dasdasdsadThe Witcher", "Fantasia", 60));
                add(new Serie("How I Met Your Mother", "Comedia", 20));
                add(new Serie("Sabrina", "Terror", 50));
            }};


        System.out.println("Imprimir em Ordem baseada pelo número Hash (Semi aleatório)");
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "
                +serie.getGenero() +" - " +serie.getTempoEpisodio());

        System.out.println("\nOrdem de Inserção: ");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{ //Imprime na ordem de inserção
            add(new Serie("The Office", "Comedia", 20));
            add(new Serie("Brooklyn 99", "Comedia", 25));
            add(new Serie("Suits", "Advogado", 40));
            add(new Serie("Sabrina", "Terror", 50));
        }};
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "
                +serie.getGenero() +" - " +serie.getTempoEpisodio());

        System.out.println("\nOrdem Natural: (TempoEpisodio");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - "
                +serie.getGenero() +" - " +serie.getTempoEpisodio());

        System.out.println("\nOrdem Nome/Genero/TempoEpisodio");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio()){{ //Imprime na ordem de inserção
            add(new Serie("The Office", "Comedia", 20));
            add(new Serie("Brooklyn 99", "Comedia", 25));
            add(new Serie("Suits", "Advogado", 40));
            add(new Serie("Sabrina", "Terror", 50));
        }};
        //addAll adiciona uma collection, nesse caso abaixo está adicionando o Set minhasSeries1.
        //minhasSeries3.addAll(minhasSeries1);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
                +serie.getGenero() +" - " +serie.getTempoEpisodio());



    }

}
