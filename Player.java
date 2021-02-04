import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public void act() 
    {
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 1, getY());
            setRotation(180);
        }
        else if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 1, getY());
            setRotation(360);
        }
        else if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 1);
            setRotation(270);
        }
        else if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 1);
            setRotation(90);
        }
    }    
}
