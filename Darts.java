/**
 * Description: This program calculates the value of pi by simulating throwing darts at a dart board.
 */
import java.util.Scanner;
import java.util.Random;
public class Darts
{
    //Asking user for the number of Darts per Trial
    public static int numDartsPerTrial()
    {
        Scanner in = new Scanner(System.in);  
        System.out.print("Number of darts per trial: ");  
        int numDartsPerTrial = in.nextInt();
        
        return numDartsPerTrial;
    }
    
    //asking user for the number of trials
    public static int numTrials()
    {
        Scanner in = new Scanner(System.in);  
        System.out.print("Number of trials: ");
        int numTrials = in.nextInt();
        
        return numTrials;
    }
    
    //calculation of Pi for each iteration
    public static double [] calcPi (int numDartsPerTrial, int numTrials)
    {
        //initializing variables
        double [] piValues = new double [numTrials];
        int counterIn = 0;
        
        //process
        for (int n = 0; n < numTrials; n++)
        {
            counterIn = 0;
            for (int i = 0; i<numDartsPerTrial; i++)
            {
                double xNum = Math.random();
                double yNum = Math.random();
                double r = Math.sqrt(Math.pow( xNum , 2 ) + Math.pow( yNum , 2 ) );
                if (r <= 1.0)
                {
                    counterIn++;
                }
            }
            piValues [n] = 4.0*((double)counterIn/(double)numDartsPerTrial);
        }
        return piValues;
    }
    
    //calculation of the average value of Pi
    public static double avgPi (double [] piValues)
    {
        double sumPiValues = 0;
        for (int i = 0; i < piValues.length; i++)
        {
            sumPiValues += piValues [i];
        }
       
        double avgPi = sumPiValues/piValues.length;
        
        return avgPi;
    }
    
    //output formatting
    public static void printResults(double [] piValues, double avgPi, int numTrials)
    {
        for (int i = 0; i < numTrials; i++)
        {
            System.out.printf("%5s %2s %2d %2s %4s %9.6f\n", "Trial", "[", i, "]:", "pi=", piValues[i]);
        }
        System.out.print("Estimate of pi = " + avgPi);
    }
    
    //main script
    public static void main(String[ ] args)
    {
        //initializing variables
        int numDartsPerTrial = numDartsPerTrial();
        int numTrials = numTrials();

        double [] piValuesPerTrial = calcPi(numDartsPerTrial, numTrials);
        double piAvg = avgPi(piValuesPerTrial);
        
        //output
        printResults(piValuesPerTrial, piAvg, numTrials);
        
        
    }//end of main method
}//end of class
