package com.mycompany.fordonguleri;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    /*int i;
      for(i=0 ; i<5 ; i++){
         System.out.println("i = " +i);
      }*/
    
    /*for(int i = 0 ; i<5 ; i++ ){
        System.out.println("i = " +i);
    }*/
    
    /*for(int i=10; i>=0 ; i--){
        System.out.println("i = "+i);
    }*/
    
    /*int i=0;
    for(; i<5 ; i++){
        System.out.println("Java öğreniyorum...");
    }*/
    
    /*int i=0;
    int j=10;
    for(; i<10 && j>0 ; i++,j--){
        System.out.print("i = "+i);
        System.out.println(" j = "+j);
    }*/
    
    /*for(int i=2 ; i<100 ; i*=2 ){
        System.out.println("i = "+i);
    } */
    
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int faktoriyel=1;
        int sayı= scanner.nextInt();
        
        for(int i=1 ; i<=sayı ; i++){
            faktoriyel*=i;
            System.out.println("Faktöriyel = "+faktoriyel+" i = "+i);
        }
        System.out.println("Faktöriyel = "+faktoriyel);
    
    }
}
