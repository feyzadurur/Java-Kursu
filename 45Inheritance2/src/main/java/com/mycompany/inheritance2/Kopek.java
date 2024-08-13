package com.mycompany.inheritance2;
public class Kopek extends Hayvan{
    private int dis_sayisi; //ek özellik 
    
    public Kopek(String isim,int kilo,int boy,int bacak_sayisi,int dis_sayisi){
        super(isim, kilo, boy, bacak_sayisi);
        this.dis_sayisi=dis_sayisi;
    }
    
    @Override
    public void harekete_gec(int hız){
        System.out.println("Köpek "+hız+" ile harekete ediyor...");
    }
    
    public void kos(int hız){
        
        System.out.println("Köpek koşuyor...");
        harekete_gec(hız);//Kopek sınıfının harekete_gec metodu
        //super.harekete_gec(hız);//üst sınıfın
    }
    
    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
    
}
