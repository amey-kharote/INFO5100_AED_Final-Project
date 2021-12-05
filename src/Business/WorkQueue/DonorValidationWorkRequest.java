/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author amey
 */
public class DonorValidationWorkRequest extends WorkRequest{
    
    private String donorName;
    private int donorAge;
    private boolean physicalInjury;
    private boolean drinkingHistory;
    private boolean smokingHistory;
    private boolean diabetic;
    private boolean heartDisease;

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public int getDonorAge() {
        return donorAge;
    }

    public void setDonorAge(int donorAge) {
        this.donorAge = donorAge;
    }

    public boolean isPhysicalInjury() {
        return physicalInjury;
    }

    public void setPhysicalInjury(boolean physicalInjury) {
        this.physicalInjury = physicalInjury;
    }

    public boolean isDrinkingHistory() {
        return drinkingHistory;
    }

    public void setDrinkingHistory(boolean drinkingHistory) {
        this.drinkingHistory = drinkingHistory;
    }

    public boolean isSmokingHistory() {
        return smokingHistory;
    }

    public void setSmokingHistory(boolean smokingHistory) {
        this.smokingHistory = smokingHistory;
    }

    public boolean isDiabetic() {
        return diabetic;
    }

    public void setDiabetic(boolean diabetic) {
        this.diabetic = diabetic;
    }

    public boolean isHeartDisease() {
        return heartDisease;
    }

    public void setHeartDisease(boolean heartDisease) {
        this.heartDisease = heartDisease;
    }
    
    
    
}
