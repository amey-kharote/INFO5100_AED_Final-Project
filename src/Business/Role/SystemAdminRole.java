/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import UserInterface.SystemAdminWorkspace.SystemAdminDashboard;
import javax.swing.JPanel;

/**
 *
 * @author amey
 */
public class SystemAdminRole extends Role{
    
    RoleType roleType = RoleType.SystemAdminRole;
    
    @Override
    public String toString() {
        return this.roleType.getValue();
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization org, Enterprise enterprise, EcoSystem business) {
         return new SystemAdminDashboard(userProcessContainer, business);
    }   
}
