////////////////////////////////////////////////////////////////
/*
Deepanakar Roy
02/13/15
Lab 04 - Cookies
The user is responsible for bringing cookies to an event. 
Use scanner to obtain how:
-how many cookies they want
-how many people they are buying for
-at least how many cookies they want each person to get. 
Make sure all inputs are valid. 
if there is enough for each person
determine if the number of cookies is evenly divisible
If there are not enough cookies tell the user how many more are need.
*/

//import scanner
import java.util.Scanner;

//define class
public class Cookies{
    
    public static void main(String[] args){
        
        Scanner ask = new Scanner (System.in); //construct and declare scanner as ask
        
        System.out.print("Enter the number of People: ");//ask for # of people
        if (!(ask.hasNextInt())){
            System.out.println("You did not input an integer");
        } else {
            int people = ask.nextInt();
            if (people < 0){
                System.out.println("You did not enter a viable input");
            } else {
                System.out.print("Enter the number of cookies you are planning to buy: ");//ask for # of cookies want to buy
                int plan = ask.nextInt();
                
                System.out.print("How many do you want each person to get? ");//cookies desired per person
                int per = ask.nextInt();
                
                if ( plan < (people*per)){
                    System.out.println("You will not have enough cookies. You need to buy at least " +((people*per)-plan)+ " more cookies");
                }
                if ( plan >= (people*per)){
                    if ( plan%people == 0){
                        System.out.println("You will have enough cookies and they will divide evenly");
                    } else {
                        System.out.println("You will have enough cookies but they will not divide evenly");
                    }
                }
            }
        }
    }
}

