
/**
 * Write a description of class CashRegister here.
 * 
 * @author (Wei Li) 
 * @version (13 May 2015)
 */
public class CashRegister
{
    // instance variables 
    private int cashOnHand;

    /**
     * Default Constructor for objects of class Dispenser
     */
    public CashRegister()
    {
        cashOnHand = 500;
    }
    
    /** 
     * Constructor for objects of class Dispenser
     * 
     * @param nItems number of items
     * @param c Cost
     */
    public CashRegister(int cOnHand)
    {
        if (cOnHand < 0)
        {
            throw new RuntimeException("Initial cash on hand can't be less than zero");
        }
        else 
        {
            cashOnHand = cOnHand;
        }
    }
    
    public void acceptAmount(int value)
    {
        if(value > 0)
        {
            cashOnHand += value;
        }
        else
        {
            throw new IllegalArgumentException("You can't take out money with the acceptAmount method");
        }
    }
    
    public int getCashOnHand()
    {
        return cashOnHand;
    }
}
