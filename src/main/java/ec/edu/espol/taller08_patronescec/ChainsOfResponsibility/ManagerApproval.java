package ec.edu.espol.taller08_patronescec.ChainsOfResponsibility;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author matia
 */
public class ManagerApproval extends BaseApprover {
    @Override
    public void approvePurchase(double amount, Customer customer) {
        if (amount >= 2000) {
            System.out.println("Manager Approval: Purchase approved.");
            customer.update("Your purchase of $" + amount + " has been approved by the manager.");
        } else {
            super.approvePurchase(amount, customer);
        }
    }
}