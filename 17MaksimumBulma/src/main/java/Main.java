import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Kullanıcıdan alınan 3 sayıdan en büyük sayıyı bulma
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Birinci Sayı:");
        int a=scanner.nextInt();
        System.out.println("İkinci Sayı:");
        int b=scanner.nextInt();
        System.out.println("Üçüncü Sayı");
        int c=scanner.nextInt();
        
       /* int max=-1;
       if(a>=b && a>=c){
            max=a;
        }
        else if(b>=a && b>=c){
            max=b;
        }
        else{
            max=c;
        }
        
        System.out.println("Maksimum sayı:"+max); */
       
       int min=-1;
       if(a<=b && a<=c){
           min=a;
       }
       else if(b<=a && b<=c){
           min=b;
       }
       else{
           min=c;
       }
        System.out.println("Minimum sayı:"+min);
        
        
        
}
}
