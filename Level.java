import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends Buttons
{
    public Level()
    {
        GreenfootImage playButton = new GreenfootImage(250,60);
        Font adjustedFont = new Font(true,false,50);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.BLACK);
        playButton.drawString("Next Level",0,50);
        setImage(playButton);
    }
    
    public void act() 
    {
        checkMouse();
        checkClick(new MyWorld2());
    }    
}

