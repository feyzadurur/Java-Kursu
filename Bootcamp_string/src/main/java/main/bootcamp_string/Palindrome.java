package main.bootcamp_string;

public class Palindrome {

    //Önden ve arkadan okunuşu aynı sözcükler
    public static void main(String[] args) {
        String test1 = "naber";
        String test2 = "abcdcba";
        System.out.println(isPalindrome(test1));
        System.out.println(isPalindrome(test2));
        
//        System.out.println(isPalindrome2(test1));
//        System.out.println(isPalindrome2(test2));


    }

    public static boolean isPalindrome(String str) {
        String dummyStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            dummyStr = dummyStr + str.charAt(i);
        }
        if (dummyStr.equals(str)) {
            return true;
        }
        return false;
    }

    
    public static boolean isPalindrome2(String str){
        int strLen=str.length();
        for (int i = 0; i <strLen/2; i++) {
            if(str.charAt(i)!=str.charAt(strLen-i)){
                return false;
            }
        }
        return true;
    }
   
     
}
