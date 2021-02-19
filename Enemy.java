import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    double a = 150;
    double b = 150;
    
    public void act() 
    {
        move (1);
        Actor tank = (Actor)getWorld().getObjects(Player.class).get(0);
        turnTowards(tank.getX(), tank.getY());
        
        if (isTouching(Wall.class))
        {
            back();
        }
    }
    
    private void back()
    {
        //Below algorithm is not original to this project
        //source: https://www.greenfoot.org/topics/8103/0
        a -= Math.cos(Math.toRadians(getRotation()))* 1;
        b -= Math.sin(Math.toRadians(getRotation())) * 1;
        setLocation((int)a, (int)b);
    }
}
