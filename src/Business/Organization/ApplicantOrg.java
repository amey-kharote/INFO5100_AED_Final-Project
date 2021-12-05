/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ApplicantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Lavina
 */
public class ApplicantOrg extends Organization {

    public ApplicantOrg() {
        super(Organization.OrganizationType.Applicant.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
