/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.DoctorWorkspace.DoctorMainPage;
import UserInterface.DoctorWorkspace.DoctorRequestPatientTestPanel;
import javax.swing.JPanel;

/**
 *
 * @author amey
 */
public class DoctorRole extends Role{

     RoleType roleType = RoleType.DoctorRole;
    
    @Override
    public String toString() {
        return this.roleType.getValue();
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization org, Enterprise enterprise, EcoSystem business) {
        return new DoctorMainPage(userProcessContainer, enterprise, account, business);    
    }
  
}
