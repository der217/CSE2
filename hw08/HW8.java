/*
Deepankar Roy
03/24/15
Homework 8
*/
import java.util.Scanner; //import scanner
import java.util.Random; //import Random

//define class
public class HW8 {
        
        public static void main(String[] args) {
                
                char option;
                Scanner scan = new Scanner(System.in);
                System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
                System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
                String input = getInput(scan, "Cc");
                System.out.println("You are in a dead valley.");
                System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
                input = getInput(scan, "Cc");
                System.out.println("You walked and walked and walked and you saw a cave!");
                cave();
                System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
                input = getInput(scan, "Cc");
                System.out.println("You entered a cave!");
                System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
                input = getInput(scan, "Cc");
                System.out.println("Unfortunately, you ran into a GIANT!");
                giant();
                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                input = getInput(scan, "AaEe", 10);
                System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
                System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
                box();
                input = getInput(scan);
                System.out.println("Hero! Have a good day!");
        }
        
        public static void giant() {
                System.out.println("                                 ---------                    ");
                System.out.println("                                |  /    \\|                   ");
                System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
                System.out.println("                           H     -----------   H              ");
                System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
                System.out.println("                           H    HHHHHHHHHHH    H                      ");
                System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
                System.out.println("                                HHHHHHHHHHH                   ");
                System.out.println("                                HHH     HHH                   ");
                System.out.println("                               HHH       HHH                   ");
        }
        
        public static void cave() {
                System.out.println("                              *****   * * * * * * * *        ");
                System.out.println("                         ***         ***                      ");
                System.out.println("                      ***               ***                   ");
                System.out.println("                 |    ***               ***                   ");
                System.out.println("                 |    ***               ***                   ");
                System.out.println("             O __|__  ***               ***                   ");
                System.out.println("           ******l    ***               ***                   ");
                System.out.println("            * *       ***               ***                   ");
                System.out.println("           *   *      ********************* * * * * * *       ");
        }
            
        public static void box(){
                System.out.println("                     *********************     *********************    *********************             ");
                System.out.println("                     ***               ***     ***               ***    ***               ***              ");
                System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
                System.out.println("                     ***               ***     ***               ***    ***               ***              ");
                System.out.println("                     *********************     *********************    *********************               "); 
        }
        
        public static String getInput(Scanner scan, String string) {
                string = scan.next();
                if (!string.equals("C") && !string.equals("c")){
                        System.out.println("Yeah right LOSER");
                        System.exit(1);
                }
                return string;
        }
        
        public static String getInput(Scanner scan, String string, int trial) {
                string = scan.next();
                if (string.equals("A") || string.equals("a")){
                        int att = (int) (Math.random()*2);
                        if (att == 0){
                                System.out.println("Gosh! How could you miss?!");
                                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                                getInput(scan,string,trial);
                        } else {
                                System.out.println("Critical Hit!");
                                trial--;
                                if (trial==0){
                                        return string;
                                } else {
                                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                                        getInput(scan,string,trial);
                                }
                        }
                        return string;
                }
                if (string.equals("E") || string.equals("e")){
                        int esc = (int) (Math.random()*11);
                        if (esc==10){
                                System.out.println("You have succesfully ESCAPED!");
                                System.exit(1);
                                return string;
                        } else {
                                System.out.println("You failed to escape!");
                                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                                getInput(scan,string,trial);
                        }
                        return string;
                } else {
                        System.out.println("You were executed by the Giant! GAME OVER!");
                        System.exit(1);
                        return string;
                }
        }
        
        public static String getInput(Scanner scan) {
                int box = scan.nextInt();
                String reward = "";
                switch (box) {
                        case 1: 
                                System.out.println("You win the EXCALIBUTTER!");
                                break;
                        case 2:
                                System.out.println("You win a pile of free peanuts!");
                                break;
                        case 3:
                                System.out.println("You win a year long subscriptiont to Netflix for all your binge wathcing needs!!!!!");
                                break;
                        default:
                                System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                }
                return reward;
        }

}