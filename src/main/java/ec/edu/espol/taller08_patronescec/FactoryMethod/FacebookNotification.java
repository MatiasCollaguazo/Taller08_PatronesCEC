package ec.edu.espol.taller08_patronescec.FactoryMethod;

/**
 *
 * @author Grupo#2
 */
public class FacebookNotification implements NotificationStrat{
    @Override
    public void send(String message) {
          System.out.println("Enviando notificacion de Facebook: " + message);
    }
}
