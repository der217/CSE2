/*
Deepankar Roy
Homework 11
CSELinear
*/

import java.util.Scanner; //import scanner
import java.util.Random;//import random

public class CSELinear {
    
    public static void main(String[] args){
        
        Scanner ask = new Scanner (System.in);                  //initialize scanner
        System.out.println("Please enter 15 ints in increasing order for final grades in CSE2:");
        int num[] = new int[15];                                //declare the array
        for (int x = 0; x<15; x++){
            if (ask.hasNextInt()){                              //check for int
                int grade = ask.nextInt();
                if (grade<0 || grade>100){                      //check range
                    System.out.println("You did not enter a grade in range 0-100.");
                    return;
                }
                num[x] = grade;
                if(x>0){                                        //check for order
                    if(num[x]<num[x-1]){
                        System.out.println("You did not enter the ints in increasing order.");
                        return;
                    }
                }
            } else {
                System.out.println("you did not enter an int.");
                return;
            }
        }
        String sorted = listArray(num);
        System.out.println(sorted);
        
        System.out.print("Enter a grade you'd like to search for: ");
        int search = ask.nextInt();                             //search for the grade
        binary(num,search);
        int[] scrambled = new int[15];                          //create scrambled array
        scrambled = scramble(num);
        System.out.println("Scrambled:");
        String shuffled = listArray(scrambled);                 //print scrambled array
        System.out.println(shuffled);
        System.out.print("Enter a grade you'd like to search for: ");
        search = ask.nextInt();                             //search for the grade
        linear(scrambled,search);
        
    }
    
    public static String listArray(int num[]){                  //same code to print out an array from older labs/hws
        String out="{";
        for(int j=0;j<num.length;j++){
          	if(j>0){
            	out+=", ";
          	}
          	out+=num[j];
        }
        out+="} ";
        return out;
    }
    
    public static void binary(int num[], int search){           //do a binary search
        int start = 0;
        int end = 14;
        for (int x=1;x<=4;x++){                                 //prevent an infinite loop
            int mid = (int) ((end-start)/2);
            if(search==num[mid]){                               //if the mid number IS the search grade
                System.out.println(search+" was found in the array with "+x+" iteration(s)");
                return;
            }
            else if(search<num[mid]){                                //if the number is greater than the search grade
                end = (mid-1);                                  //adjust end m=point to right before the mid
            }
            else if(search>num[mid]) {                               //if the number is less than the search grade then
                start = (mid+1);                                //adjust start to right after the mid
            }
            else {                                              //if grade is not found
                System.out.println(search+" was not found in the array with "+x+" iteration(s)");
                return;
            }
        }
    }
    
    public static int[] scramble(int num[]){
        int x;                                                  //placeholder variable
        int pos;                                                //position to be swapped
        for (int i = 0; i<num.length; i++){
            pos = (int) (Math.random()*15);         //new pos selected
            x = num[pos];                                       //x holds the pos value
            num[pos] = num[i];                                  //pos i value goes to the random position
            num[i] = x;                                         //value in x goes to pos i
        }
        return num;
    }
    
    public static void linear(int num[], int search){
        for (int i=0; i<num.length; i++){                       //linear search loop
            if (num[i]==search) {
                System.out.println(search+" was found after "+(i+1)+" iterations");//print that it was found and leave the method
                return;
            }
        }
        System.out.println(search+" was not found after "+num.length+" iterations");//if not found then this prints that it wasnt
    }
    
}