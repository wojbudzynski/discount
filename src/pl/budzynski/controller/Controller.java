package pl.budzynski.controller;

import pl.budzynski.model.Product;
import pl.budzynski.view.DiscountsView;
/**
 * The class acts as the main controller in the MVC model.
 *
 */
public class Controller {
    DiscountsView view;
    ProductController productController;
    DiscountController discountController;
    /**
     * Class constructor.
     * Assigns a view.
     * Creating child controller.
     * Calling methods that add input data.
     * @param view View presenting data to the user.
     * @return Nothing.
     */
    public Controller(DiscountsView view) {
        this.view=view;

        productController=new ProductController();
        discountController=new DiscountController();

        productController.addBaseData();
        discountController.addBaseData();
    }
    /**
     * The method calculates discounts for individual products.
     * Sums up the prices of the products.
     * Calculates discounts for products.
     * Updates view.
     * @return Nothing.
     */
    public void count(){
        double sum=0;
        double currentsum=0;
        for(Product p: productController.getProducts())
        {
            sum=sum+p.getPrice();
        }
        int i=0;
        for(Product p:productController.getProducts()) {
            if(++i==productController.getProducts().size())
                view.addProduct(p,discountController.getDiscount()-currentsum);
            else {
                double productDiscount=countProductDiscount(p,sum);
                currentsum+=productDiscount;
                view.addProduct(p, productDiscount);
            }
        }

        view.showResult();
    }
    /**
     * The method calculates discounts for product.
     * Converts the value into grosze.
     * Runs the calculations.
     * Returns to PLN value.
     * @param p Current product.
     * @param sum Sum of product prices.
     * @return Discount value for the product.
     */
    private double countProductDiscount(Product p, double sum) {
        double prise= p.getPrice()*100;
        double part= ((discountController.getDiscount()*100)/(sum*100));

        double productDiscount= (int)(prise*part);

        return productDiscount/100;
    }

}
