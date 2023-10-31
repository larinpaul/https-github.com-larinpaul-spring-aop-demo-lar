package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // This is a pointcut. This is what we have to run.
    @Before("execution(* demo.ShoppingCart.checkout())")
    public void logger() {
        System.out.println("Before Logger");
    }

    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLoggerWithParam() {
        System.out.println("Before Logger with Param");
    }

    @After("execution(* *.*.checkout())")
    public void afterLogger() {
        System.out.println("After Logger");
    }

    @After("execution(* *.*.checkout(..))")
    public void afterLoggerWithParam() {
        System.out.println("After Logger with Param");
    }

}
