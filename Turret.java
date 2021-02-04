import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turret extends Player
{
    /**
     * Act - do whatever the Turret wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /*
    Player tank;
    
    public Turret(Player tank)
    {
        tank = this.tank;
    }
    */
    
    public void act() 
    {
        //setLocation(tank.getX(), tank.getY());
        if (Greenfoot.mouseMoved(null))
        {
            MouseInfo mp = Greenfoot.getMouseInfo();
            turnTowards(mp.getX(), mp.getY());
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 1, getY());
        }
        else if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 1, getY());
        }
        else if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 1);
        }
        else if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 1);
        }
    }    
}
