/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.AdminRole;
import Business.Role.Role;
import Business.Role.SpaRole;
import java.util.ArrayList;
/**
 *
 * @author Simran
 */
public class SpaOrganization extends Organization {
    public SpaOrganization() {
        super(Organization.Type.Spa.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SpaRole());
        return roles;
    }
}