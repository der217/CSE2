/////////////////////////////////////////////////////
/*
Deepankar Roy
Lab 05 SmileGenerator
02/27/15
generate 5 smiles in a line with for, whiule and do while loops
generate a random number between 1-100 and then print thos smilies while keeping the max smilies in one line to 30
*/
//import Random
import java.util.Random;

public class SmileGenerator {
    
    public static void main(String[] args) {
        
        int c = 0;
        for (c=0;c<5;c++) {
            System.out.print(":) ");
        }
        System.out.println();
        c = 0;
        while ( c < 5 ){
            System.out.print(":) ");
            c++;
        }
        System.out.println();
        c = 0;
        do {
            System.out.print(":) ");
            c++;
        }while(c<5);
        System.out.println();
        c = 0;
        
        int number = (int) (Math.random()*99+1);
        for (c=1;c<=number;c++){
            System.out.print(":) ");
            if ((c%30)==0){
                System.out.println();
            }
        }
        System.out.println();
        c=0;
        
        int lines = 4;
        int x = 1;
        do {
            for (c=0;c<x;c++) {
                System.out.print(":) ");
            }
            System.out.println();
            x++;
        } while(x<=lines);
    }
}