package ec.edu.espol.taller08_patronescec.FactoryMethod;

/**
 *
 * @author Grupo#2
 */
public class FacebookNotificationFactory extends NotificationFactory{
    @Override
    public NotificationStrat createNotification() { // factoryMethod
        return new FacebookNotification();
    }
}
