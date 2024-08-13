package com.mycompany.yakittutari;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
    /* Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre yol yaptığı bilgilerini alın
     ve sürücünün toplam ne kadar ödemesi gerektiğini hesaplayınız. */ 
    
    Scanner scanner=new Scanner(System.in);
    System.out.println("Aracınızın kilometrede kaç kuruç yakıyor? (Örnek:0,32) : ");
    double kurus=scanner.nextDouble();
    System.out.println("Aracınızla kaç kilometre gittiniz? :");
    int km=scanner.nextInt();
    System.out.print("Toplam ödemeniz gereken tutar "+(kurus*km)+"TL'dir.");
    }
}
