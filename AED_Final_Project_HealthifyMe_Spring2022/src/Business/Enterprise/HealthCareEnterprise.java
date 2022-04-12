/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

/**
 *
 * @author anky
 */
import Business.Role.Role;
import java.util.ArrayList;

public class HealthCareEnterprise extends Enterprise{
    public HealthCareEnterprise(String name){
        super(name,Enterprise.EnterpriseType.HealthCareEnt);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
