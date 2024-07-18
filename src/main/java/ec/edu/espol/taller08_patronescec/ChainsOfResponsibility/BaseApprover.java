package ec.edu.espol.taller08_patronescec.ChainsOfResponsibility;

import ec.edu.espol.taller08_patronescec.Observer.Customer;

/**
 *
 * @author Grupo#2
 */
public abstract class BaseApprover implements Approver {//Representa a BaseHandler
    protected Approver nextApprover;

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void approvePurchase(double amount, Customer customer) {
        if (nextApprover != null) {
            nextApprover.approvePurchase(amount, customer);
        }
    }
}