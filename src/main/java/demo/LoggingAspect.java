package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLoggerWithParam(JoinPoint jp) {
        Signature signature = jp.getSignature();
        System.out.println(signature);
        String arg = jp.getArgs()[0].toString(); // For some reason it gives me an error... Index 0 out of bounds for length 0
        System.out.println("Before Loggers with Argument: " + arg); // And I probably even understand the reason... It's because it sees no argument instead of the 0 argument?
        // Yeah, I guess I kinda fixed that issue... :)
        System.out.println("Before Logger with Param");
    }

    @After("execution(* *.*.checkout(..))")
    public void afterLoggerWithParam() {
        System.out.println("After Logger with Param");
    }


    // This is a pointcut. This is what we have to run.
    @Before("execution(* demo.ShoppingCart.checkout())")
    public void logger() {
        System.out.println("Before Logger");
    }

    @After("execution(* *.*.checkout())")
    public void afterLogger() {
        System.out.println("After Logger");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointcut() {

    }

    @AfterReturning(
            pointcut = "afterReturningPointcut()",
            returning = "retVal"
    )
    public void afterReturning(String retVal) {
        System.out.println("After Returning : " + retVal);
    }

//    @AfterThrowing

}
