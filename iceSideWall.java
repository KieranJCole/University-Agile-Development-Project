import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class iceSideWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class iceSideWall extends Actor
{
    public void act() 
    {
        if (isTouching(iceWall.class))
        {
            getWorld().removeObject(this);
        }
        if (isTouching(iceSideWall.class))
        {
            getWorld().removeObject(this);
        }
    }  
}
