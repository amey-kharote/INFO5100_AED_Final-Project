/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entity;

/**
 *
 * @author Lavina
 */
public class Recipient extends Person implements Comparable<Recipient>{
    
    private int priorityNo;
    private String organType;
  
    public void setPriorityNo(int priorityNo) {
        this.priorityNo = priorityNo;
    }
    
    public int getPriorityNo() {
        return priorityNo;
    }

    public void setOrganType(String organType) {
        this.organType = organType;
    }
    
        public String getOrganType() {
        return organType;
    }
        
    @Override
    public String toString() {
        return this.getPersonName();
    }
    
    public int compareTo(Recipient o) {
		return Integer.compare(o.getPriorityNo(), this.getPriorityNo());
	}
    
}
