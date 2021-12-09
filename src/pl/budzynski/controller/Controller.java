package pl.budzynski.controller;

import pl.budzynski.model.Product;
import pl.budzynski.view.DiscountsView;

public class Controller {
    DiscountsView view;
    ProductController productController;
    DiscountController discountController;

    public Controller(DiscountsView view) {
        this.view=view;

        productController=new ProductController();
        discountController=new DiscountController();

        productController.addBaseData();
        discountController.addBaseData();
    }

    public void count(){
        double sum=0;
        for(Product p: productController.getProducts())
        {
            sum=sum+p.getPrice();
        }
        int i=0;
        for(Product p:productController.getProducts()) {
            if(++i==productController.getProducts().size())
                view.addProduct(p,countProductDiscount(p,sum,true));
            else
                view.addProduct(p,countProductDiscount(p,sum,false));
        }

        view.showResult();
    }

    private double countProductDiscount(Product p, double sum,boolean isLast) {
        int prise= (int) p.getPrice()*100;
        int part= (int) (discountController.getDiscount()*100/sum);

        int productDiscount= prise*part/100;
        if(isLast) {
            double a= (double) ((int)((discountController.getDiscount())*100)%(int)sum)/100;
            return (double)productDiscount/100+a;
        }
        return (double)productDiscount/100;
    }

}
