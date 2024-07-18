package ec.edu.espol.taller08_patronescec.Strategy;

/**
 *
 * @author Grupo#2
 * 
 */
public class PeiGoPayment implements PaymentStrategy {
    //Representa una de las ConcreteStrategies
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PeiGo application.");
    }
}