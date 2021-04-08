import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 400, 1);
        
        MenuReturn restart = new MenuReturn();
        addObject(restart,302,288);
        restart.setLocation(450,300);
        restart.setImage("Restart.png");
    }
}
