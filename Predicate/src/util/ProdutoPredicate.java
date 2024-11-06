package util;
import java.util.function.Predicate;

//Interface funcional
public class ProdutoPredicate implements Predicate<Produto> {

    @Override
    public boolean test(Produto p) {
        return p.getValor() > 100.00;
    }

}
