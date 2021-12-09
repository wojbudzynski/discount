package pl.budzynski;

import pl.budzynski.controller.Controller;
import pl.budzynski.view.DiscountsView;
/**
 * Main class.
 * Application for calculating discounts.
 *
 * @author Wojciech Budzyński
 *
 */
public class Main {
    /**
     * This is the main method of the class.
     * @param args Unused.
     * @return Nothing.
     */
    public static void main(String[] args) {
        DiscountsView view=new DiscountsView();
        Controller controller=new Controller(view);
        controller.count();

    }
}
