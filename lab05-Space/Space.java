/*
Deepankar Roy
Lab5 Space
*/

public class Space{
    
    public static void main(String[] args){
        
        int x = (int) (Math.random()*11);
        System.out.println("Heres a timeline of Space exploration events up till the year "+(x+2000)+" since 2000");
        
        switch (x){
            case 10:
                System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back");
            case 9:
                System.out.println("2009: N/A");
            case 8:
                System.out.println("2008: Kepler launched to study deep space");
            case 7:
                System.out.println("2007: N/A");
            case 6:
                System.out.println("2006: Spacecraft returns with collections from a comet");
            case 5:
                System.out.println("2005: Spacecraft collides with comet");
            case 4:
                System.out.println("2004: N/A");
            case 3:
                System.out.println("2003: Largest infrared telescope released");
            case 2:
                System.out.println("2002: N/A");
            case 1:
                System.out.println("2001: First spacecraft lands on asteroid");
            case 0:
                System.out.println("2000: First spacecraft orbits an asteroid");
            
        }
    }
}