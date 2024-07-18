package ec.edu.espol.taller08_patronescec.Observer;

/**
 *
 * @author Grupo#2
 */
public interface Subject { //Representa a una interfaz subject/publisher para poder usarla en un contexto mas abstracto
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}