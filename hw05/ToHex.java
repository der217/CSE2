////////////////////////////////////////////////////////////////////////////
/*
Deepankar Roy
02/24/2015
Homework 5
ToHex Program
ask user to input 3 ints, and convert them to hex
*/

//import scanner
import java.util.Scanner;

//define class
public class ToHex {
        
    public static void main(String[] args) {
        
        Scanner ask = new Scanner (System.in);
        
        int red,green,blue,x;
        String r1 = "";
        String r2 = "";
        String g1 = "";
        String g2 = "";
        String b1 = "";
        String b2 = "";
        
        System.out.println("Please enter three numbers representing RGB values:");
        if (ask.hasNextInt()){
            red = ask.nextInt();
            if ( red <= 255 && red >= 0) {
                x = (int) (red/16);
                switch (x) {
                    case 0:
                        r1 = "0" ;
                        break;
                    case 1:
                        r1 = "1" ;
                        break;
                    case 2:
                        r1 = "2" ;
                        break;
                    case 3:
                        r1 = "3" ;
                        break;
                    case 4:
                        r1 = "4" ;
                        break;
                    case 5:
                        r1 = "5" ;
                        break;
                    case 6:
                        r1 = "6" ;
                        break;
                    case 7:
                        r1 = "7" ;
                        break;
                    case 8:
                        r1 = "8" ;
                        break;
                    case 9:
                        r1 = "9" ;
                        break;
                    case 10:
                        r1 = "A" ;
                        break;
                    case 11:
                        r1 = "B" ;
                        break;
                    case 12:
                        r1 = "C" ;
                        break;
                    case 13:
                        r1 = "D" ;
                        break;
                    case 14:
                        r1 = "E" ;
                        break;
                    case 15:
                        r1 = "F" ;
                        break;
                }
                x = red%16;
                switch (x) {
                    case 0:
                        r2 = "0" ;
                        break;
                    case 1:
                        r2 = "1" ;
                        break;
                    case 2:
                        r2 = "2" ;
                        break;
                    case 3:
                        r2 = "3" ;
                        break;
                    case 4:
                        r2 = "4" ;
                        break;
                    case 5:
                        r2 = "5" ;
                        break;
                    case 6:
                        r2 = "6" ;
                        break;
                    case 7:
                        r2 = "7" ;
                        break;
                    case 8:
                        r2 = "8" ;
                        break;
                    case 9:
                        r2 = "9" ;
                        break;
                    case 10:
                        r2 = "A" ;
                        break;
                    case 11:
                        r2 = "B" ;
                        break;
                    case 12:
                        r2 = "C" ;
                        break;
                    case 13:
                        r2 = "D" ;
                        break;
                    case 14:
                        r2 = "E" ;
                        break;
                    case 15:
                        r2 = "F" ;
                        break;
                }
            }else{
                System.out.println("Integers between 0-255 only.");
                return;
            }
        } else {
            System.out.println("Integers only.");
            return;
        }
        if (ask.hasNextInt()){
            green = ask.nextInt();
            if ( green <= 255 && green >= 0) {
                x = (int) (green/16);
                switch (x) {
                    case 0:
                        g1 = "0" ;
                        break;
                    case 1:
                        g1 = "1" ;
                        break;
                    case 2:
                        g1 = "2" ;
                        break;
                    case 3:
                        g1 = "3" ;
                        break;
                    case 4:
                        g1 = "4" ;
                        break;
                    case 5:
                        g1 = "5" ;
                        break;
                    case 6:
                        g1 = "6" ;
                        break;
                    case 7:
                        g1 = "7" ;
                        break;
                    case 8:
                        g1 = "8" ;
                        break;
                    case 9:
                        g1 = "9" ;
                        break;
                    case 10:
                        g1 = "A" ;
                        break;
                    case 11:
                        g1 = "B" ;
                        break;
                    case 12:
                        g1 = "C" ;
                        break;
                    case 13:
                        g1 = "D" ;
                        break;
                    case 14:
                        g1 = "E" ;
                        break;
                    case 15:
                        g1 = "F" ;
                        break;
                }
                x = green%16;
                switch (x) {
                    case 0:
                        g2 = "0" ;
                        break;
                    case 1:
                        g2 = "1" ;
                        break;
                    case 2:
                        g2 = "2" ;
                        break;
                    case 3:
                        g2 = "3" ;
                        break;
                    case 4:
                        g2 = "4" ;
                        break;
                    case 5:
                        g2 = "5" ;
                        break;
                    case 6:
                        g2 = "6" ;
                        break;
                    case 7:
                        g2 = "7" ;
                        break;
                    case 8:
                        g2 = "8" ;
                        break;
                    case 9:
                        g2 = "9" ;
                        break;
                    case 10:
                        g2 = "A" ;
                        break;
                    case 11:
                        g2 = "B" ;
                        break;
                    case 12:
                        g2 = "C" ;
                        break;
                    case 13:
                        g2 = "D" ;
                        break;
                    case 14:
                        g2 = "E" ;
                        break;
                    case 15:
                        g2 = "F" ;
                        break;
                }
            }else{
                System.out.println("Integers between 0-255 only.");
                return;
            }
        } else {
            System.out.println("Integers only.");
            return;
        }
        if (ask.hasNextInt()){
            blue = ask.nextInt();
            if ( blue <= 255 && blue >= 0) {
                x = (int) (blue/16);
                switch (x) {
                    case 0:
                        b1 = "0" ;
                        break;
                    case 1:
                        b1 = "1" ;
                        break;
                    case 2:
                        b1 = "2" ;
                        break;
                    case 3:
                        b1 = "3" ;
                        break;
                    case 4:
                        b1 = "4" ;
                        break;
                    case 5:
                        b1 = "5" ;
                        break;
                    case 6:
                        b1 = "6" ;
                        break;
                    case 7:
                        b1 = "7" ;
                        break;
                    case 8:
                        b1 = "8" ;
                        break;
                    case 9:
                        b1 = "9" ;
                        break;
                    case 10:
                        b1 = "A" ;
                        break;
                    case 11:
                        b1 = "B" ;
                        break;
                    case 12:
                        b1 = "C" ;
                        break;
                    case 13:
                        b1 = "D" ;
                        break;
                    case 14:
                        b1 = "E" ;
                        break;
                    case 15:
                        b1 = "F" ;
                        break;
                }
                x = blue%16;
                switch (x) {
                    case 0:
                        b2 = "0" ;
                        break;
                    case 1:
                        b2 = "1" ;
                        break;
                    case 2:
                        b2 = "2" ;
                        break;
                    case 3:
                        b2 = "3" ;
                        break;
                    case 4:
                        b2 = "4" ;
                        break;
                    case 5:
                        b2 = "5" ;
                        break;
                    case 6:
                        b2 = "6" ;
                        break;
                    case 7:
                        b2 = "7" ;
                        break;
                    case 8:
                        b2 = "8" ;
                        break;
                    case 9:
                        b2 = "9" ;
                        break;
                    case 10:
                        b2 = "A" ;
                        break;
                    case 11:
                        b2 = "B" ;
                        break;
                    case 12:
                        b2 = "C" ;
                        break;
                    case 13:
                        b2 = "D" ;
                        break;
                    case 14:
                        b2 = "E" ;
                        break;
                    case 15:
                        b2 = "F" ;
                        break;
                }
            }else{
                System.out.println("Integers between 0-255 only.");
                return;
            }
        } else {
            System.out.println("Integers only.");
            return;
        }
        System.out.println("The decimal numbers R:"+red+", G:"+green+", B:"+blue+", is represented in hexadecimal as: "+r1+r2+g1+g2+b1+b2);
    }
}
