import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        super(600, 400, 1);
        
        setBackground(new GreenfootImage("background-export.png"));
        
        Player tank = new Player();
        Turret turret = new Turret(tank);
        addObject(tank, 150, 150);
        addObject(turret, 151, 145);
        
        addObject(new Target(), 0, 0);
    }
}
