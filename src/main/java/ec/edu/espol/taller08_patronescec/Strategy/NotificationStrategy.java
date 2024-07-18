package ec.edu.espol.taller08_patronescec.Strategy;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author Grupo#2
 */
public interface NotificationStrategy {
    //Representa a una Strategy
    void notifyCustomer(String message, Customer customer);
}