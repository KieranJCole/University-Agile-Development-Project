import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TestTank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestTank extends Actor
{
    /**
     * Act - do whatever the TestTank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mp = Greenfoot.getMouseInfo();
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 1, getY());
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 1, getY());
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 1);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 1);
        }
        if (Greenfoot.mouseMoved(null))
        {
            turnTowards(mp.getX(), mp.getY());
        }
    }    
}
