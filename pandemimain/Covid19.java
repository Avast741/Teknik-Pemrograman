/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandemimain;

/**
 *
 * @author User
 */
public class Covid19 implements Cloneable {
    private boolean active;
    private String status;
    
    public void setActive(boolean act){
        this.active = act;
    }
    
    public boolean getActive(){
        return active;
    }
    
    public void setStatus(String act){
        this.status = act;
    }
    
    public String getStatus(){
        return status;
    }
    
    @Override
    protected Covid19 clone(){
        Covid19 temp = new Covid19();
        temp.setActive(this.active);
        temp.setStatus(this.status);
        return (Covid19) temp;
    }

}
