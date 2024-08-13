package main.bootcamp_heapstack;

public class ErrorClass {
    
   public static void example(){
       example();
   }
    public static void main(String[] args) {
        //example(); -> StackOverFlow hatası
        
        int[] error=new int[999999999];
        for (int i = 0; i < 999999999; i++) {
            error[i]=i;
        }
    }
}
