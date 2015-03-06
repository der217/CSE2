/*
Deepankar roy
03/06/2015
Lab 07
zigzag program
*/

import java.util.Scanner;

//declare class
public class zigzag {
    
    //method
    public static void main (String[] args) {
        
        Scanner ask = new Scanner (System.in); //declare scanner
        
        while (true) {
            
            System.out.print("enter an int between 3-33, inclusive: ");
            
            while (!ask.hasNextInt()){
                System.out.println("Invalid input");
                return;
            }
            
            int nStars = ask.nextInt(); //set nstars to input value 
            
            while ( nStars < 3 || nStars > 33) {
                System.out.println("Number not in range [3,33]");
                return;
            }
            
            int c = 0; //create counter variable
            
            while ( c < nStars ) {
                System.out.print("*");
                c++;                        //first line fo stars
            }
            System.out.println();
            
            c = 0; //reset c
            int x = 0; //create secondary counter variable
            while ( c < (nStars-2) ) {
                while ( x <= c ) {                      //diagonal of stars
                    System.out.print(" ");
                    x++;
                }
                x = 0; //reset x
                System.out.println("*");
                c++;
            }
            
            c = 0;  //reset c
            while ( c < nStars ) {
                System.out.print("*");          //end line of stars
                c++;
            }
            System.out.println();
            
            
            System.out.print("Continue(Y/y)? ");
            String answer = ask.next();
            
            while ( !answer.equals("Y") && !answer.equals("y") ) {
                return;
            }
        }
    }
}