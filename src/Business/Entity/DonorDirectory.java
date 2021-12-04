/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lavina
 */
public class DonorDirectory {
    
    private ArrayList<Donor> donorRecords;

    public DonorDirectory(ArrayList<Donor> donorRecords) {
        donorRecords = new ArrayList();
    }

    public ArrayList<Donor> getDonorRecords() {
        return donorRecords;
    }
    
    //Create a new Donor
    public Donor createDonor(String personName, int personAge, String personAddress, String personPhoneNo, 
            String personEmailId, String personBloodType, String personSex, String signature, String referenceName, 
            String referenceNo, boolean isOrganAvailable, List<String> organList){
        
        Donor donor = new Donor();
        donor.setPersonName(personName);
        donor.setPersonAge(personAge);
        donor.setPersonAddress(personAddress);
        donor.setPersonPhoneNo(personPhoneNo);
        donor.setPersonEmailId(personEmailId);
        donor.setPersonBloodType(personBloodType);
        donor.setPersonSex(personSex);
        donor.setSignature(signature);       
        donor.setReferenceName(referenceName);
        donor.setReferenceNo(referenceNo);
        donor.setIsOrganAvailable(isOrganAvailable);
        donor.setOrganList(organList);
        donorRecords.add(donor);
        return donor;
    }
}
