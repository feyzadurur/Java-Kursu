package main.bootcamp_ders2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*
        System.out.println("Hello "+"World");
        
        int number1=25;
        int number2=10;
        System.out.println(number1+number2);
        System.out.println(number1-number2);  
        System.out.println(number1*number2);  
        System.out.println(number1/(double)number2);
        System.out.println(number1%number2);

        number1++;
        System.out.println(number1);

        number2++;
        System.out.println(number2);
        */
        /*
        int a,b,c;
        a=5;
        b=10;
        c=5;
        
        if(a==c){
            System.out.println("a eşittir c");
        }
        
        if (b>a) {
            System.out.println("b büyük a");
        }
        
        //Bu ife girmez
        if(a>b){
            System.out.println("a büyüktür b");
        }
        
        if(b!=c){
            System.out.println("b eşit değilidir c");
        }
        
        if (a!=c) {
            System.out.println("a eşit değilidr c ");
        }
        */
        
        /*
        int number=-5;
        
        if(number==0){
            System.out.println("sayi 0");
        }
        else if (number<0) {
            System.out.println("sayi negatif");
        }
        else if (number>0) {
            System.out.println("sayi pozitif");
        }
        
        
        int yas=17;
        if (yas>=18) {
            System.out.println("Reşitsiniz.");
        }
        else{
            System.out.println("Reşit değilisiniz.");
        }
        
        Scanner scanner=new Scanner(System.in);
        int not=scanner.nextInt();
        //int not=50;
        if(not>=90){
            System.out.println("AA");
        }
        else if(not>=85){
            System.out.println("BA");
        }
        else if (not>=80) {
            System.out.println("BB");
        }
        else if (not>=75) {
            System.out.println("CB");
        }
        else if (not>=50) {
            System.out.println("Koşullu geçtiniz");
        }
        else{
            System.out.println("Dersten kaldınız.");
        }
*/
        
        int n1=-3,n2=7,n3=5;
        
        if(n1>=n2 && n1>=n3){
            System.out.println(n1+" en büyük sayıdır");
        }
        else if (n2>=n1 && n2>=n3) {
            System.out.println(n2+" en büyük sayıdır.");
        }
        else{
            System.out.println(n3+"en büyük sayıdır.");
        }

    }
}
