package ec.edu.espol.taller08_patronescec.Strategy;

/**
 *
 * @author Grupo#2
 * 
 */
public class CreditCardPayment implements PaymentStrategy {//Esto representa una de las ConcreteStrategies
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}