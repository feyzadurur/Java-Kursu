package com.mycompany.gelismisbirnothesaplama;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.Vize notunuzu giriniz:");
        int vize1=scanner.nextInt();
        System.out.println("2.Vize notunuzu giriniz:");
        int vize2=scanner.nextInt();
        System.out.println("Final notunuzu giriniz:");
        int finalnot=scanner.nextInt();
        System.out.println("Okul ortalamanızı giriniz:");
        double ortalama=scanner.nextDouble();
        double toplamnot=(vize1*3/10.0)+(vize2*3/10.0)+(finalnot*4/10.0);
        
        if(toplamnot>=90){
            System.out.println("AA aldınız...");
        }
        else if(toplamnot>=85){
            System.out.println("BA aldınız");
        }
        else if(toplamnot>=80){
            System.out.println("BB aldınız");
        }
        else if(toplamnot>=75){
            System.out.println("CB aldınız");
        }
        else if(toplamnot>=70){
            System.out.println("CC aldınız");
        }
        else if(toplamnot>=65){
            System.out.println("DC aldınız");
        }
        else if(toplamnot>=60){
            System.out.println("DD aldınız");
            
            if(ortalama<2.50){
                System.out.println("DD aldınız ve not ortalamanız düşük.Bu dersi tekrardan almayı düşünebilirsiniz.");
           }
        }
        else if(toplamnot>=55){
            System.out.println("FD aldınız ve Kaldınız...");
        }
        else{
            System.out.println("FF aldınız ve kaldınız...");
        }
        
    }
    
}
