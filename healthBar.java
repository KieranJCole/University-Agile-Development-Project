import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class healthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class healthBar extends Player
{
    Player tank;
    
    public healthBar(Player tank)
    {
        this.tank = tank;
    }
    
    public void act() 
    {
        changeSize();
    }
    
    private void changeSize()
    {
        GreenfootImage image = getImage();
        image.scale(tank.getHealth(), 50);
    }
}
