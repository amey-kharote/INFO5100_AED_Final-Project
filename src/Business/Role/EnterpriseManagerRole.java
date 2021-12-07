/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import UserInterface.CommonUI.OrganizationAdminReusableWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author amey
 */
public class EnterpriseManagerRole extends Role{
    
    RoleType roleType = RoleType.EnterpriseManagerRole;
    
    @Override
    public String toString() {
        return this.roleType.getValue();
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization org, Enterprise enterprise, EcoSystem business) {
        return new OrganizationAdminReusableWorkArea(userProcessContainer, enterprise);
    }
}
