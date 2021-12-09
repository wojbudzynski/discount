package pl.budzynski.view;

import pl.budzynski.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DiscountsView {
    List<String> rows=new ArrayList<String>();

    public void showResult(){
        for(String s:rows)
            System.out.println(s);
    }

    public void addProduct(Product product, double productDiscount) {
        java.text.DecimalFormat df=new java.text.DecimalFormat("0.00");
        if((int)(productDiscount*100)%100==0)
            df=new java.text.DecimalFormat("0");
        rows.add("Rabat dla produktu: "+product.getName()+" = "+df.format(productDiscount)+"zł");

    }
}
