
/**
 * Write a description of class Hero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hero
{
    // instance variables - replace the example below with your own
    private String name;
    private String superpower;
    private String color;

    /**
     * Constructor for objects of class Hero
     */
    public Hero(String theName, String theSuperpower, String theColor)
    {
        // initialise instance variables
        name = theName;
        superpower = theSuperpower;
        color = theColor;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }
    
    public String getSuperpower()
    {
        return superpower;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setName(String theName)
    {
        name = theName;
    }
    
    public void setSuperpower(String theSuperpower)
    {
        superpower = theSuperpower;
    }
    
    public void setColor(String theColor)
    {
        color = theColor;
    }
}
