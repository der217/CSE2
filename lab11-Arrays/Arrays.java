/*
Deepankar Roy
Lab09 Methods
*/

import java.util.Scanner;
import java.util.Random;

public class Arrays{
    
    public static void main(String[] args){
        
        int array1[] = new int[50];
        int array2[] = new int[50];
        int min1 = 0;
        int max1 = 0;
        
        for (int i=0;i<50;i++){
            array1[i]= (int) (Math.random()*100);
            if (array1[i]<min1){
                min1 = array1[i];
            }
            if (array1[i]>max1){
                max1 = array1[i];
            }
        }
        System.out.println("The min of array1 is: "+min1);
        System.out.println("The max of array1 is: "+max1);
        
        int min2 = (int) (Math.random()*100);
        array2[0]= min2;
        for (int j=1;j<50;j++){
            array2[j]=(int) (array2[j-1]*1.2);
        }
        int max2 = array2[49];
        System.out.println("The min of array1 is: "+min2);
        System.out.println("The max of array1 is: "+max2);
        
        Scanner ask = new Scanner (System.in);
        System.out.print("Enter int >=0: ");
        int search = ask.nextInt();

        System.out.println(binary(array2,search));
        
    }
    
     public static String binary(int[] num, int search){
        int min = 0;
        int max = 49;
        
        for (int i=min;i<=max;i++){
            int mid = (int) ((max-min)/2)+min;
            if (num[mid]==search){
                Srint search = 
            }
            else if (num[mid]>search){
                max = mid;
            }
            else if (num[mid]<search){
                min = mid;
            }
        }
        return "Found.";
    }
}