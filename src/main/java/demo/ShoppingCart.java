package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    // This is called a joined point
    public void checkout() {
        // Logging // An aspect
        // Authentication & Authorization // An aspect
        // Sanitize the Data // An aspect
        // AOP separated the Cross-Cutting concerns. These are aspects ^^^
        System.out.println("Checkout Method from ShoppingCart Called");
    }

    public void checkout(String status) {
        System.out.println("Checkout Method with a status parameter");
    }

}
