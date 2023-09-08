package main;

import java.util.ArrayList;

public class Bilgisayar extends Oyuncu {
     
    private ArrayList<Integer> sayıListesi = new ArrayList<>();
    private ArrayList<Integer> sayıListesi1 = new ArrayList<>();

    public ArrayList<Integer> getSayıListesi() {
        return sayıListesi;
    }

    public void setSayıListesi(ArrayList<Integer> sayıListesi) {
        this.sayıListesi = sayıListesi;
    }

    public ArrayList<Integer> getSayıListesi1() {
        return sayıListesi1;
    }

    public void setSayıListesi1(ArrayList<Integer> sayıListesi1) {
        this.sayıListesi1 = sayıListesi1;
    }
    public Bilgisayar() {
    }

    public Bilgisayar(int oyuncuID, String oyuncuAdı, int skor) {
        super(oyuncuID, oyuncuAdı, skor);
    }

    @Override
    public int[] kartSeç(int x) {
        int [] değer = new int [2];
        if(x==1){
        int a = (int) (Math.random()*this.sayıListesi.size());
        değer[0]=a;
        değer[1]=this.sayıListesi.get(a);
        return değer;
        
        }
        if(x==2){
        int b = (int) (Math.random()*this.sayıListesi1.size());
        değer[0]=b;
        değer[1]=this.sayıListesi1.get(b);
        return değer;
        
        }
        return null;
    }
 
   
    
    
    
}
