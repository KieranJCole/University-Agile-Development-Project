import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turret extends Player
{
<<<<<<< HEAD
=======
    /**
     * Act - do whatever the Turret wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int direction, speed;
>>>>>>> b60b42bc05f450a61f05c110c6abdbcf45c37785
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
        if (Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new Shell(getRotation()), getX(), getY());
        }
    }
}
