package com.mycompany.calisanlarprogrami;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
    Scanner scanner=new Scanner(System.in);
    System.out.println("Çalışanlar programına hoşgeldiniz...");
    String islemler="İşlemler\n"
                    + "1.Yazılımcı İşlemleri\n"
                    + "2. Yönetici İşlemleri\n"
                    + "Çıkış için q'ya basın.";
        System.out.println("**********************************");
        System.out.println(islemler);
        System.out.println("**********************************");
        
        while (true) {            
            System.out.println("İşlemi seçiniz : ");
            String islem=scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                Yazilimci yazilimci=new  Yazilimci("Feyza","Durur",07,"C,Java,C#");
                String yazilimciIslem="1.Format At\n"
                                    + "2. Bilgileri Göster\n"
                                    + "Çıkış için q'ya basın.";
                System.out.println(yazilimciIslem);
                while (true) {   
                    System.out.println("İşlemi seçiniz : ");
                    String y_islem=scanner.nextLine();
                    
                    if(y_islem.equals("q")){
                        System.out.println("Yazılımcı işlemelerinden çıkılıyor...");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        System.out.println("İşletim sistemi : ");
                        String isletim_sistemi=scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if(y_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }
                    else{
                        System.out.println("Geçersiz yazılımcı işlemi.");
                    }
                    
                }
            }
            else if(islem.equals("2")){
                Yonetici yonetici=new Yonetici("Cennet", "Durur", 007, 10);
                String yonetici_islem="Yönetici işlemleri\n"
                                    + "1.Zam yap\n"
                                    + "2.Bilgileri Göster\n"
                                    + "Çıkış için q'ya basın.";
                System.out.println(yonetici_islem);
                
                while (true) {                    
                    System.out.println("İşlem seçiniz : ");
                    String y_islem=scanner.nextLine();
                    
                    if(y_islem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz : ");
                        int zam_miktarı=scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam_miktarı);
                    }
                    
                    else if(y_islem.equals("2")){
                        yonetici.bilgileriGoster();
                    }
                    else{
                        System.out.println("Geçersiz yönetici işlemi.");
                    }
                }
            }
            
            else{
                System.out.println("Geçersiz işlem.");
            }
        }
    }
}
