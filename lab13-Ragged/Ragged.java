/*
Deepankar Roy
lab13
*/

public class Ragged {
    
    public static void main(String[] args){
        
        
        printMatrix(num);
        
        
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
    
   
}