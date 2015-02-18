////////////////////////////////////////////////////////////////
/*
Deepanakar Roy
02/16/15
Homework 4
Program 2
random amount between 1,000 and 5,000 
choice of depositing money, withdrawing money, or viewing their balance. 
-deposit, ask them how much. enter a positive number. Then print their resulting balance. 
-withdraw, ask them how much. positive number no more than the amount in their account. Then print the resulting balance.
-view balance, print balance.
*/

//import scanner and random
import java.util.Scanner;
import java.util.Random;

//define class
public class Banking {
    
    public static void main(String[] args) {
        
        Scanner ask = new Scanner (System.in); // declare scanner and intialize it
        
        int amount, change, balance, choice;
        
        amount = (int) (Math.random()*5000);
        System.out.println("Your balance is: " +amount);
        System.out.print("Input 1 for deposit, 2 for withdrawal, 3 to view balance: ");
        choice = ask.nextInt();
        
        switch (choice) {
            case 1: 
                System.out.print("Enter amount to deposit: ");
                change = ask.nextInt();
                if (change < 0) {
                    System.out.println("invalid");
                    balance = amount;
                } else {
                    balance = amount + change ;
                }
                System.out.println("Your new balance is: " +balance);
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                change = ask.nextInt();
                if (change > amount) {
                    System.out.println("invalid");
                    balance = amount;
                } else {
                    balance = amount - change ;
                }
                System.out.println("Your new balance is: " +balance);
                break;
            case 3:
                balance = amount ;
                System.out.println("Your balance is: " +balance);
                break;
            default:
                System.out.println("invalid");
                break;
        }
        
    }
}