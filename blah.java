////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Deepankar Roy
//Demo 0
//Hello World Java Program
//
//  first compile the program
//      javac HelloWorld.java
//  run the program
//      Java HelloWorld//

//import scanner
import java.util.Scanner;

public class blah{
    
    //add main method
    public static void main(String[] args){
        
        int x[] = {1,2,4,6};
        int u[] = {3,4,5,6,7};
        int v[] = {2,21,5};
        
    }
    
    public static String listArray(int num[]){
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
      
    public static int[] randomInput(){
        int num[] = new int[10]; //make the array
        for (i=1;i<=num.length;i++){ //for each position in the array, assign a random value
            if (i>0){
                num[i] = (int) (Math.floor(Math.random)*10);
            }
        }
        return num[];
    }

    
}