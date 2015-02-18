////////////////////////////////////////////////////////////////
/*
Deepanakar Roy
02/16/15
Homework 4
Program 1
Ask for a number between 1-10 inclusive.
then ask a series of questions to guess the number.
*/

//import scanner
import java.util.Scanner;

//define class
public class WhichNumber {
    
    public static void main(String[] args) {
        
        Scanner ask = new Scanner (System.in);//construct and declare scanner as ask
        
        System.out.println("Think of an integer between 1 and 10 inclusive");
        String answer = "";
        
            System.out.println("Now answer the questions with a y,Y for yes and n,N for no.");
            System.out.print("Is the number even? ");
            answer = ask.next();
            if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//number is even
                if ((answer.equals("y")) || (answer.equals("Y"))){
                    System.out.print("Is it divisible by 3? ");
                    answer = ask.next();
                    if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is divisible by 3
                        if ((answer.equals("y")) || (answer.equals("Y"))){
                            System.out.print("Is your number 6? ");
                            answer = ask.next();
                            if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is 6
                                if ((answer.equals("y")) || (answer.equals("Y"))){
                                    System.out.println("YAY!");
                                } else {
                                    System.out.println("LIAR!");
                                }
                            } else {
        System.out.println("Invalid Input!");
    }
                        }
//it is not divisible by 3
                        if ((answer.equals("n")) || (answer.equals("N"))){
                            System.out.print("Is the number divisible by 4? ");
                            answer = ask.next();
                            if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is divisible by 4
                                if ((answer.equals("y")) || (answer.equals("Y"))){
                                    System.out.print("When divided by 4 is the result greater than 1? ");
                                    answer = ask.next();
                                    if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//Quatient is greater than 1
                                        if ((answer.equals("y")) || (answer.equals("Y"))){
                                            System.out.print("Is your number 8? ");
                                            answer = ask.next();
                                            if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is 8
                                                if ((answer.equals("y")) || (answer.equals("Y"))){
                                                    System.out.println("YAY!");
                                                } else {
                                                    System.out.println("LIAR!");
                                                }
                                            } else {
        System.out.println("Invalid Input!");
    }
                                        }
                                        
//Quatient is not greater than 1
                                        if ((answer.equals("n")) || (answer.equals("N"))){
                                            System.out.print("Is your number 4? ");
                                            answer = ask.next();
                                            if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is 4
                                                if ((answer.equals("y")) || (answer.equals("Y"))){
                                                    System.out.println("YAY!");
                                                } else {
                                                    System.out.println("LIAR!");
                                                }
                                            } else {
        System.out.println("Invalid Input!");
    }
                                        }
                                    } else {
        System.out.println("Invalid Input!");
    }
                                }
//it is not divisible by 4
                                if ((answer.equals("n")) || (answer.equals("N"))){
                                    System.out.print("Is it divisible by 5? ");
                                    answer = ask.next();
                                    if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is divisible by 5
                                        if ((answer.equals("y")) || (answer.equals("Y"))){
                                            System.out.print("Is your number 10? ");
                                            answer = ask.next();
                                            if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is 10
                                                if ((answer.equals("y")) || (answer.equals("Y"))){
                                                    System.out.println("YAY!");
                                                } else {
                                                    System.out.println("LIAR!");
                                                }
                                            } else {
        System.out.println("Invalid Input!");
    }
                                        }
//it is not divisible by 5
                                        if ((answer.equals("n")) || (answer.equals("N"))){
                                            System.out.print("Is your number 2? ");
                                            answer = ask.next();
                                            if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is 2
                                                if ((answer.equals("y")) || (answer.equals("Y"))){
                                                    System.out.println("YAY!");
                                                } else {
                                                    System.out.println("LIAR!");
                                                }
                                            } else {
        System.out.println("Invalid Input!");
    }
                                        }
                                    } else {
        System.out.println("Invalid Input!");
    }
                                }
                            } else {
        System.out.println("Invalid Input!");
    }
                        }
                    } else {
        System.out.println("Invalid Input!");
    }
                }
//number is not even
                if ((answer.equals("n")) || (answer.equals("N"))){
                    System.out.print("Is it divisible by 3? ");
                    answer = ask.next();
                    if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is divisible by 3
                        if ((answer.equals("y")) || (answer.equals("Y"))){
                            System.out.print("When divided by 3 is the result greater than 1? ");
                            answer = ask.next();
                            if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//quotient is greater than 1
                                if ((answer.equals("y")) || (answer.equals("Y"))){
                                    System.out.print("Is your number 9? ");
                                    answer = ask.next();
                                    if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is 9
                                        if ((answer.equals("y")) || (answer.equals("Y"))){
                                            System.out.println("YAY!");
                                        }
                                    } else {
        System.out.println("Invalid Input!");
    }
                                }
//quotient is not greater than 1
                                if ((answer.equals("n")) || (answer.equals("N"))){
                                    System.out.print("Is your number 3? ");
                                    answer = ask.next();
                                    if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is 3
                                        if ((answer.equals("y")) || (answer.equals("Y"))){
                                            System.out.println("YAY!");
                                        } else {
                                            System.out.println("LIAR!");
                                        }
                                    } else {
        System.out.println("Invalid Input!");
    }
                                }
                            } else {
        System.out.println("Invalid Input!");
    }
                        }
//it is not divisible by 3
                        if ((answer.equals("n")) || (answer.equals("N"))){
                            System.out.print("Is it greater than 6? ");
                            answer = ask.next();
                            if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is greater than 6
                                if ((answer.equals("y")) || (answer.equals("Y"))){
                                    System.out.print("Is your number 7? ");
                                    answer = ask.next();
                                    if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is 7
                                        if ((answer.equals("y")) || (answer.equals("Y"))){
                                                    System.out.println("YAY!");
                                        } else {
                                            System.out.println("LIAR!");
                                        }
                                    } else {
        System.out.println("Invalid Input!");
    }    
                                }
//it is not greater than 6
                                if ((answer.equals("n")) || (answer.equals("N"))){
                                    System.out.print("Is it less than 3? ");
                                    answer = ask.next();
                                    if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is less than 3
                                        if ((answer.equals("y")) || (answer.equals("Y"))){
                                            System.out.print("Is your number 1? ");
                                        answer = ask.next();
                                        if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is 1
                                            if ((answer.equals("y")) || (answer.equals("Y"))){
                                                        System.out.println("YAY!");
                                            } else {
                                                System.out.println("LIAR!");
                                            }
                                        } else {
        System.out.println("Invalid Input!");
    }
//it is not less than 3
                                        if ((answer.equals("n")) || (answer.equals("N"))){
                                            System.out.print("Is your number 5? ");
                                            answer = ask.next();
                                        if ((answer.equals("y"))||(answer.equals("Y"))||(answer.equals("n"))||(answer.equals("N"))){
//it is 5
                                            if ((answer.equals("y")) || (answer.equals("Y"))){
                                                        System.out.println("YAY!");
                                            } else {
                                                System.out.println("LIAR!");
                                            }
                                        } else {
        System.out.println("Invalid Input!");
    }
                                    }    
                                }
                                    } else {
        System.out.println("Invalid Input!");
    }
                        }
                            } else {
        System.out.println("Invalid Input!");
    }
                }
            } else {
        System.out.println("Invalid Input!");
    }
        }
    } else {
        System.out.println("Invalid Input!");
    }
}
}