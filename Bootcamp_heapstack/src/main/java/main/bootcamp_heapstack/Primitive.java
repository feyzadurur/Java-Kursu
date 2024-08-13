package main.bootcamp_heapstack;

import java.util.Arrays;

public class Primitive {
    
    int userID;
    boolean isActive;
    double userNote;
    long categoryID;
    
    public static void main(String[] args) {
        Primitive primitive=new Primitive();
        
        System.out.println(primitive.userID);
        System.out.println(primitive.isActive);
        System.out.println(primitive.userNote);
        System.out.println(primitive.categoryID);
        
        /*
        int total=5;
        double price=0;
        boolean isActive=true;
        long a=1;
        */
        
        int price=0;
        System.out.println(price);
        int total=price;
        System.out.println(total);
        
        price=Integer.MAX_VALUE;
        System.out.println(price);
        System.out.println(total);
        
        
        int number=99;
        System.out.println(number);
        changeNumber(number);
        System.out.println(number);
        
        
        long[] values={0,0,0};
        System.out.println(Arrays.toString(values));
        changeReference(values);
        System.out.println(Arrays.toString(values));
    }
    static void changeNumber(int number){
        number=23;
       
    }
    
    static void changeReference(long[] values){
        values[0]=1;
        values[1]=2;
        values[2]=3;
    }
}
