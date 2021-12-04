/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import java.util.List;

/**
 *
 * @author Lavina
 */
public class Donor extends Person{
    
    private String referenceName;
    private String referenceNo;
    private boolean isOrganAvailable;
    
    List<String> organList;

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public boolean isIsOrganAvailable() {
        return isOrganAvailable;
    }

    public void setIsOrganAvailable(boolean isOrganAvailable) {
        this.isOrganAvailable = isOrganAvailable;
    }

    public List<String> getOrganList() {
        return organList;
    }

    public void setOrganList(List<String> organList) {
        this.organList = organList;
    }

    @Override
    public String toString() {
        return this.referenceName;
    }

}
