package com.mycompany.polymorphizm;
//Eğer public koyarsak isminin dosya ile aynı olması gerekiyor.

class Hayvan {

    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public String konus(){
        return "Hayvan konuşuyor...";
    }
    
    
}

class Kedi extends Hayvan{
    public Kedi(String isim){
        super(isim);
    }

    @Override //Insert code override
    public String konus() {
        return this.getIsim()+"Miyavlıyor..."; 
    }
    
}

class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+"Havlıyor..."; 
    }
    
}

class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+"Kişniyor..."; 
    }
    
}

public class Main {
  /*  public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    } */
    public static void konustur(Object object){
       // System.out.println(object.konus());
       if(object instanceof Kopek){
           Kopek kopek=(Kopek)object;
           System.out.println(kopek.konus());
       }
       else if(object instanceof Kedi){
           Kedi kedi=(Kedi)object;
           System.out.println(kedi.konus());
       }
       else if(object instanceof  At){
           At at=(At)object;
           System.out.println(at.konus());
       }
       else if(object instanceof  Hayvan){
           Hayvan hayvan=(Hayvan)object;
           System.out.println(hayvan.konus());
       } //Kontrol polymorphizmin faydası
    }
    
    public static void main(String[] args) {
      /*  Hayvan hayvan1=new Kedi("Tekir ");;
        Hayvan hayvan2=new Kopek("Karabaş ");
        Hayvan hayvan3=new At("Şahbatur");
                
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());*/
      
      /*  konustur(new Kedi("Tekir "));
        konustur(new Kopek("Karabaş "));
        konustur(new At("Şahbatur ")); */
      
      
 /*       Kopek kopek=new Kopek("Karabaş");
        
        if(kopek instanceof Hayvan){
            System.out.println("Bu nesne Hayvan sınıfından...");
        }
        if(kopek instanceof Kopek){
            System.out.println("Bu nesne Kopek sınıfından...");
        } */
      
    /*    if(kopek instanceof Kedi){ //Bunda hata veriyor bundan türetilemiyor.
            System.out.println("Bu nesne Kedi sınıfından...");
        } */
    
        Kopek kopek=new Kopek("Karabaş ");
        Kedi kedi=new Kedi("Tekir ");
        At at=new At("Şahbatur ");
        Hayvan hayvan=new Hayvan("Limon ");
            konustur(kopek);
            konustur(kedi);
            konustur(at);
            konustur(hayvan);
    }
}
