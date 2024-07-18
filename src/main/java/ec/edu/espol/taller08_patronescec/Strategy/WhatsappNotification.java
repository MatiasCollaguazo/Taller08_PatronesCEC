package ec.edu.espol.taller08_patronescec.Strategy;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author Grupo#2
 */
public class WhatsappNotification implements NotificationStrategy {
    //Representa una de las ConcreteStrategies
    @Override
    public void notifyCustomer(String message, Customer customer) {
        System.out.println("Sending Whatsapp notification to " + customer.getPhoneNumber() + ": " + message);
        //Suponiendo que usamos un numero de cuenta de empresa para enviar el mensaje
    }
}