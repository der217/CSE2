///////////////////////////////////////////////////////////////////////
/*
Deepankar Roy
03/03/15
Homework 6
MakeSymbols
random number between 0-100
if even print that many *
if odd print that many &
*/

import java.util.Scanner; //import scanner
import java.util.Random; //import Random

//define class
public class MakeSymbols {
    
    public static void main(String[] args){
        
        int random = (int) (Math.random()*100); //produce random number
        System.out.println("The number is: "+random);
        int counter = 0;
        
        if (random%2 == 0) {
            do {
                System.out.print("*");
                counter++;
            }while(counter<random);
            System.out.println();
        }
        if (random%2 == 1) {
            do {
                System.out.print("&");
                counter++;
            }while(counter<random);
            System.out.println();
        }
    }
}