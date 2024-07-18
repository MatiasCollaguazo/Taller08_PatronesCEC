package ec.edu.espol.taller08_patronescec.Strategy;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author Grupo#2
 */
public class OrkutNotification implements NotificationStrategy {
    //Representa una de las ConcreteStrategies
    @Override
    public void notifyCustomer(String message, Customer customer) {
          System.out.println("Sending Orkut notification to " + customer.getEmail() + ": " + message);
          //Suponiendo que usamos alguna cuenta de Orkut para hacer llegar el mensaje
    }
}