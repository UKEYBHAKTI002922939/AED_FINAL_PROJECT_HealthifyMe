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
import Business.Organization.SalonOrganization;
import Business.UserAccount.UserAccount;
import UI.SalonRole.SalonWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author agarw
 */
public class SalonRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
    return new SalonWorkAreaJPanel(userProcessContainer, account, (SalonOrganization)organization, enterprise, business, network);
    }

}
