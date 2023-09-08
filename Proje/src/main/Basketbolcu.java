package main;



public class Basketbolcu extends Sporcu {
    private int ikilik;
    private int üçlük;
    private int rebound;
    

    public Basketbolcu() {
    }

    public Basketbolcu(int ikilik, int üçlük, int rebound, String sporcuİsim, String sporcuTakım, String kart) {
        super(sporcuİsim, sporcuTakım, kart);
        this.ikilik = ikilik;
        this.üçlük = üçlük;
        this.rebound = rebound;
        
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getÜçlük() {
        return üçlük;
    }

    public void setÜçlük(int üçlük) {
        this.üçlük = üçlük;
    }

    public int getRebound() {
        return rebound;
    }

    public void setRebound(int rebound) {
        this.rebound = rebound;
    }

    @Override
    public void sporcuPuanıGöster() {
        System.out.println("Basketbolcu: "+this.getSporcuİsim());
        System.out.println("İkilik: "+this.ikilik);
        System.out.println("Üçlük: "+this.üçlük);
        System.out.println("Rebound: "+this.rebound);

    }
    
    
    
    
    
}
