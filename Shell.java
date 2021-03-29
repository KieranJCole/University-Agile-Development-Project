import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Shell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shell extends Actor
{
    private int direction, speed;
    private int shellTimer;
    
    public Shell(int dir)
    {
        direction = dir;
        speed = 4;
    }
    
    public void act() 
    {
        setRotation(direction);
        move(speed);
        if (isTouching(Wall.class) || isTouching(SideWall.class))
        {
            getWorld().addObject(new Smoke(), this.getX(), this.getY());
            getWorld().removeObject(this);
        }
        Timer();
    }
    
    public void Timer()
    {
        if (++shellTimer == 60*5) //Source: https://www.greenfoot.org/topics/61012/0
        {
            getWorld().addObject(new Smoke(), this.getX(), this.getY());
            getWorld().removeObject(this);
            return;
        }
    }
}
