package ec.edu.espol.taller08_patronescec.Strategy;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author Grupo#2
 */
public class SmsNotification implements NotificationStrategy {

    @Override
    public void sendNotification(String message, Customer customer) {
        System.out.println("Email to " + customer.getEmail() + ": " + message);
    }
}