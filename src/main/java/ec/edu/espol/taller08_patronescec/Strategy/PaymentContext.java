package ec.edu.espol.taller08_patronescec.Strategy;

/**
 *
 * @author Grupo#2
 * 
 */
public class PaymentContext{
    //Representa el Context
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Este metodo vendria a representar strategy.execute()
     */
    public void pay(int amount) { 
        strategy.pay(amount);
    }
    
}