package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout() {
        // Logging
        // Authentication & Authorization
        // Sanitize the Data
        // AOP separated the Cross-Cutting concerns. These are aspects ^^^
        System.out.println("Checkout Method from ShoppingCart Called");
    }

}
