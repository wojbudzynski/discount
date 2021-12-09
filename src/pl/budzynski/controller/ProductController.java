package pl.budzynski.controller;

import pl.budzynski.model.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class ProductController {
    List<Product> products= new ArrayList<Product>();

    public ProductController() {
    }

    public void addBaseData() {
        addProduct(new Product("A",1500));
        addProduct(new Product("B",500));
    }

    public void addProduct(Product product) {
        if(validate(product))
            products.add(product);
    }
    private boolean validate(Product product){

        BigDecimal bd = new BigDecimal(product.getPrice()).setScale(2, RoundingMode.UP);
        product.setPrice(bd.doubleValue());

        if(products.size()==5)
            System.out.println("Za dużo produktów. Można dodać maksymalnie 5. Produkt nie został dodany.");
        else if (product.getPrice()<=0)
            System.out.println("Niepoprawna cena produktu. Produkt nie został dodany.");
        else
            return true;

        return false;
    }

    public Product getProduct(int i){
        return products.get(i);
    }
    public List<Product> getProducts(){
        return products;
    }
}
