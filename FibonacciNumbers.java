/**
 * This program recusively calculaes the n-th Fibonacci number. 
 * 
 * @author (Wei Li) 
 * @version (2/9/2015)
 */
import java.util.Scanner;
public class FibonacciNumbers
{
   public int fib(int x)
   {
        if (x == 0)                        //the base case
        {
            return 0;
        }
        else if (x == 1)
        {
            return 1;
        }
        else if (x >= 49 || x< 0)
        {
            return -1;
        }
        else 
        {
            return fib(x-1) + fib(x-2);
        }
   } 
   
   public static void main(String[] args)
   {
       FibonacciNumbers fibMethod = new FibonacciNumbers();
        
       Scanner in = new Scanner(System.in);
        
       String input1, inputYorN;
       int number = 0, fibseq = 0;
       boolean running = true;
       
       System.out.println("This program is meant to find the nth Fibonacci number.");

       while(running)
       {
            System.out.print("Enter the number n: ");
            input1 = in.nextLine();
            number = Integer.parseInt(input1);
            
            fibseq = fibMethod.fib(number);
            if(fibseq == -1)
            {
                System.out.println("Error! Please enter a positive integer less than 49 and greater than 0!");
            }
            else
            {
                System.out.println("The " + number + "th Fibonacci Sequence number is " +fibseq + ".");
                System.out.println("Would you like to find another number? Y or N: ");
                inputYorN = in.nextLine();
                if(inputYorN.equalsIgnoreCase("n"))
                {
                    running = false;
                }
                System.out.println("\f");
            }
       }
     }   
}

