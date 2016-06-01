/**
*This class prints out the frequencies from the Plaintext and Ciphertext files.
*@author Wei Li 
*@version 3/17/2018
*/
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class FrequencyAnalysisTester 
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter outFile = new PrintWriter (new File ("ciphertextfreq.txt"));
        FrequencyAnalysis tester = new FrequencyAnalysis();
        
        int [] alphabetFreq = tester.calcFreq();
        double [] percentFreq = tester.percentFreq(alphabetFreq);
        
        System.out.printf("%8s %13s %15s \n", "Letter", "Frequency", "% Frequency"); 
        outFile.printf("%8s %13s %15s \n", "Letter", "Frequency", "% Frequency"); 
        String [] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
                
        for(int i = 0; i < 26; i++)
        {
            System.out.printf("%8s %13d %15.3f \n", alphabet[i], alphabetFreq[i], percentFreq[i]);
            outFile.printf("%8s %13d %15.3f \n", alphabet[i], alphabetFreq[i], percentFreq[i]);
        }
        outFile.close();
    }
        
}