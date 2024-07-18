package ec.edu.espol.taller08_patronescec.ChainsOfResponsibility;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author Grupo#2
 */
public class SupervisorApproval extends BaseApprover {
    //Representa un ConcreteHandler
    @Override
    public void approvePurchase(double amount, Customer customer) {
        if (amount >= 500 && amount < 1000) {
            System.out.println("Supervisor Approval: Purchase approved.");
            customer.update("Your purchase of $" + amount + " has been approved by the supervisor.");
        } else {
            super.approvePurchase(amount, customer);
        }
    }
}