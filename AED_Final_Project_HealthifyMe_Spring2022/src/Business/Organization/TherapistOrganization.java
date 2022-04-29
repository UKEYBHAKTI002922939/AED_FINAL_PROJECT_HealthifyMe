/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.Role;
import Business.Role.Therapist;
import java.util.ArrayList;

/**
 *
 * @author agarw
 */
public class TherapistOrganization extends Organization {
    public TherapistOrganization() {
        super(Organization.Type.Therapist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Therapist());
        return roles;
    }
}
