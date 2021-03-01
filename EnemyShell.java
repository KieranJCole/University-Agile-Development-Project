import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyShell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyShell extends Actor
{
    /**
     * Act - do whatever the Shell wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int direction, speed;
    private int shellTimer;
    
    public EnemyShell(int dir)
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
            getWorld().removeObject(this);
        }
        Timer();
    } 
    
    public void Timer()
    {
        if (++shellTimer == 60*5)
        {
            getWorld().removeObject(this);
            return;
        }
    }
}
