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
public class Manusia implements Cloneable{
    private int imun;
    private String status_covid;
    private Covid19 corona;
    
    public void setImun(int imun) {
    this.imun = imun;
    }
    /**
     * @return the imun
     */
    public int getImun(){
        return imun;
    }
    
    public void setStatusCovid19() {
        if(this.corona.getActive()){
            if (this.imun > 100) {
                this.corona.setStatus("Negatif");
            } else {
                this.corona.setStatus("Positif");
            }   
        }else{
            this.corona.setStatus("Negatif");
        }
    }
    @Override
    protected Manusia clone() {
        Manusia temp = new Manusia();
        temp.setImun(this.imun);
        
        Covid19 temp_corona = new Covid19();
        temp_corona = this.getCovid19().clone();
        temp.setCovid19(temp_corona);
        
        return (Manusia) temp;
    }
    public void setCovid19(Covid19 corona) {
        this.corona = corona;
    }
    
    public Covid19 getCovid19() {
        return corona;
    }
}
