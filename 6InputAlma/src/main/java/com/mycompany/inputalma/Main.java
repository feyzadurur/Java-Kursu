package com.mycompany.inputalma;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       /* Scanner scanner=new Scanner(System.in);
        //Hata veriyorsa ctrl+shift+ı yapıp dahil edebiliriz
        System.out.println("Lütfen yaşınızı giriniz:");
        int yas=scanner.nextInt();
        System.out.println("Yaşınız:"+yas);*/
       
       
       /*Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz:");
        double sayi=scanner.nextDouble();
        System.out.println("Sayı:"+sayi); */
       
       
       /*Scanner scanner=new Scanner(System.in);
       System.out.println("Lütfen bir yazı giriniz:");
       String yazi=scanner.nextLine();
        System.out.println("Yazı:"+yazi); */
       
       Scanner scanner=new Scanner(System.in);
       
       if(scanner.hasNextInt()){
            int sayi=scanner.nextInt();
            System.out.println("Sayı:"+sayi); 
       }
       else{
           System.out.println("Lütfen bir sayı giriniz...");
       }
    }
}
