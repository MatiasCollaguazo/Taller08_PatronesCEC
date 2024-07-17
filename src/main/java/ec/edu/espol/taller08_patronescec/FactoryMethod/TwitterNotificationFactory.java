package ec.edu.espol.taller08_patronescec.FactoryMethod;

/**
 *
 * @author Grupo#2
 */
public class TwitterNotificationFactory extends NotificationFactory{
    @Override
    public NotificationStrat createNotification() { // factoryMethod
        return new TwitterNotification();
    }
}
