package main;



public class Futbolcu extends Sporcu{
    private int penaltı;
    private int serbestVuruş;
    private int çalım;
    

    public Futbolcu(){
    }

    
    public Futbolcu(int penaltı, int serbestVuruş, int çalım, String sporcuİsim, String sporcuTakım, String kart) {
        super(sporcuİsim, sporcuTakım, kart);
        this.penaltı = penaltı;
        this.serbestVuruş = serbestVuruş;
        this.çalım = çalım;
        
    }

    public int getPenaltı() {
        return penaltı;
    }

    public void setPenaltı(int penaltı) {
        this.penaltı = penaltı;
    }

    public int getserbestVuruş() {
        return serbestVuruş;
    }

    public void setserbestVuruş(int serbestVuruş) {
        this.serbestVuruş = serbestVuruş;
    }

    public int getÇalım() {
        return çalım;
    }

    public void setÇalım(int çalım) {
        this.çalım = çalım;
    }

    @Override
    public void sporcuPuanıGöster() {
        System.out.println("Futbolcu: "+this.getSporcuİsim());
        System.out.println("Penaltı: "+this.penaltı);
        System.out.println("Serbest Vuruş: "+this.serbestVuruş);
        System.out.println("Çalım: "+this.çalım);
    }
    

    
}
