/*
Deepankar Roy
03/16/15
Homework 7
Waves program
-take input of an integer between 1-30 inclusive and then create
loops with for,while,and do-while each
*/

import java.util.Scanner; //import scanner

public class waves {
    
    public static void main(String[] args) {
        
        Scanner ask = new Scanner (System.in); //declare the scanner
        
        int num = 0, f = 1, w = 1, d = 1, x = 0, y = 0; //declare variables
        
        System.out.print("Enter an integer between 1 and 30, inclusive: "); //ask for input
        num = ask.nextInt(); //assign the input value to num
        
        if ( num<1 || num>30 ){
            System.out.println("Invalid input."); //error message
            return;
        }
        
        System.out.println();
        System.out.println("With For:");
        
        for (f=1;f<=num;f++){ //using for
            if ((f%2)==0){ //evens increase
                for(y=0;y<f;y++){
                    for (x=y;x>=0;x--){
                        System.out.print(f);
                    }
                    System.out.println();
                }
            }
            if ((f%2)==1){ //odds decrease
                for(y=(f-1);y>=0;y--){
                    for (x=y;x>=0;x--){
                        System.out.print(f);
                    }
                    System.out.println();
                }
            }
        }
        y=0;
        x=0; //resetting counters
        
        System.out.println();
        System.out.println("With While:");
        
        while (w<=num){ //using while
            if ((w%2)==0){ //evens increase
                while(y<w){
                    x=y;
                    while (x>=0){
                        System.out.print(w);
                        x--;
                    }
                    System.out.println();
                    y++;
                }
            }
            if ((w%2)==1){ //odds decrease
                y=(w-1);
                while(y>=0){
                    x=y;
                    while (x>=0){
                        System.out.print(w);
                        x--;
                    }
                    if (y>0){
                    System.out.println();
                    }
                    y--;
                }
            }
            w++;
        }
        System.out.println();
        y=0;
        x=0; //resetting counters
        
        System.out.println();
        System.out.println("With do-while:");
        
        do { //using do-while
            if ((d%2)==0){ //evens increase
                do {
                    x=y;
                    do {
                        System.out.print(d);
                        x--;
                    }while (x>=0);
                    System.out.println();
                    y++;
                }while(y<d);
            }
            if ((d%2)==1){ //odds decrease
                y=(d-1);
                do {
                    x=y;
                    do {
                        System.out.print(d);
                        x--;
                    }while (x>=0);
                    if (y>0){
                    System.out.println();
                    }
                    y--;
                }while(y>=0);
            }
            d++;
        } while (d<=num);
        System.out.println();
    }
}