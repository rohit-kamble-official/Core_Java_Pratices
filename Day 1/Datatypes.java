// public class Datatypes{
//     public static void main(String[] args){
//       int myNumber = 565;
//       float cgpa = 7.83f;
//       char grade = 'a';
//       long phoneNo = 8766535742l;
//       boolean isAlive = false;


//       System.out.println(myNumber);
//       System.out.println(cgpa);
//       System.out.println(phoneNo);
//       System.out.println(isAlive);
//       System.out.println(grade);

//     }
    
// }


// import java.util.Scanner;

// public class DataTypes{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter Your name:");
//         String name =input.nextLine();
//         System.out.println("Welcome"+" "+ name +" " + "To Rk Studio");
//     }
// }

import java.util.Scanner;
public class Datatypes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the First Number :");
        int a = input.nextInt();
        System.out.print("Enter Second Number:");
        int b = input.nextInt();
         int sum = a+b;
         System.out.println("Total "+ sum );
    }  
}