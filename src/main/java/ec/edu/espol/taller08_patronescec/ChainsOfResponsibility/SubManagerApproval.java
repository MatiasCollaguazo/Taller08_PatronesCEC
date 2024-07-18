package ec.edu.espol.taller08_patronescec.ChainsOfResponsibility;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author Grupo#2
 */
public class SubManagerApproval extends BaseApprover {
    //Representa un ConcreteHandler
    @Override
    public void approvePurchase(double amount, Customer customer) {
        if (amount >= 1000 && amount < 2000) {
            System.out.println("SubManager Approval: Purchase approved.");
            customer.update("Your purchase of $" + amount + " has been approved by the submanager.");
        } else {
            super.approvePurchase(amount, customer);
        }
    }
}