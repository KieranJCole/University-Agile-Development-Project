import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    public void act() 
    {
        if (isTouching(Wall.class))
        {
            getWorld().removeObject(this);
        }
        if (isTouching(SideWall.class))
        {
            getWorld().removeObject(this);
        }
    }
}
