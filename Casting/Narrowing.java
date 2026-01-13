package Casting;

public class Narrowing {
    public static void main(String[] args){
       // double - folat - long - int - char - short - byte     
         double d = 50585.5554;
         System.out.println(d); // 50585.555
         
         float f = (float)d;
         System.out.println(f);  // 50585
   
         long l = (long)d;
         System.out.println(l); // 505585
        
        int i = (int) d;
        System.out.println(i); //50585
      
        char ch = (char) d;
        System.out.println(ch);  //?

        short s = (short) d;
        System.out.println(s);  // -14951

        byte b = (byte) d;
        System.out.println(b); // -103
    }
}               
