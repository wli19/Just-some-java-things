
/**
 * Sequential search methods for Music
 * 
 * @author Wei Li 
 * @version 4/10/15
 */
public class Music2
{
	// instance variables 
	private String title, singer;
	private int year;
	/**
	 * Constructor for objects of class Music
	 */
	public Music2(String t, int y, String s)
	{
		// initialise instance variables
		title = t;
		year = y;
		singer = s;
	}
	public void setTitle(String t)
	{
	    title= t;
	}
	public String getTitle()
	{
	    return title;
	}
	public void setYear(int y)
	{
	    year = y;
	}
	public int getYear()
	{
	    return year;
	}
	public void setSinger(String s)
	{
	    singer = s;
	}
	public String getSinger()
	{
	    return singer;
	}
	public String toString()
	{
	    return title + ", " + year + ", " + singer;
	}
}