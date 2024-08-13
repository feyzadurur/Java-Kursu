package main.bootcamp_string;

public class HackerRank {
    
    
    //hhaacckkekraraannk
    public static String hackerrankString(String s){
        String strChecker="hackerrank";
        int iCheck=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==strChecker.charAt(iCheck)) {
                iCheck++;
            }
            if (iCheck==strChecker.length()){
               return "yes";
            }
        }
        return "no";
    }
    
    
    public static void main(String[] args) {
        
    }
}
