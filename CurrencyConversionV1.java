/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 */
public class CurrencyConversionV1
{
    public static void main(String [ ] args)
    {
        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        double startingUsDollars = 5000.00;     // local variable for US Dollars
        
        // Mexico - pesos
        double pesoExchangeRate = 13.23093;     // local variable for exchange rate of US Dollars to Pesos
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent
        double dollarsSpentInMexico = pesosSpent/pesoExchangeRate;      // local variable for dollars spent in Mexico

        // Japan - yen
        double yenExchangeRate = 108.8854;      // local variable for exchange rate of US Dollars to Yen
        double yensSpent = 99939.75;            // local variable for Yen spent
        double dollarsSpentInJapan = yensSpent/yenExchangeRate;          // local variable for dollars spent in Japan

        // France - euros
        double euroExchangeRate = 0.778373;     // local variable for exchange rate of US dollars to Euro
        double eurosSpent = 624.95;             // local variable for Euro spent
        double dollarsSpentInFrance = eurosSpent/euroExchangeRate;       // local variable for dollars spent in France
        
        // dollars remaining
        double remainingUsDollars = startingUsDollars - dollarsSpentInMexico - dollarsSpentInJapan - dollarsSpentInFrance; // local variable for US Dollars remaining

        //print output to the screen
        System.out.print("Starting US Dollars:          ");
        System.out.println(startingUsDollars);
        System.out.print("US Dollars spent in Mexico:   ");
        System.out.println(dollarsSpentInMexico);
        System.out.print("US Dollars spent in Japan:    ");
        System.out.println(dollarsSpentInJapan);
        System.out.print("US Dollars spent in France:   ");
        System.out.println(dollarsSpentInFrance);
        System.out.println("====================================================");
        System.out.print("Remaining US Dollars:         ");
        System.out.println(remainingUsDollars);
        System.out.println();
        System.out.println();
        
        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 4;                          //cost per item of first souvenir
        int budget1 = 50;                           //budget for first item
        int totalItem1 = budget1/costItem1;         //how many items can be purchased
        int fundsRemaining1 = budget1%costItem1;    //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItem1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);

        //Calculations for Souvenir #2
        double costItem2 = 32.55;                       //cost per item of second souvenir
        int budget2 = 713;                              //budget for second item
        int totalItem2 = (int)((double)budget2/costItem2);     //how many items can be purchased
        double fundsRemaining2 = (double)budget2%costItem2;    //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItem2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
