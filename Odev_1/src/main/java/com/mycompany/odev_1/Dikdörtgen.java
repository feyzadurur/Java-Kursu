
import java.util.*;

public class Dikdörtgen {
    public int kenar1, kenar2;
    
    public Dikdörtgen(int kenar1, int kenar2) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }
    
    public void doluDikdörtgen() {
        for( int j=0; j<kenar1; j++ ) { //kenar1'e gelene kadar 0 ekleyecek 
            for( int i=0; i<kenar2; i++) { //kenar2'ye gelene kadar 0 ekleyecek
                System.out.print("0 ");
            }
            System.out.println(); //kenar2 tamamlandıktan sonra alt satıra geçirir.
        }
    } 
    
    public static void main( String args[] ) {
        
        System.out.println("İlk kenarı giriniz:  ");
        Scanner in = new Scanner( System.in );
        int kenar1 = in.nextInt();
        System.out.println("İkinci kenarı giriniz: ");
        int kenar2 = in.nextInt();
        Dikdörtgen d = new Dikdörtgen(kenar1,kenar2);
        System.out.println("Ebatları "+kenar1+" ve "+kenar2+" olan dikdörtgenin görüntüsü:");
        d.doluDikdörtgen();
    }
}

