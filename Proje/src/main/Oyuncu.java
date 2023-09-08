package main;

import java.util.ArrayList;

public class Oyuncu {
    private int oyuncuID;
    private String oyuncuAdı;
    private int skor;
    private ArrayList<Futbolcu> kartListesi1 = new ArrayList<>();
    private ArrayList<Basketbolcu> kartListesi2 = new ArrayList<>();
    
    public Oyuncu(){
    }

    public Oyuncu(int oyuncuID, String oyuncuAdı, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdı = oyuncuAdı;
        this.skor = skor;
    }
    
    public void skorGoster(){
        System.out.println(this.oyuncuAdı+" Skoru: "+this.skor); 		
    }
    public void KartDagit1(ArrayList<Futbolcu> deste) {
        int a = (int) (Math.random() * deste.size()); 
        Futbolcu secilen = deste.get(a); 
        this.kartListesi1.add(secilen);
        deste.remove(secilen); 
    }
    public void KartDagit2(ArrayList<Basketbolcu> deste) {
        int a = (int) (Math.random() * deste.size()); 
        Basketbolcu secilen = deste.get(a); 
        this.kartListesi2.add(secilen); 
        deste.remove(secilen); 
    }
    
    public int []kartSeç(int x){
    
        
    return null;
    }
    
    public ArrayList<Futbolcu> getKartListesi1() {
        return kartListesi1;
    }

    public void setKartListesi1(ArrayList<Futbolcu> kartListesi1) {
        this.kartListesi1 = kartListesi1;
    }

    public ArrayList<Basketbolcu> getKartListesi2() {
        return kartListesi2;
    }

    public void setKartListesi2(ArrayList<Basketbolcu> kartListesi2) {
        this.kartListesi2 = kartListesi2;
    }
    
    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdı() {
        return oyuncuAdı;
    }

    public void setOyuncuAdı(String oyuncuAdı) {
        this.oyuncuAdı = oyuncuAdı;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }
    
}
