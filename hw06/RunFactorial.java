/*
Deepankar Roy
03/03/15
Homework 6
RunFactorial 
-get 5 non negative integers and give their sum using non-nested for loops
*/

import java.util.Scanner; //import scanner

//define class
public class RunFactorial {
    
    public static void main (String[] args) {
        
        Scanner ask = new Scanner (System.in); //declare scanner
        
        int num=0,count=0,x=0,y=0,z=0; //declare variables
        
        if (ask.hasNextInt()) {
            num = ask.nextInt();
            if ( num >= 9 && num <=16 ) {
                count = 1;
                int factorial = 1;
                while (count<=num) {
                    factorial = factorial * count;
                    count++;
                }
                System.out.println(num+"! = "+factorial);
                return;
            }
            System.out.println("Invalid input. Run again");
            return;
        }
        System.out.println("Invalid input. Run again");
    }
}