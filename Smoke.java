import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Smoke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Smoke extends Actor
{
    private int smokeTimer;
    
    public void act() 
    {
        Timer();
    }
    
    public void Timer()
    {
        if (++smokeTimer == 20*5) //Source: https://www.greenfoot.org/topics/61012/0
        {
            getWorld().removeObject(this);
            return;
        }
    }
}
