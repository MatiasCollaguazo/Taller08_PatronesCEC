package ec.edu.espol.taller08_patronescec.Observer;

/**
 *
 * @author Grupo#2
 */
public interface Subject {
    //Representa a la interfaz subject/publisher
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}