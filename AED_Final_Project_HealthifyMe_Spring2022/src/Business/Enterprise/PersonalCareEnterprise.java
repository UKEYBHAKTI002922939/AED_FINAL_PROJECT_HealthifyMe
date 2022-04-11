/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Simran
 */
public class PersonalCareEnterprise extends Enterprise{
    public PersonalCareEnterprise(String name){
        super(name,Enterprise.EnterpriseType.PersonalCareEnt);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
