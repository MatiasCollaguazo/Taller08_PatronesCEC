package ec.edu.espol.taller08_patronescec.ChainsOfResponsibility;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author Grupo#2
 */
public interface Approver { 
    //Representa a Handler del diagrama
    void setNext(Approver nextApprover);
    void approvePurchase(double amount, Customer customer); //Handle
}
