import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossTurret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossTurret extends Enemy
{
    private Enemy enemy;
    private Player tank;
    
    private int shotTimer;
    
    public BossTurret(Enemy enemy)
    {
        this.enemy = enemy;
    }
    
    public void act() 
    {
        setLocation(enemy.getX(), enemy.getY());
        
        setRotation(enemy.getRotation());
 
        if (shotTimer == 0)
        {
            if (enemy.getHealth() > 1)
            {
                getWorld().addObject(new BossShell(getRotation()), getX(), getY());
                shotTimer = 200;
            }
        }
        if (shotTimer > 0)
        {
            shotTimer --;
        }

        if (enemy.getHealth() == 1)
        {
            this.setImage("SmallEnemyTurretDamaged.png");
        }
    }   
}
