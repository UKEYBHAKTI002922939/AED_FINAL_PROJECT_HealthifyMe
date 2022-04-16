/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.SpaOrganization;
import Business.UserAccount.UserAccount;
import UI.RoleSpa.WorkAreaSpaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author anky
 */
public class SpaRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new WorkAreaSpaJPanel(userProcessContainer, account, (SpaOrganization)organization, enterprise, business, network);
    }    
   
}
