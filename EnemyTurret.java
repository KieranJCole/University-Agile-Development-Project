
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyTurret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyTurret extends Enemy
{
    private Enemy enemy;
    private Player tank;
    
    private int shotTimer;
    
    public EnemyTurret(Enemy enemy)
    {
        this.enemy = enemy;
    }
    
    public void act() 
    {
        if (enemy.getWorld() == null) return;
        
        setLocation(enemy.getX(), enemy.getY());
        
        setRotation(enemy.getRotation());
 
        if (shotTimer == 0)
        {
            if (enemy.getHealth() > 1)
            {
                getWorld().addObject(new EnemyShell(getRotation()), getX(), getY());
                Greenfoot.playSound("Cannon_Shot.wav");
                shotTimer = 200;
            }
        }
        if (shotTimer > 0)
        {
            shotTimer --;
        }

        if (enemy.getHealth() == 1)
        {
            getWorld().removeObject(this);
        }
    }    
}
