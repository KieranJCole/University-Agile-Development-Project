import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(1000, 1000, 1);
        
        setBackground(new GreenfootImage("background-export.png"));
        
        Player tank = new Player();
        Turret turret = new Turret(tank);
        addObject(tank, 150, 150);
        addObject(turret, 151, 145);
        
        addObject(new Target(), 0, 0);
        
        addObject(new Wall(), 500, 500);
        
        addEnemy();
    }
    
    private void addEnemy()
    {
        Random rand = new Random();
        for (int i = 0; i < 3; i++)
        {
            int randX = rand.nextInt(1000);
            int randY = rand.nextInt(1000);
            addObject(new Enemy(), randX, randY);
        }
    }
}
