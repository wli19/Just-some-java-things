/**
 * Write a description of class CandyMachine here.
 * 
 * @author (Wei Li) 
 * @version (13 May 2015)
 */
public class CandyMachine
{
    public static void main(String[] args)
    {
        Dispenser d = new Dispenser(100,50);
        CashRegister c = new CashRegister(75);
        sellProduct(d,c);
    }
    
    public static void sellProduct(Dispenser disp, CashRegister cash)
    {
        if(disp.getCount() != 0 && ((double)disp.getProductCost() / (double)cash.getCashOnHand()) > 0)
        {
            System.out.println("Collect your item at the bottom and enjoy.");
        }
        else
        {
            System.out.println("You do not have enough money or they are sold out of candy.");
        }
    }
}