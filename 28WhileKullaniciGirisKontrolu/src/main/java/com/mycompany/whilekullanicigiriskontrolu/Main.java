package com.mycompany.whilekullanicigiriskontrolu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sacnner= new Scanner(System.in);
        
        int giris_hakki=3;
        
        String sys_kullanici_adi="Cennet Feyza";
        String sys_parola="12345";
        
        System.out.println("*******************************");
        System.out.println("Kullanıcı girişine hoşgeldiniz....");
        System.out.println("*******************************");
        
        while(true){
            System.out.println("Kullanıcı adı:");
            String kullanici = sacnner.nextLine();
            System.out.println("Parola:");
            String parola=sacnner.nextLine();
            
            if(kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Hoşgeldiniz."+kullanici);
                break;
            }
            else if(kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
                System.out.println("Parolanız yanlış...");
                giris_hakki-=1;
                System.out.println("Giriş Hakkı : "+giris_hakki);
            }
            else if(!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Kullanıcı adınız yanlış...");
                giris_hakki-=1;
                System.out.println("Giriş Hakkı : "+giris_hakki);
            }
            else{
                System.out.println("Kullanıcı adınız ve parolanız yanlış...");
                giris_hakki-=1;
                System.out.println("Giriş Hakkı : "+giris_hakki);
            }
            
            if(giris_hakki==0){
                System.out.println("Giriş hakkınız bitti.Tekrar bekleriz...");
                break;
            }
            
        }
        
}
   
}
