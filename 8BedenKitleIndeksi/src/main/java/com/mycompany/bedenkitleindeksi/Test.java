package com.mycompany.bedenkitleindeksi;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle inseksini bulun.
        Beden kitle endeksi:Kilo/Boy(m)*Boy(m) */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kilonuzu giriniz:");
        int kilo=scanner.nextInt();
        System.out.println("Boyunuzu giriniz(Örnek:1,75): ");
        double boy=scanner.nextDouble();
        double bedenkitleindeksi=kilo/(boy*boy);
        System.out.print("Beden kitle indeksiniz:"+bedenkitleindeksi);
        
        
    }
}
