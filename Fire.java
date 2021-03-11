import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Player
{
    private Turret turret;
    private int fireTimer;
    
    public Fire(Turret turret)
    {
        this.turret = turret;
    }
    
    public void act() 
    {
        this.setRotation(turret.getRotation());
        setLocation(turret.getX(),turret.getY());
        
        Timer();
    }    
    
    public void Timer()
    {
        if (++fireTimer == 10*5) //Source: https://www.greenfoot.org/topics/61012/0
        {
            getWorld().removeObject(this);
            return;
        }
    }
}
