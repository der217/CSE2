/*
Deepankar Roy
03/20/15
Lab 08
Super factorial
*/

import java.util.Scanner; //import scanner

public class Factorials {
    
    public static void main (String[] args) {
        
        Scanner ask = new Scanner (System.in); //declare scanner
        
        System.out.print("please enter an integer: ");
        int n = ask.nextInt(); //assign the number value
        int c = 0; //initialize counter 1
        int sum = 0; //initialize superfactorial sum
        for (c=n;c>0;c--) {
            sum += factorial(c);
        }
        print(n,sum);
    }
    
    public static int factorial(int x){
        int c=1;
        int d=1;
        while (c<=x){
            d = d * c;
            c++;
        }
        return d;
    }
    
    public static void print(int x, int sum){
        System.out.println("The super factorial of "+x+" is "+sum+".");
    }
}