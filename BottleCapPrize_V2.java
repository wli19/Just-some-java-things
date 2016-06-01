/**
 * To write a program that uses the Monte Carlo sampling method to estimate 
 * the average number of bottles of e-Boost someone would have to drink to win 
 * a prize. 
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;
public class BottleCapPrize_V2
{
    public static void main (String [] args) throws IOException
    {
        PrintWriter outFile = new PrintWriter (new File ("MonteCarlo.txt"));
        //intialize variables
        Random randNum = new Random ();
        int bottleCapNum = 0;
        int wins = 0;
        int capsOpened = 0;
        int sum = 0; 
        
        //User input for number of trials
        Scanner in = new Scanner(System.in);
        System.out.print("Number of trials (at least 1000): ");
        int numTrials = in.nextInt();
        
        //Monte Carlo Method
        for (int loop = 1; loop <=numTrials; loop++)
        {
            bottleCapNum = randNum.nextInt(5);
            while (bottleCapNum != 0)
            {
                capsOpened++;
                bottleCapNum = randNum.nextInt(5);
            }
            if (bottleCapNum == 0)
            {
                capsOpened++;
                wins++;
            }
            sum += capsOpened;
            outFile.println(capsOpened);
            capsOpened = 0;
        }
        
        //average number of files
        double avgNumOfBottles = ((double)sum/wins); //sum of the trials divided by number of trials
        outFile.println("The average number of bottles needed to be win a prize: " + avgNumOfBottles);
        outFile.close();
        
        //Screen output
        Scanner inputFile = new Scanner(new File ("MonteCarlo.txt"));
        while (inputFile.hasNextLine())
        {
            String token = inputFile.nextLine();
            System.out.println(token);
        }
        inputFile.close();
            
    }
}
