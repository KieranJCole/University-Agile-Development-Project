import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SideWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SideWall extends Actor
{
    /**
     * Act - do whatever the SideWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
