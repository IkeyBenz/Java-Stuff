import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

class Lesson_3_Activity_Two {
    public static void main (String str[]) throws IOException {
      
      Scanner scan = new Scanner(System.in);
      
      int firstNumber = 0;
      int secondNumber = 1;
      int newNumber = firstNumber + secondNumber;
      
      int[] fSequence;
      
      System.out.println("Which fibonacci number do you want?");
      // Sets n to the users input
      int n = scan.nextInt();
      // Allocates enough spats for all the fibonacci numbers requested
      fSequence = new int[n];
      
      // Adds the first two numbers into the array
      fSequence[0] = firstNumber;
      fSequence[1] = secondNumber;
       
      // Creates loop that itterates n times. Adding n amount of numbers to the fSequence array
       for (int x = 0; x < n; x++) {  
            fSequence[x + 2] = newNumber;
            firstNumber = fSequence[x + 1];
            secondNumber = fSequence[x + 2];
            newNumber = firstNumber + secondNumber;
       } 
      System.out.println(fSequence[n - 1]);
    } 
}  