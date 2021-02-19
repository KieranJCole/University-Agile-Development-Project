import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tracks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tracks extends Player
{
    private int timer;
    
    /**
     * Act - do whatever the Tracks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Timer();
    }    
    
    private void Timer()
    {
        if (++timer == 60*5)
        {
            getWorld().removeObject(this);
        }
    }
}
