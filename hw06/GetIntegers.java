///////////////////////////////////////////////////////////////////////
/*
Deepankar Roy
03/03/15
Homework 6
GetIntegers 
-get 5 non negative integers and give their sum using non-nested for loops
*/

import java.util.Scanner; //import scanner

//define class
public class GetIntegers {
    
    public static void main (String[] args) {
        
        int x=0,sum=0,num=0; //declare variables
        
        Scanner ask = new Scanner (System.in); //construct and declare scanner as ask
        
        System.out.println("enter five non-zero integers");
        for (x=0;x<5;x++) { //runs five times
            if (ask.hasNextInt()) { //checks for int
                num = ask.nextInt();
                if ( num >= 0) { //checks for positive int
                    sum = sum + num;
                }
                else {
                    System.out.println("invalid input. try again."); //gives error for bad input
                    x--; //fixes counter
                }
            } else {
                System.out.println("Invalid input. run again."); //gives error for bad input
                return;
            }
        }
        System.out.println(sum); //prints sum
    }
}