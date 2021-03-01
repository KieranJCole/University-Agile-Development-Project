import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class healthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class healthBar extends Player
{
    private int maxHealth = 100;//GREEN
    private int warningHealth = 40;//ORANGE
    private int lowHealth = 20;//RED
    private int endHealth = 0; //player eliminated
    private int value = 0; // to add and subtract health from player
    
    private int barWidth = 100; //Width of Player's Health Bar
    private int barHeight = 10; //Height of Player's Health Bar
    //^(Subject to change)
    
    private boolean colorChange = false; //
    private boolean changeColo
    private Color textColor = Color.BLACK; // shows value of how much health the player has
    private Color greenHealth = Color.GREEN; // Health color til health gets down to 40
    private Color orangeHealth = Color.ORANGE;// Health color til health gets down to 20
    private Color redHealth = Color.RED;// Health color til player is destroyed.
    
    
    
    
    
    /*public Bar(String refText, String unitType, int initValue, int maxValue) 
     * referenceText = 
    */
    public void hit(int amount)
    {
        value -= amount;
        checkValue();
    }
    
    public void addHealth(int amount)
    {
        value += amount;
        checkValue();
    }
    
    private void checkValue()
    {
       if (value < endHealth) value = endHealth;
       if (value > maxHealth) value = maxHealth;
    }
    
}
