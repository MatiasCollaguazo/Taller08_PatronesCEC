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

    /**
     *
     * Este metodo vendria a representar strategy.execute()
     */
    public void pay(int amount) { 
        strategy.pay(amount);
    }
    
    
    /*
        Ejemplo de uso en un main:
        PaymentContext context = new PaymentContext();
        PaymentStrategy creditCard = new CreditCardPayment();
        context.setPaymentStrategy(creditCard);
        context.pay(100);

        PaymentStrategy paypal = new PaypalPayment();
        context.setPaymentStrategy(paypal);
        context.pay(200);

        PaymentStrategy bitcoin = new BitcoinPayment();
        context.setPaymentStrategy(bitcoin);
        context.pay(300);
    */
    
}