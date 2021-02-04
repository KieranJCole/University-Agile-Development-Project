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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        setBackground(new GreenfootImage("background.png"));
        
        //Player tank = new Player();
        //Turret turret = new Turret(tank);
        //addObject(tank, 150, 150);
        //addObject(turret, 151, 145);
        
        addObject(new Player(), 150, 150);
        addObject(new Turret(), 151, 145);
        
        addObject(new Target(), 0, 0);
        
        //addObject(new TestTank(), 500, 200);
    }
}
