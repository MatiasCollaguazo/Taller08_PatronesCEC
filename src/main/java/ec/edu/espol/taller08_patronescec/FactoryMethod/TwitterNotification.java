package ec.edu.espol.taller08_patronescec.FactoryMethod;

/**
 *
 * @author Grupo#2
 */
public class TwitterNotification implements NotificationStrat{
    @Override
    public void send(String message) {
          System.out.println("Enviando notificacion de Twitter: " + message);
    }
}
