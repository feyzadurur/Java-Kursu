package com.mycompany.oopatm;
public class Main {
    public static void main(String[] args) {
    //Login Class'ı Kullanıcı Girişini Kontrol Edecek.
    //Hesap Class'ı Hesap İşlemlerini Yapacak.
    //ATM ise atmmizi çalıştıracak.
    
    ATM atm=new ATM();
    
    Hesap hesap=new Hesap("Cennet Feyza Durur", "12345", 2000);
    
    atm.calis(hesap);
    System.out.println("Programdan çıkılıyor...");
}
}
