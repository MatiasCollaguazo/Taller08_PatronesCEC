package ec.edu.espol.taller08_patronescec.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grupo#2
 */

public class NotificationService implements Subject {
    // Clase Subject/Publisher concreta
    private List<Observer> observers = new ArrayList<>();
    
    public List<Observer> getObservers(){
        return observers;
    }
    
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void newPromotion(String promotionDetails) {
        notifyObservers("New Promotion: " + promotionDetails);
    }

    public void newBenefit(String benefitDetails) {
        notifyObservers("New Benefit: " + benefitDetails);
    }
    
    public void notifyPurchase(Customer customer, String purchaseDetails) {
        customer.update("Purchased: " + purchaseDetails);
        //Para que solo el cliente que haya comprado reciba la notificación y 
        //no necesariemente tenga que estar suscrito a las notificaciones por email
        
    }
}