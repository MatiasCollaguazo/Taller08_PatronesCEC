package ec.edu.espol.taller08_patronescec.FactoryMethod;

/**
 *
 * @author Grupo#2
 */
public class FacebookNotificationFactory implements NotificationFactory{
    @Override
    public NotificationStrat createNotification() {
        return new FacebookNotification();
    }
}
