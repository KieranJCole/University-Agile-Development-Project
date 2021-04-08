import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    double a = 150;
    double b = 150;
    
    int health = 25;
    
    public void act() 
    {
        Actor tank = (Actor)getWorld().getObjects(Player.class).get(0);
        if (this == null || this.getWorld() == null || getWorld() == null) return;
        
        if (health > 1)
        {
            move (1);
            turnTowards(tank.getX(), tank.getY());
        }
        
        if (isTouching(Wall.class) || isTouching(SideWall.class) || isTouching(iceSideWall.class) || isTouching(iceWall.class))
        {
            move(-1);
        }
        
        if (getDistance(tank, this) <= 300)
        {
            if (health > 1)
            {
                move(-1);
            }
        }
        
        if (isTouching(Shell.class) && health - 1 >= 1)
        {
            loseHealth(1);
        }
        else if (health == 1)
        {
            getWorld().removeObject(this);
            return;
        }
        /*
        if (isTouching(Wall.class))
        {
            setLocation(getX()-1, getY());
        }
        */
    }
    
    private void back()
    {
        //Below algorithm is not original to this project
        //source: https://www.greenfoot.org/topics/8103/0
        a -= Math.cos(Math.toRadians(getRotation()))* 1;
        b -= Math.sin(Math.toRadians(getRotation())) * 1;
        setLocation((int)a, (int)b);
    }
    
    //The below method uses mathematics from the following source:
    //https://www.greenfoot.org/topics/282
    public double getDistance(Actor tank, Enemy enemy)
    {
        return Math.sqrt(Math.pow(tank.getX() - enemy.getX(), 2) + Math.pow(tank.getY() - enemy.getY(), 2));
    }
    
    public void loseHealth(int damage)
    {
        health = health - damage;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void setHealth(int value)
    {
        health = value;
    }
}
