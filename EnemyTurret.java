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
    
    public EnemyTurret(Enemy enemy)
    {
        this.enemy = enemy;
    }
    
    public void act() 
    {
        setLocation(enemy.getX(), enemy.getY());
    }    
}
