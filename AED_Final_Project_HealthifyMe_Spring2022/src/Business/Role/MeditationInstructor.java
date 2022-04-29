/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.MeditationOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.HouseCleaningRole.HouseCleanWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author anky
 */
public class MeditationInstructor extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new HouseCleanWorkAreaJPanel(userProcessContainer, account, (MeditationOrganization)organization, enterprise, business, network);
    }    

}
