/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author anky
 */

public class MentalHealthEnterprise {
     public MentalHealthEnterprise(String name){
        super(name,Enterprise.EnterpriseType.MentalHealthEnt);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
