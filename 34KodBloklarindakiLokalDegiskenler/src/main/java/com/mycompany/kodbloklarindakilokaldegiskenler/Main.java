package com.mycompany.kodbloklarindakilokaldegiskenler;
public class Main {
 /* public static void main(String[] args) {
        
       int a=4;
        String yazdir="Merhaba";
        
        if(a<10){
            int b=5; //Buradaki b değişkeni sadece if bloğu için kullanılabilir
           
            System.out.println(yazdir);
        }
    }
 */
    
 /*   public static void main(String[] args) {
        for(int i=0 ; i<10 ; i++){
            System.out.println(i);
        }
     //    System.out.println(i); Burada hata veriri çünkü i değişkeni for döngüsüne özgü
    } */
    
    public static void toplama(int a,int b,int c){
        int deneme=10;//Burada kullanılabilir sadece
        System.out.println("Toplama sonucu : "+(a+b+c));
    }
    public static void main(String[] args) {
        toplama(10, 20, 30); //Fonksiyon çağrılınca kullanılabilir.
   //   System.out.println(a); hata verir çünkü yukarıdaki metodun içinde tanımlanmış
   
}
    
}
