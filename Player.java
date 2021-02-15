import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    double a = 150;
    double b = 150;
    public void act() 
    {
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-1); 
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(1);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            if (!isTouching(Wall.class))
            {
                //Below algorithm is not original to this project
                //source: https://www.greenfoot.org/topics/8103/0
                a += Math.cos(Math.toRadians(getRotation()))* 1;
                b += Math.sin(Math.toRadians(getRotation())) * 1;
                setLocation((int)a, (int)b);
            }
        }
        if (Greenfoot.isKeyDown("s"))
        {
                //source: https://www.greenfoot.org/topics/8103/0 
                a -= Math.cos(Math.toRadians(getRotation()))* 1;
                b -= Math.sin(Math.toRadians(getRotation())) * 1;
                setLocation((int)a, (int)b);
        }
    }    
}
