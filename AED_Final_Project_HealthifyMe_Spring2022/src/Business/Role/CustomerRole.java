/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.Customer.CustomerLoginWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author anky
 */
public class CustomerRole extends Role {

    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
         return new CustomerLoginWorkAreaJPanel(userProcessContainer, (CustomerOrganization)organization, business, network);
    } 
 
}
