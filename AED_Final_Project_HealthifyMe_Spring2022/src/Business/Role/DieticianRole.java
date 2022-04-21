/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DieticianOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.RoleDietician.WorkAreaDieticianJPanel;
import javax.swing.JPanel;
/**
 *
 * @author Simran
 */
public class DieticianRole extends Role  {


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new WorkAreaDieticianJPanel(userProcessContainer, account, (DieticianOrganization)organization, enterprise, business, network);
    }
    
}