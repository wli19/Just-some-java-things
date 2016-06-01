/**
 * This program recusively determines whether a given String is a palindrome. 
 */
import java.util.*;
public class RecursivePalindrome
{
   /**
    * Modifies input to take into account punctuation, cases, and spaces. 
    */
   public String palindromeHelper(String input)
   {
       String modifiedinput = input.toLowerCase();

       while(modifiedinput.contains(",") || modifiedinput.contains( "." ) || modifiedinput.contains( "?" ) ||
            modifiedinput.contains( "!" ) || modifiedinput.contains( " " ) )
        {
            if( modifiedinput.contains( "," ) )
                modifiedinput = modifiedinput.substring( 0, modifiedinput.indexOf( ',' ) ) + modifiedinput.substring( modifiedinput.indexOf( ',' ) + 1);
    
            if( modifiedinput.contains( "." ) )
                modifiedinput = modifiedinput.substring( 0, modifiedinput.indexOf( '.' ) ) + modifiedinput.substring( modifiedinput.indexOf( '.' ) + 1);
    
            if( modifiedinput.contains( "?" ) )
                modifiedinput = modifiedinput.substring( 0, modifiedinput.indexOf( '?' ) ) + modifiedinput.substring( modifiedinput.indexOf( '?' ) + 1);
    
            if( modifiedinput.contains( "!" ) )
                modifiedinput = modifiedinput.substring( 0, modifiedinput.indexOf( '!' ) ) + modifiedinput.substring( modifiedinput.indexOf( '!' ) + 1);
    
            if( modifiedinput.contains( " " ) )
                modifiedinput = modifiedinput.substring( 0, modifiedinput.indexOf( ' ' ) ) + modifiedinput.substring( modifiedinput.indexOf( ' ' ) + 1);
        }

       return modifiedinput;
    }
    
   
    /**
     * Determines whether or not the string is a palindrome
     */
   public boolean palindrome(String modifiedinput)
   {
       if (modifiedinput.length() <= 1)
        {
            return true;
        }
       else if(modifiedinput.charAt(0) == modifiedinput.charAt(modifiedinput.length() - 1))        //first and last letter are the same
       {
            return palindrome(modifiedinput.substring(1, modifiedinput.length() - 1));
       }
       else 
       {
            return false;
       }
   }
   
   public boolean tryAgain()
   {
       Scanner in = new Scanner( System.in );
       System.out.println();
       System.out.println("Would you like to try again? Press 1 to try again, 2 to quit.");
        
       int input = in.nextInt();
       if(input == 1)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    
}
