
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends World
{
    public Win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 400, 1);
        prepare();
    }
    
    private void prepare()
    {
      MenuReturn menu = new MenuReturn();
      addObject(menu,280,350);
      menu.setLocation(450,350);
    }
}
