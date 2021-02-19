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
        
        setPaintOrder(Target.class, Shell.class, Wall.class, Enemy.class, Player.class);
        
        Player tank = new Player();
        Turret turret = new Turret(tank);
        addObject(tank, 150, 150);
        addObject(turret, 151, 145);
        
        addObject(new Target(), 0, 0);
        
        addEnemy();
        
        addWall(300, 800);
        addWall(400, 400);
        addWall(900, 150);
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
    
    private void addWall(int X, int Y)
    {
        Random rand = new Random();
        
        Wall wall = new Wall();
        
        addObject(wall, X,Y);
        
        wall.setRotation(rand.nextInt(360));
    }
}
