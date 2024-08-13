package com.mycompany.metodlaragiris;
import java.util.Scanner;


public class Main {
    
    public static void selamlama(){
        System.out.println("Merhaba Nasılsınız ? ");
        System.out.println("Selamlar...");
    }
    
  /*  public static void main(String[] args) {
        selamlama();
        selamlama(); //Birden çok çağırılabilir.  
    } */
    
    public static void faktoriyel(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ekrana bir sayı giriniz : ");
        int sayi=scanner.nextInt();
        
        int faktoriyel=1;
        while(sayi>0){
            faktoriyel*=sayi;
            sayi--;
        }
        System.out.println("Faktöriyel = "+faktoriyel);
        
    }
    public static void main(String[] args) {
        faktoriyel();
        faktoriyel();
        
    }
}
