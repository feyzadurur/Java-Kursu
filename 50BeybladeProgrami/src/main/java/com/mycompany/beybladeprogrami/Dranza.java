package com.mycompany.beybladeprogrami;
public class Dranza extends Beyblade{
    private String kutsalCanavar;

    public Dranza( String beybladeci,String kutsalCanavar, int donusHizi, int saldiriGucu) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal Canavar Adı : "+kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+" "+kutsalCanavar+"'ı ortaya çıkarıyor...");
        System.out.println(getBeybladeci()+"'ın Saldırısı : Alev Kılıcı");
    }
    
}
