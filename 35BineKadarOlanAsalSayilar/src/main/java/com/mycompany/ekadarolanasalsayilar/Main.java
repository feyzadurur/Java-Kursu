package com.mycompany.ekadarolanasalsayilar;
public class Main {
    public static boolean asalMi(int sayi){    
        for(int i=2 ; i<sayi ; i++)
            if(sayi % i == 0){ //Asal değil
                return false;
            }
        return true;
    }
        
    public static void main(String[] args) {
    //Asal sayı:1e ve kendisinden başka hiçbir sayıya tam bölünmeyen sayı
        for(int i=2 ; i<1000 ; i++){
            if(asalMi(i)){
                System.out.println(i);
            }
        }
    }
}
