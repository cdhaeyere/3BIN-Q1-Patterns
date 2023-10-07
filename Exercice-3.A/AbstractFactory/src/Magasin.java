import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Magasin {

    private Map<String,Product> bac= new HashMap<>();
    public void ajouterProduit(String name, int anneeDeParution, Shape shape){
        Product product = shape.createProduct(name, anneeDeParution);
        bac.put(name, product);
    }
    public Product retourneProduit(String name){
        return bac.get(name);
    }
}
