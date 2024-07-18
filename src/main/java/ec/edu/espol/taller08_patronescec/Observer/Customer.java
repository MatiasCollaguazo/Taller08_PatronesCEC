package ec.edu.espol.taller08_patronescec.Observer;

/**
 *
 * @author Grupo#2
 */
public class Customer implements Observer {// Clase Observer/Suscriber especifica
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}