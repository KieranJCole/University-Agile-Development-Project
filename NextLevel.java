
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevel extends World
{
    public NextLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 400, 1);
        prepare();
    }
    
    private void prepare()
    {
      Level level = new Level();
      addObject(level,280,350);
      level.setLocation(450,250);
      
      MenuReturn menu = new MenuReturn();
      addObject(menu,280,350);
      menu.setLocation(450,350);
    }
}
