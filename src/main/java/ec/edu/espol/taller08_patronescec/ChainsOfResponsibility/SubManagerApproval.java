package ec.edu.espol.taller08_patronescec.ChainsOfResponsibility;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author matia
 */
public class SubManagerApproval extends BaseApprover {
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