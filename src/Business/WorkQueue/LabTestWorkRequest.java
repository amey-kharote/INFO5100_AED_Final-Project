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
public class LabTestWorkRequest extends WorkRequest{
    
    private String patientName;
    private String attachedFile;
    private String labResult;

    public String getPatientName() {
        return patientName;
    }

    public String getAttachedFile() {
        return attachedFile;
    }

    public String getLabResult() {
        return labResult;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAttachedFile(String attachedFile) {
        this.attachedFile = attachedFile;
    }

    public void setLabResult(String labResult) {
        this.labResult = labResult;
    }
    
    
}
