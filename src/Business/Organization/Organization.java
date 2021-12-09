/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Entity.DonorDirectory;
import Business.Entity.RecipientDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author ninos
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 0;
    private DonorDirectory donorDirectory;
    private RecipientDirectory recipientDirectory;

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        donorDirectory = new DonorDirectory();
        recipientDirectory = new RecipientDirectory();
        ++counter;
    }

    public Organization() {

    }

    // setting enums for organizations in different enterprises
    public enum OrganizationType {
        // hospital enterprise org
        InternalLab("InternalLab Org"),
        Doctor("Doctor Org"),
        Applicant("Applicant Org"),
        // campaign enterprise org
        RedCrossAwarenessOrg("RedCross Awareness Org"),
        // funding enterprise org
        TrustFund("Trust Fund Org"),
        CorporateFund("Corporate Fund Org"),
        // lab enterprise org
        Radiology("Radiology Org"),
        Pathology("Screening Org");

        private String value;

        private OrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public DonorDirectory getDonorDirectory() {
        return donorDirectory;
    }
    
    public RecipientDirectory getRecipientDirectory(){
        return recipientDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

}
