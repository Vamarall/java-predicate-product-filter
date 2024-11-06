package util;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Tablet", 350.00));
        list.add(new Produto("Notebook", 700.00));
        list.add(new Produto("Cabo Hd", 50.00));
        list.add(new Produto("Cabo HDMI", 90.00));
        list.add(new Produto("Mouse", 70.00));

        list.removeIf(new ProdutoPredicate());

        for (Produto p : list) {
            System.out.println(p);
        }
    }
}
