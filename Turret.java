import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turret extends Player
{
    /**
     * Act - do whatever the Turret wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int direction, speed;

    private int shotTimer;

    Player tank;
    
    public Turret(Player tank)
    {
        this.tank = tank;
    }
    
    public void act() 
    {
        setLocation(tank.getX(), tank.getY());
        if (Greenfoot.mouseMoved(null))
        {
            MouseInfo mp = Greenfoot.getMouseInfo();
            turnTowards(mp.getX(), mp.getY());
        }
        if (Greenfoot.isKeyDown("space") && (shotTimer == 0)) //When Space is pressed the tank will fire if the Shot Timer is equal to 0
        {
            getWorld().addObject(new Shell(getRotation()), getX(), getY());
            shotTimer = 200; //Currently the timer is set to roughly 5 seconds
        }
        if (shotTimer > 0) shotTimer --; //If the Shot Timer is greater than 0 it will -1 for this act cycle.
    }
}
