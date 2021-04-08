import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pickup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pickup extends Actor
{
    String type = "Default";
    
    public void act() 
    {
        // Add your action code here.
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public String getType()
    {
        return type;
    }
}
