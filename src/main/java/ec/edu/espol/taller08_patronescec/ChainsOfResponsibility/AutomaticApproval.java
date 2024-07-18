package ec.edu.espol.taller08_patronescec.ChainsOfResponsibility;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author Grupo#2
 */
public class AutomaticApproval extends BaseApprover {
    //Representa un ConcreteHandler
    @Override
    public void approvePurchase(double amount, Customer customer) {
        if (amount < 500) {
            System.out.println("Automatic Approval: Purchase approved.");
            customer.update("Your purchase of $" + amount + " has been automatically approved.");
        } else {
            super.approvePurchase(amount, customer);
        }
    }
}