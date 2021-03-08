import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    
    private void prepare()
    {
        GreenfootImage logo = new GreenfootImage("TESTLOGO.png");
        Picture logoPic = new Picture(logo);
        addObject(logoPic,getWidth()/2,150);

        Play play = new Play();
        addObject(play,302,288);
        play.setLocation(329,271);
        play.setLocation(296,277);
        Exit exit = new Exit();
        addObject(exit,280,351);
        exit.setLocation(318,348);
        exit.setLocation(304,355);
        exit.setLocation(301,359);
        play.setLocation(271,289);
        play.setLocation(283,279);
        exit.setLocation(294,355);
    }
}

