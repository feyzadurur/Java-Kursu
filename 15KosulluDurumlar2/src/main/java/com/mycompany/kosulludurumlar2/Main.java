package com.mycompany.kosulludurumlar2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* 
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Lütfen işlem giriniz:");
        
        int islem=scanner.nextInt();
        
        if(islem==1){
            System.out.println("1.işlem");
        }
        
        else if(islem==2){
            System.out.println("2.işlem");
        }
        
        else if(islem==3){
            System.out.println("3.işlem");
        }
        
        else if(islem==4){
            System.out.println("4.işlem");
        }
        
        else{
            System.out.println("Geçersiz işlem...");
        } */
       
       
       Scanner scanner=new Scanner(System.in);
       
       System.out.println("Lütfen notunuzu giriniz:");
       
       int not=scanner.nextInt();
       
       if(not>=90){
           System.out.println("AA");
       }
       else if(not>=85){
           System.out.println("BA");
       }
       else if(not>=80){
           System.out.println("BB");
       }
       else if(not>=75){
           System.out.println("CB");
       }
       else if(not>=70){
           System.out.println("CC");
       }
       else if(not>=65){
           System.out.println("DC");
       }
       else if(not>=60){
           System.out.println("DD");
       }
       else{
           System.out.println("Dersten kaldınız...");
       }
       //else ifleri if yaparsak koşulları sağladığı için ne olursa olsun bütün ifleri çalıştırır.
    }
}
