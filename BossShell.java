import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossShell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossShell extends Actor
{
    private int direction, speed;
    private int shellTimer;
    
    public BossShell(int dir)
    {
        direction = dir;
        speed = 4;
    }
    
    public void act() 
    {// determines the speed of the how fast the shells travel 
        setRotation(direction);
        move(speed);
        
        if (isTouching(Wall.class) || isTouching(SideWall.class) || isTouching(iceSideWall.class) || isTouching(iceWall.class))
        {//when shell hits wall smoke image pops up to show shell has hit a wall 
            getWorld().addObject(new Smoke(), this.getX(), this.getY());
            Greenfoot.playSound("Boss_Impact.mp3");
            getWorld().removeObject(this);
        }
        
        Timer();
    } 
    
    public void Timer()
    {
        if (++shellTimer == 60*5) //Source: https://www.greenfoot.org/topics/61012/0
        {
            getWorld().removeObject(this);
            return;
        }
    }  
}
