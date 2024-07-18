package ec.edu.espol.taller08_patronescec.Strategy;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author Grupo#2
 */
public class NotificationContext {
    private NotificationStrategy strategy;
    
    public void setNotificationStrategy(NotificationStrategy strategy){
        this.strategy = strategy;
    }
    
    public void sendNotification(String message, Customer customer){
        strategy.notifyCustomer(message,customer);
    }
}
