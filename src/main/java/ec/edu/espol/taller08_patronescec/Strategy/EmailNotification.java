package ec.edu.espol.taller08_patronescec.Strategy;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author Grupo#2
 */
public class EmailNotification implements NotificationStrategy {

    @Override
    public void notifyCustomer(String message, Customer customer) {
        System.out.println("Via Email to :"+customer.getEmail()+"\n"+message);
    }
}