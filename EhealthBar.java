import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EhealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EhealthBar extends Enemy
{
    Enemy enemy;
    
    public EhealthBar(Enemy enemy)
    {
        this.enemy = enemy;
    }
    
    public void act() 
    {
        if (enemy.getWorld() == null) return;
        
        if (enemy.getHealth() == 1)
        {
            getWorld().removeObject(this);
        }
        changeSize();
        
        setLocation(enemy.getX(), enemy.getY() - 40);
    }
    
    private void changeSize()
    {
        GreenfootImage image = getImage();
        image.scale(enemy.getHealth(), 50);
    }   
}
