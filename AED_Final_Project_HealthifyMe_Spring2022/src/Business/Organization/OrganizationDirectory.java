/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author agarw
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Salon.getValue())) {
            organization = new SalonOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Spa.getValue())) {
            organization = new SpaOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Meditation.getValue())) {
            organization = new MeditationOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Therapist.getValue())) {
            organization = new TherapistOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Dietician.getValue())) {
            organization = new DieticianOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Gym.getValue())) {
            organization = new GymOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Yoga.getValue())) {
            organization = new YogaOrganization();
            organizationList.add(organization);
        }

        return organization;
    }
}
