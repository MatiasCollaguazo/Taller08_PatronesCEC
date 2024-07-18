package ec.edu.espol.taller08_patronescec.Observer;

import ec.edu.espol.taller08_patronescec.Strategy.PaymentStrategy;


/**
 *
 * @author Grupo#2
 */
public class Customer implements Observer {// Clase Observer/Suscriber especifica
    private String name;
    private String email;
    private PaymentStrategy paymentStrategy;
    private String phoneNumber;
    
    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("New notification: " + message);
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
}