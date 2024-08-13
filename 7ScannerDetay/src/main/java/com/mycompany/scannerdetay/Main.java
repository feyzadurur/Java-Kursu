package com.mycompany.scannerdetay;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       /* Scanner scanner=new Scanner(System.in);
        
        int yas=scanner.nextInt();
        
        String isim=scanner.nextLine();  
        System.out.println("Yaş:"+yas);
        System.out.println("İsim:"+isim);
        
        //int değeri girince enter yapınca string değeri beklemeden çıktı verdi.
        5
        Yaş:5
        İsim:   gibi
        */
       
        /*Scanner scanner=new Scanner(System.in);
        
        int yas=scanner.nextInt();
        scanner.nextLine(); //Dumy
        String isim=scanner.nextLine();  
        System.out.println("Yaş:"+yas);
        System.out.println("İsim:"+isim);
        //Bu sorun nextInt yapıp nextLine olunca oluyor
        //önce nextline sonra nextint yapınca herhangi bir sıkıntı olmuyor
        */
        
        
        Scanner scanner=new Scanner(System.in);
        int yas1=scanner.nextInt();
        int yas2=scanner.nextInt();
        int yas3=scanner.nextInt();
        //Aradaki enter ya da boşuğa basınca java destekliyor.nextInt için böyle
        System.out.println("Yaş1:"+yas1+" Yaş2:"+yas2+" Yaş3:"+yas3);
    }
  
}
