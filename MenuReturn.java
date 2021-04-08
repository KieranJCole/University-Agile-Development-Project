import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuReturn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuReturn extends Buttons
{
    public MenuReturn()
    {
        GreenfootImage playButton = new GreenfootImage(365,60);
        Font adjustedFont = new Font(true,false,50);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.BLACK);
        playButton.drawString("Return to Menu",0,50);
        setImage(playButton);
    }
    
    public void act() 
    {
        checkMouse();
        checkClick(new Menu());
    }    
}

