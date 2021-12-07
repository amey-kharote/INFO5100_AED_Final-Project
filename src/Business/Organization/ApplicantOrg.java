/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Entity.DonorDirectory;
import Business.Entity.RecipientDirectory;
import Business.Role.ApplicantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Lavina
 */
public class ApplicantOrg extends Organization {
   
    private DonorDirectory donorDirectory;
    private RecipientDirectory recipientDirectory;

    public DonorDirectory getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(DonorDirectory donorDirectory) {
        this.donorDirectory = donorDirectory;
    }

    public RecipientDirectory getRecipientDirectory() {
        return recipientDirectory;
    }

    public void setRecipientDirectory(RecipientDirectory recipientDirectory) {
        this.recipientDirectory = recipientDirectory;
    }
    
    public ApplicantOrg() {
        super(Organization.OrganizationType.Applicant.getValue());
        donorDirectory = new DonorDirectory();
        recipientDirectory = new RecipientDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList <Role> supportedRole = new ArrayList<>();
        supportedRole.add(new ApplicantRole());
        return supportedRole;        
    }
}
