package ec.edu.espol.taller08_patronescec.Strategy;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author Grupo#2
 */
public class NotificationContext {
    //Representa un Context
    private NotificationStrategy strategy;
    
    public void setNotificationStrategy(NotificationStrategy strategy){
        this.strategy = strategy;
    }
    
    /**
     * Este metodo vendria a representar strategy.execute()
     */
    public void sendNotification(String message, Customer customer){
        strategy.notifyCustomer(message,customer);
    }
}
