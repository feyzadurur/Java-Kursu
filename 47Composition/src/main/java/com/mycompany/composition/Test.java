package com.mycompany.composition;
public class Test {
    public static void main(String[] args) {
        Resolution resolution=new Resolution(1920, 1080);
        
        Monitor monitor=new Monitor("ZH62EA", "HP", "15,6", resolution);
        
        Kasa kasa=new Kasa("Pavilion", "ASUS", "Plastik");
        
        Anakart anakart=new Anakart("B250-Pro", "ASUS", 10, "Windows 10");
        
        Bilgisayar pc=new Bilgisayar(monitor, kasa, anakart);
        
        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().monitoru_kapat();
        pc.getAnakart().İsletim_sistemi_yukle("Ubuntu 16.04");
        
    }
}
