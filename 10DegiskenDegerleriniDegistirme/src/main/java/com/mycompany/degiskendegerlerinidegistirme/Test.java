package com.mycompany.degiskendegerlerinidegistirme;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız iki sayının değerlerini değiştirin.
        
        Scanner scanner=new Scanner(System.in);
        int birinci_sayi;
        int ikinci_sayi;
        
        System.out.println("Birinci sayı:");
        birinci_sayi=scanner.nextInt();
        
        System.out.println("İkinci sayı:");
        ikinci_sayi=scanner.nextInt();
        
        System.out.println("Değiştirilmeden önce...");
        System.out.println("Birinci sayı:"+birinci_sayi+" İkinci sayı:"+ikinci_sayi);
        
        int gecici=birinci_sayi;
        birinci_sayi=ikinci_sayi;
        
        System.out.println("Değiştirildikten sonra...");
        System.out.println("Birinci sayı:"+birinci_sayi+" İkinci sayı"+ikinci_sayi);
        
        
    }
}
