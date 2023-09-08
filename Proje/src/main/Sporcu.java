package main;

import javax.swing.ImageIcon;



public class Sporcu {

    private String sporcuİsim;
    private String sporcuTakım;
    ImageIcon kart;
    

    
    
    public Sporcu(){
    
    }
    public Sporcu(String sporcuİsim, String sporcuTakım, String kart) {
        this.sporcuİsim = sporcuİsim;
        this.sporcuTakım = sporcuTakım;
        this.kart= new ImageIcon(getClass().getResource(kart));
    }

    public String getSporcuİsim() {
        return sporcuİsim;
    }

    public void setSporcuİsim(String sporcuİsim) {
        this.sporcuİsim = sporcuİsim;
    }

    public String getSporcuTakım() {
        return sporcuTakım;
    }

    public void setSporcuTakım(String sporcuTakım) {
        this.sporcuTakım = sporcuTakım;
    }
    
       
 public void sporcuPuanıGöster(){
    System.out.println("Sporcunun puanı:");
}   
    
   
}
