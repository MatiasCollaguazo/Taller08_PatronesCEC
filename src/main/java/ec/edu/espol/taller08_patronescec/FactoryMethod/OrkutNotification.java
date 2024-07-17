package ec.edu.espol.taller08_patronescec.FactoryMethod;

/**
 *
 * @author Grupo#2
 */
public class OrkutNotification implements NotificationStrat{ // Este seria el analogo a Concrete Product
    @Override
    public void send(String message) {
          System.out.println("Enviando notificacion de Orkut: " + message);
    }
}
