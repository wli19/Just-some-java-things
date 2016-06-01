/**
 * This program utilizes assertions and exceptions
 * 
 * @author Wei Li   
 * @version 13 May 2015
 */
public class Dispenser
{
    // Declaration and Initialization of Variables
    private int numberOfItems, cost;
    
    /**
     * Default Constructor for objects of class Dispenser
     */
    public Dispenser()
    {
        numberOfItems = 50;
        cost = 50;
    }
    
    /** 
     * Constructor for objects of class Dispenser
     * 
     * @param nItems number of items
     * @param c Cost
     */
    public Dispenser(int nItems, int c)
    {
        if (nItems < 0 || c < 0)
        {
            throw new RuntimeException("Initial cost or number of items can't be less than zero");
        }
        else 
        {
            numberOfItems = nItems;
            cost = c;
        }
    }
    
    public int getCount()
    {
        return numberOfItems;
    }
    
    public int getProductCost()
    {
        return cost;
    }
    
    public void makeSale()
    {
        numberOfItems -= 1;
    }
    
}