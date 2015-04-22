/*
Deepankar Roy
Multiply hw12
*/

import java.util.Scanner;//import scanner
import java.util.Random;//import random

public class Multiply {
    
    public static void main(String[] args){
        Scanner ask = new Scanner (System.in);//declare scanner
        int x = 0;
        int h1=0,h2=0,w1=0,w2=0;
        while (x==0){
            System.out.println("Please enter 2 ints, first for the height and second for width, to generate a random matrix: ");//ask for input
            h1 = ask.nextInt();
            w1 = ask.nextInt();
            System.out.println("Please enter 2 more ints, first for the height and second for width, to generate a second random matrix: ");//ask for input
            h2 = ask.nextInt();
            w2 = ask.nextInt();
            if (w1==h2){
                x=1;
            } else {
                System.out.println("Dimensions entered are not compatible for multiplication. retry.");
            }
        }
        int[][] mat1 = randomMatrix(h1,w1);//generate random matrix 1
        System.out.println("Matrix 1:");
        printMatrix(mat1);
        int[][] mat2 = randomMatrix(h2,w2);//generate random matrix 2
        System.out.println("Matrix 2:");
        printMatrix(mat2);
        int[][] prod = matrixMultiply(mat1,mat2);
        System.out.println("Product:");
        printMatrix(prod);
}
    
    public static int[][] randomMatrix(int height, int width){
        int[][] num = new int[height][width]; //create the 2-dim array
        for (int row=0; row<height; row++){//the row being worked on
            for (int col=0; col<width; col++){//col being worked on
                num[row][col] = (int) (Math.random()*20) - 10; //assigns a number between -10 and 10
            }
        }
        return num;
    }
    
    public static void printMatrix(int[][] matrix){
        for (int row=0; row<matrix.length; row++){//the row being worked on
            System.out.print("|\t");//starts at beginning of each row
            for (int col=0; col<matrix[row].length; col++){//col being worked on
               System.out.print(matrix[row][col]+"\t"); //print the number in that location
            }
            System.out.println("|"); //finishes off each row
        }
    }
    
    public static int[][] matrixMultiply(int[][] a, int[][] b){
        int height = a.length;//number of rows in product= num of rows in a 
        int width = b[0].length;//num of cols in prod = num of cols in b
        int[][] prod = new int[height][width];
        if(a[0].length==b.length){//check compalibility for mult
            for (int row=0;row<height;row++){//row being worked on
                for (int col=0;col<width;col++){//col being worked on
                    int linComb = 0;
                    for (int x=0;x<b.length;x++){//doing linear combination
                        linComb+= a[row][x]*b[x][col];
                    }
                    prod[row][col] = linComb;
                }
            }
        }else{
            System.out.println("Incompatible dimensions.");
        }
        return prod;
    }
    
}