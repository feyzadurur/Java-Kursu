package com.mycompany.inheritance1;
public class Yonetici extends Calisan { //SubClass(Bir alt sınıf)
    
    private int sorumlu_kisi; //Ekstra özellik
    
    public Yonetici(String isim, int maas, String departman,int sorumlu_kisi){
    /*  this.isim=isim;
        this.maas=maas;
        this.departman=departman; */
    
    super(isim, maas, departman);
    
    this.sorumlu_kisi=sorumlu_kisi;
    
    }
    
    public void zam_yap(int zam_miktari){
        System.out.println("Çalışanlara "+zam_miktari+" TL zam yapıldı.");
    }
    
    @Override
    public void bilgileriGoster(){ //Override
      /*  System.out.println("İsim : "+getIsim()); //Get olması önemli
        System.out.println("Maaş : "+getMaas());
        System.out.println("Departman : "+getDepartman()); */
        
        super.bilgileriGoster(); //Yukarıdaki yerine bu yapılabilir
        
        System.out.println("Sorumlu Kişi Sayısı : "+this.sorumlu_kisi); 
    }
    
    
}
