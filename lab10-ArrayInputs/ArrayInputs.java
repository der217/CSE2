/*
Deepankar Roy
lab10
ArrayInputs
*/

import java.util.Scanner;

public class ArrayInputs {
    
    public static void main(String[] args){
        
        Scanner ask = new Scanner (System.in);
        System.out.print("Please enter the length of the array: ");
        int size = ask.nextInt();
        int num[] = new int[size];
        for (int i=0; i<num.length; i++){
            System.out.print("Enter a positive int: ");
            if (ask.hasNextInt()){
                int x = ask.nextInt();
                if (check(x)){
                    num[i]=x;
                } else {
                    i--;
                }
            } else {
                System.out.println("You did not enter a positive integer");
                String a = ask.next();
                i--;
            }
        }
        System.out.println(listArray(num));
    }
    
    public static boolean check(int x){
        
        if (x>=0){
            return true;
        } else {
            System.out.println("You did not enter a positive integer");
            return false;
        }
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
}