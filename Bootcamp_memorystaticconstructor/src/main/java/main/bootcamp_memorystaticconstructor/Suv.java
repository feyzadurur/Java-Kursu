package main.bootcamp_memorystaticconstructor;

public class Suv {
    int carKm;
    String name;
    static String carType="SUV";
    
    static void print(){
         carType=""; 
    }
    
    static void printF(String name){
        System.out.println(name);
    }
    public void value(String name){
        System.out.println(name);
    }
    
    public static void main(String[] args) {
        //Suv suv=new Suv();
        //System.out.println(suv.carType);
        //System.out.println(Suv.carType); //*
        //System.out.println(carType);
        
        
        Suv suv=new Suv();
        suv.value("abc");
        Suv.printF("feyza");
        printF("Feyza");
    }
}
