package Map;

import java.util.*;

public class ExemploOrdenacaoMap {
    //Exibir apenas o Nome do Autor - Nome do Livro)
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória\t--");

        Map<String, Livro> meusLivros = new HashMap<>(); //HashMap é aleatório a entrada
        meusLivros.put("Stephen Hawking", new Livro("Uma Breve História do Tempo", 256));
        meusLivros.put("Charles Duhigg", new Livro("O Poder do Habito", 408));
        meusLivros.put("Yuval Noah Harari", new Livro("21 Lições Para o Século 21", 432));

        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " +livro.getValue().getNome()); //Usando o .getNome() pq tem dois valores

        }

        System.out.println("\n--  Ordem de Inserção  --");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
           put("Stephen Hawking", new Livro("Uma Breve História do Tempo", 256));
            put("Charles Duhigg", new Livro("O Poder do Habito", 408));
            put("Yuval Noah Harari", new Livro("Vinte e Uma Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()){
            System.out.println(livro.getKey() + " - " +livro.getValue().getNome()); //Pega a chave (livro.getKey) e o .getNome() pq tem dois valores no Map.
        }

        System.out.println("\n--  Ordem Alfabética dos Autores  --");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> entry : meusLivros2.entrySet()){
            System.out.println(entry.getKey() +" - " +entry.getValue().getNome());
        }

        System.out.println("\n--  Ordem Alfabética dos Livros  --");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        //System.out.println(meusLivros3);
        for (Map.Entry<String, Livro> entry : meusLivros3){
            System.out.println(entry.getKey() +" - "+entry.getValue().getNome() +" - " +entry.getKey());
        }


        System.out.println("\n--  Ordem de número de Página  --");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> entry : meusLivros4){
            System.out.println("Páginas: "+entry.getValue().getPaginas() +" - Livro: " +entry.getValue().getNome());
        }




    }
}
