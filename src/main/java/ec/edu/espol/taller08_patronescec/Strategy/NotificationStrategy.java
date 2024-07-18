package ec.edu.espol.taller08_patronescec.Strategy;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author Grupo#2
 */
public interface NotificationStrategy {
    void notifyCustomer(String message, Customer customer);
}