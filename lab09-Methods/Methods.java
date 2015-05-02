/*
Deepankar Roy
Lab09 Methods
*/

import java.util.Random;

public class Methods{
    
    public static void main(String[] args){
        
        System.out.println("The "+adjective()+" "+subject()+" "+verb()+" the "+object()+".");
        
    }
    
    public static String adjective(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(10);
        
        switch (x) {
            case 0:
                return "quick";
                 
            case 1:
                return "slow";
                 
            case 2:
                return "fat";
                 
            case 3:
                return "thin";
                 
            case 4:
                return "big";
                 
            case 5:
                return "bouncy";
                 
            case 6:
                return "squeeky";
                 
            case 7:
                return "pointy";
                 
            case 8:
                return "wiggly";
                 
            case 9:
                return "tiny";
                 
            
        }
        return "";
    }
        
        public static String subject(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(10);
        
        switch (x) {
            case 0:
                return "man";
                 
            case 1:
                return "woman";
                 
            case 2:
                return "boy";
                 
            case 3:
                return "girl";
                 
            case 4:
                return "dog";
                 
            case 5:
                return "cat";
                 
            case 6:
                return "kitty";
                 
            case 7:
                return "puppy";
                 
            case 8:
                return "bunny";
                 
            case 9:
                return "bird";
                 
            
        }
        return "";
    }
        
        public static String verb(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(10);
        
        switch (x) {
            case 0:
                return "jumped over";
                 
            case 1:
                return "ran past";
                 
            case 2:
                return "bumped into";
                 
            case 3:
                return "fell onto";
                 
            case 4:
                return "kicked";
                 
            case 5:
                return "picked up";
                 
            case 6:
                return "vigorously smacked";
                 
            case 7:
                return "poked";
                 
            case 8:
                return "pinched";
                 
            case 9:
                return "stabbed";
                 
            
        }
        return "";
    }
        
        public static String object(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(10);
        
        switch (x) {
            case 0:
                return "river";
                 
            case 1:
                return "mountain";
                 
            case 2:
                return "ocean";
                 
            case 3:
                return "ball";
                 
            case 4:
                return "bridge";
                 
            case 5:
                return "wall";
                 
            case 6:
                return "street";
                 
            case 7:
                return "stupid friend";
                 
            case 8:
                return "silly goat";
                 
            case 9:
                return "spiderman";
                 
            
        }
        return "";
    }
    
}