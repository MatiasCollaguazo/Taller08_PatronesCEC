package ec.edu.espol.taller08_patronescec.FactoryMethod;

/**
 *
 * @author Grupo#2
 */
public class OrkutNotificationFactory implements NotificationFactory{
    @Override
    public NotificationStrat createNotification() {
        return new OrkutNotification();
    }
}
