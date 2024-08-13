package com.mycompany.faizuygulamasi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
    bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.
        Faiz Oranı:%6 Faiz Oranı
    */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz . Faiz oranı %6");
        
        int anapara,vade;
        System.out.println("Yatırmak istediğiniz tutar:");
        anapara=scanner.nextInt();
        System.out.println("Paranızı kaç yıl vadeli yatırmak istiyorsunuz ? :");
        vade=scanner.nextInt();
        
        double toplampara = anapara;
        double faizOrani = 0.06;
        
        for(int i=1; i<=vade ; i++){
            toplampara=(toplampara * faizOrani) + toplampara;
            System.out.println(i+".yılın sonunda toplam para : "+(int)toplampara );
        }
        
     
}
}
