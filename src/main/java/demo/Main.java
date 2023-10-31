package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        ShoppingCart cart = context.getBean(ShoppingCart.class);

//        cart.checkout();

        cart.checkout("Test with a parameter");

        int quantity = cart.quantity();
        System.out.println(quantity); // Well, it just printed out 2... ?_?

    }

}
