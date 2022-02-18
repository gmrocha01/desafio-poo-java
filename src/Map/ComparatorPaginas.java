package Map;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        //Usa Integer por que é número. PS: Se fosse Double seria Double.
        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }
}
