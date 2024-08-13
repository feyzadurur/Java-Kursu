package main.bootcamp_random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int sayi=random.nextInt();
        System.out.println(sayi);
        
        float fSayi=random.nextFloat();
        double dSayi=random.nextDouble();
        boolean bool=random.nextBoolean();
        long lSayi=random.nextLong();
        
        System.out.println(fSayi);
        System.out.println(dSayi);
        System.out.println(bool);
        System.out.println(lSayi);
        
        
        
    }
}
