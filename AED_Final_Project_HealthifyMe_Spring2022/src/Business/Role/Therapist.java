/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.TherapistOrganization;
import Business.Role.Role.RoleType;
import Business.UserAccount.UserAccount;
import UI.RoleTherapist.WorkAreaTherapistJPanel;
import javax.swing.JPanel;

/**
 *
 * @author agarw
 */
public class Therapist extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new WorkAreaTherapistJPanel(userProcessContainer, account, (TherapistOrganization)organization, enterprise, business, network);
    }    

}
