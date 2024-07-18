package ec.edu.espol.taller08_patronescec.Strategy;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author Grupo#2
 */
public class TwitterNotification implements NotificationStrategy {

    @Override
    public void notifyCustomer(String message, Customer customer) {
         System.out.println("Sending Twitter notification to " + customer.getEmail() + ": " + message);
        //Suponiendo que usamos alguna cuenta de empresa en Twitter/X para hacer llegar el mensaje
    }
}