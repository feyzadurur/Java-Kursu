package com.mycompany.beybladeprogrami;
public class BeybladeFabrikasi {
    public Beyblade beybladeUret(String beyblade_turu){
        if(beyblade_turu.equals("Dragon")){
            return new Dragon("Takao", "Mavi Ejderha", 800, 300, "Kutsal Canavarla Konuşma");
        }
        else if(beyblade_turu.equals("Dranza")){
            return new Dranza("Kai", "Kırmızı Anka Kuşu", 600, 400);
        }
        else if(beyblade_turu.equals("Drayga")){
            return new Drayga("Rei", "Beyaz Kaplan", 800, 250);
        }
        else if(beyblade_turu.equals("Draciel")){
            return new Draciel("Max", "Kara Kaplumbağa", 400, 1000);
        }
        else{
           return null;
        }
        
        
    }
}
