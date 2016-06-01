/**
 * This program models an individual's CO2 production and reduction.
 * 
 * @author (Wei Li) 
 * @version (12/27/14)
 */
public class CO2Footprint
{
   private int myNumPeople, myNumBulb;
   private double myBulbReduc;
   private double myGallonsUsed, myPoundsCO2FromGas;
   private double myAvgElectricBill, myAvgElectricPrice, myElectricCO2;
   private boolean myPaper, myPlastic, myGlass, myCans;
   private double myEmissions, myReduction, myNetEmissions;

   /**
    * Constructor for objects of type CO2Footprint
    * @param gasoline the gallons of gasoline used
    * @param avgElectricBill average monthly electric bill
    * @param avgElectricPrice average price per KWH
    * @param numPeople number of people in a household
    * @param paper whether or not paper is recycled
    * @param plastic whether or not plastic is recycled
    * @param glass whether or not glass is recycled
    * @param cans whether or not cans are recycled
    * @param numLightBulbs the number of light bulbs replaced
    */
   CO2Footprint(double gasoline, double avgElectricBill, double avgElectricPrice, int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans, int numLightBulbs)
   {
       myGallonsUsed = gasoline;
       myAvgElectricBill = avgElectricBill;
       myAvgElectricPrice = avgElectricPrice;
       myNumPeople =numPeople;
       myPaper = paper;
       myPlastic = plastic;
       myGlass = glass;
       myCans = cans;
       myNumBulb = numLightBulbs;
       myEmissions = 0.0;
       myReduction = 0.0;
       myNetEmissions = 0.0;
       myElectricCO2 = 0.0;
       myPoundsCO2FromGas = 0.0;
       myBulbReduc = 0.0;
   }
   
   /**
    * Mutator method to calculate the pounds of CO2 reduced by new light bulbs (no parameters)
    */
   public void calcBulbReduc()
   {
       myBulbReduc = myNumBulb*1.37*73;
   }
   
   /**
    * Getter method to return the reduction of CO2 from bulbs (no parameters)
    */
   public double getBulbReduc()
   {
       return myBulbReduc;
   }
   
   /**
    * Mutator method to calculate the pounds of CO2 emitted from gas (no parameters).
    */
    public void calcPoundsCO2FromGas()
   {
        myPoundsCO2FromGas = myGallonsUsed*2000*(8.78E-3);
   }
    
   /**
    * Getter method to return the value to the pounds of CO2 emitted from gas (no parameters).
    * @return the pounds of CO2 from gas.
    */
   public double getPoundsCO2FromGas()
   {
       return myPoundsCO2FromGas;
   }
   
   /**
    * Mutator method to calculate the pounds of CO2 emitted from electricity (no parameters).
    */
   public void calcElectricityCO2 ()
   {
       myElectricCO2 = (myAvgElectricBill/myAvgElectricPrice)*1.37*12;
   }
   
   /**
    * Getter method to return the pounds of CO2 emitted from electricity (no parameters).
    * @return the pounds of CO2 from electricity.
    */
   public double getPoundsCO2FromElectricity()
   {
       return myElectricCO2;
   }
    
   /**
    * Mutator method to calculate the total emissions from waste, without any recycling (no parameters)
    */
   public void calcGrossWasteEmission()
   {
        myEmissions = myNumPeople*1018;
   }

   /**
    * Mutator method to calculate the emission reduction from recycling (no parameters)
    */
   public void calcWasteReduction()
   {
       if(myPaper)
       {
           myReduction += (184.0 * myNumPeople);
       }
       
       if(myPlastic)
       {
           myReduction += (25.6 * myNumPeople);
       }
       
       if(myGlass)
       {
           myReduction += (46.6 * myNumPeople);
       }
       
       if(myCans)
       {
           myReduction += (165.8 * myNumPeople);
       }
   }

   /**
    * Mutator method to calculate the net emissions (no paramters)
    */
   public void calcNetWasteReduction()
   {
        myNetEmissions = myPoundsCO2FromGas + myElectricCO2 + myEmissions - myReduction - myBulbReduc;
   }

   /**
    * Getter method to return the number of people (no paramters)
    */
   public int getNumPeople()
   {
       return myNumPeople;
   }

   /**
    * Getter method to return paper's recycled status (true or false) (no paramters)
    */
   public boolean getPaper()
   {
       return myPaper;
   }

   /**
    * Getter method to return glass's recycled status (true or false) (no paramters)
    */
   public boolean getGlass()
   {
       return myGlass;
   }

   /**
    * Getter method to return plastic's recycled status (true or false) (no paramters)
    */
   public boolean getPlastic()
   {
       return myPlastic;
   }

   /**
    * Getter method to return cans' recycled status (true or false) (no paramters)
    */
   public boolean getCans()
   {
       return myCans;
   }

   /**
    * Getter method to return the total emissions from waste (no paramters)
    */
   public double getEmissions()
   {
       return myEmissions;
   }

   /**
    * Getter method to return the reduction amount from recycling (no paramters)
    */
   public double getReduction()
   {
       return myReduction;
   }

   /**
    * Getter method to return the net emissions (no paramters)
    */
   public double getNetEmissions()
   {
       return myNetEmissions;
   }
}
