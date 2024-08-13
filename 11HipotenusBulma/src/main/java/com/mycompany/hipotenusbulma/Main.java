package com.mycompany.hipotenusbulma;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        int b;
        System.out.println("Birinci kenar:");
        a=scanner.nextInt();
        System.out.println("İkinci kenar:");
        b=scanner.nextInt();
        
        double h=Math.sqrt(a*a + b*b); //Javada karekök alma
        System.out.print("Hipotenüs:"+h);
    }
 
}
