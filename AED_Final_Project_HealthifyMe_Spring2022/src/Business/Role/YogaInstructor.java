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
import Business.Organization.YogaOrganization;
import Business.UserAccount.UserAccount;
import UI.RoleYogaInstructor.WorkAreaYogaInstructorJPanel;
//import UserInterface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author anky
 */
public class YogaInstructor extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new WorkAreaYogaInstructorJPanel(userProcessContainer, account, (YogaOrganization)organization, enterprise, business, network);    
    }
}
