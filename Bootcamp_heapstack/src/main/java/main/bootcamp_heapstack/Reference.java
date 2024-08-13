package main.bootcamp_heapstack;


import java.util.Arrays;

public class Reference {
    
    String message;
    int[] notes;
    boolean[] active;
    String[] names;
    
    public static void main(String[] args) {
        Reference reference=new Reference();
        System.out.println(reference.message);
        System.out.println(reference.active);
        System.out.println(Arrays.toString(reference.active));
        System.out.println(Arrays.toString(reference.names));
        
        
        /*
        Integer i=new Integer(2);
        String name="Feyza";
*/
        
        int[] school={5,4,3,2,1};
        System.out.println(Arrays.toString(school));
        
        int[] highSchool=school;
        System.out.println(Arrays.toString(highSchool));
        school[0]=0;
        
        System.out.println(Arrays.toString(highSchool));
        
        
        int a=5;
        int b=5;
        System.out.println(a==b);
        
        String productName=new String("KAZAK");
        String productName2=new String("KAZAK");
        
        System.out.println(productName == productName2);
        
        System.out.println(productName.equals(productName2));
        
        String blackFriday="FRIDAY";
        blackFriday="THURSDAY";
    }
    
}
