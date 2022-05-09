// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_5_1
// File Name: Binary.java

// This program prompts the user for a binary representation of a number,
// and if that number is verified to be a valid binary number, 
// than the program will output a valid statement to the user 
// and the number of 1s in the binary representation.
// If the input from the user is not a binary representation for any reason, 
// than the program will send an invalid statement to the user 
// and prompt for another input to try again

//Import I used
import java.util.Scanner;

public class Binary 
{
    
    public static void main(String[] args) 
    {
        
        //Variable I used
        String input;
        
        // Makes a new scanner to scan the input from the user
        Scanner scan = new Scanner(System.in);
        
        // Prompts and scans the input from the user
        System.out.print("Enter a sequence of 1s and 0s representing a word: ");
        input = scan.nextLine();
        
        // while statement to handle if the input contains 2-9, a-z, or A-Z
        while ((input.matches("[2-9]+")) || (input.matches("[0-1]+")) == false 
        || (input.contains("[2-9]+")))
        {
            
        // Prints out a false statement
        System.out.println(input + " is not a valid binary number!");
        // Reprompts the user to try again
        System.out.print("Try again! Enter a sequence of 1s and 0s "
        + "representing a word: ");
        input = scan.nextLine();
        
        }
        
        // else if statement to handle if the input 
        // doesn't contains 2-9, and contains 0-1
        if (input.matches("[0-1]+") == true && (input.matches("[2-9]+")) 
        == false)
        {
            
        // Prints out a true statement 
        System.out.println(input + " is a valid binary number!");
        //System.out.println(input + " contains " + ones + "ones!");
        
        // Handles the counting of the 1s in the input statement
        
        // Variables used
        char ones = '1';
        int totalOnes = 0;
        
        // Starts the int counter off at 0, if that counter is less than the 
        // length of the users input
        // (it will be added to later on to continue the count), 
        // note that point and add 1 to a.
        
        // It runs this for every instance of 
        // a for every character in the users input.
        
        for (int a = 0; a < input.length(); a=a+1) 
        {
        
        // If the character at position a = 1, then add one to the counter
        if (input.charAt(a) == ones) 
        {
            
        // adds one to the counter
        totalOnes = totalOnes+1;
        
        }
        
        }
        
        // Prints out the number of 1s in the users input
        System.out.println(input + " has " + totalOnes + " ones in it!");
        
        }
        
    }
    
}
