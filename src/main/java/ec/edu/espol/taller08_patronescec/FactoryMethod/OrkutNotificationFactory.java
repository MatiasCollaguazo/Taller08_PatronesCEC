package ec.edu.espol.taller08_patronescec.FactoryMethod;

/**
 *
 * @author Grupo#2
 */
public class OrkutNotificationFactory extends NotificationFactory{ //Este seria el analogo a ConcreteCreator
    @Override
    public NotificationStrat createNotification() { // factoryMethod
        return new OrkutNotification();
    }
}
