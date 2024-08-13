package com.mycompany.bedenkitleindeksikosulludurumlar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Kilonuz:");
        int kilo=scanner.nextInt();
        
        System.out.println("Boyunuz(Örnek:1,72): ");
        double boy=scanner.nextDouble();
        
        double bki=(kilo/(boy*boy));
        
        if(bki<18.5){
            System.out.println("Zayıf");
        }
        else if(bki>=18.5 && bki<25){
            System.out.println("Normal");
        }
        else if(bki>=25 && bki<30){
            System.out.println("Fazla kilolu");
        }
        else{
            System.out.println("Obez");
        }
}
}
