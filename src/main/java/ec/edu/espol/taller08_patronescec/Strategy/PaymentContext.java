package ec.edu.espol.taller08_patronescec.Strategy;

/**
 *
 * @author Grupo#2
 * 
 */
public class PaymentContext{//Esto representa el Context
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(int amount) {
        strategy.pay(amount);
    }
}