/*
Deepankar Roy
Homework 10
Remove Elemnts Program
*/

    import java.util.Scanner;
    public class RemoveElements{
        public static void main(String [] arg){
        	Scanner scan=new Scanner(System.in);
            int num[]=new int[10];
            int newArray1[];
            int newArray2[];
            int index,target;
        	String answer="";
        	do{
          	System.out.print("Random input 10 ints [0-9]");
          	num = randomInput();
          	String out = "The original array is:";
          	out += listArray(num);
          	System.out.println(out);
         
          	System.out.print("Enter the index ");
          	index = scan.nextInt();
          	newArray1 = delete(num,index);
          	String out1="The output array is ";
          	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out1);
         
            System.out.print("Enter the target value ");
          	target = scan.nextInt();
          	newArray2 = remove(num,target);
          	String out2="The output array is ";
          	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out2);
          	 
          	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
          	answer=scan.next();
        	}while(answer.equals("Y") || answer.equals("y"));
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
              int i; //counter
              for (i=0;i<num.length;i++){ //for each position in the array, assign a random value
                  if (i>0){
                      num[i] = (int) (Math.floor(Math.random()*10));
                  }
              }
              return num;
        }
          
        public static int[] delete(int list[], int pos){
              int num[] = new int[list.length-1];//makes new array with length one less
              int i; //counter
              for (i=0;i<num.length;i++){ //check each element
                  if (i<pos){ //if before the postion, leave it be
                      num[i] = list[i];
                  }
                  else if (i>=pos){ //starting at the position, drop that elements and move all elements after, up 1 place
                      num[i] = list[i+1];
                  }
              }
              return num;
        }
        
        public static int[] remove(int list[], int target){
            int i; //counter
            int num[] = new int[10];
            num = list;
            for (i=0;i<num.length;i++){
                if (num[i]==target){
                    delete(num,i);
                }
                list = num;
                
            }
            return num;
        }
        
    }
