/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author amey
 */
public abstract class Role {

    public enum RoleType {
        ApplicantRole("Applicant"),
        CampaignManagerRole("Campaign Manager"),
        CorporateManagerRole("Corporate Manager"),
        DoctorRole("Doctor"),
        EnterpriseManagerRole("Enterprise Manager"),
        InternalLabAssistantRole("Internal Lab Assistant"),
        SystemAdminRole("System Admin"),
        LabAssistantRole("Lab Assistant"),
        TrustManagerRole("Trust Manager");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Role createRole(Role.RoleType roleType) {
        Role roleObj = null;
        if (roleType.equals(RoleType.ApplicantRole)) {
            roleObj = new ApplicantRole();
        } else if (roleType.equals(RoleType.CampaignManagerRole)) {
            roleObj = new CampaignManagerRole();
        } else if (roleType.equals(RoleType.DoctorRole)) {
            roleObj = new DoctorRole();
        } else if (roleType.equals(RoleType.LabAssistantRole)) {
            roleObj = new LabAssistantRole();
        } else if (roleType.equals(RoleType.InternalLabAssistantRole)) {
            roleObj = new InternalLabAssistantRole();
        } else if (roleType.equals(RoleType.CorporateManagerRole)) {
            roleObj = new CorporateManagerRole();
        } else if (roleType.equals(RoleType.TrustManagerRole)) {
            roleObj = new TrustManagerRole();
        } else if (roleType.equals(RoleType.SystemAdminRole)) {
            roleObj = new TrustManagerRole();
        } else if (roleType.equals(RoleType.EnterpriseManagerRole)) {
            roleObj = new EnterpriseManagerRole();
        }
        return roleObj;
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization org,
            Enterprise enterprise,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
