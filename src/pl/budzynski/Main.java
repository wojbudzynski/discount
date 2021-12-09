package pl.budzynski;

import pl.budzynski.controller.Controller;
import pl.budzynski.view.DiscountsView;

public class Main {
    /**
     * Głowna klasa
     *
     * @author Wojciech Budzyński
     *
     */
    public static void main(String[] args) {
        DiscountsView view=new DiscountsView();
        Controller controller=new Controller(view);
        controller.count();

    }
}
