/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.GymOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.RoleGymInstructor.GymInstructorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author agarw
 */
public class GymInstructor extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new GymInstructorWorkAreaJPanel(userProcessContainer, account, (GymOrganization)organization, enterprise, business, network);
    }    
    
}
