import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turret extends Player
{
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
        if (Greenfoot.mouseClicked(this))
        {
            shoot();
        }
    }
    
    private void shoot()
    {
        Shell shell = new Shell();
        getWorld().addObject(shell, getX(), getY());
        shell.setRotation(getRotation());
    }
}
