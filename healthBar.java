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
    private int maxValue = 0; 
    private int minValue = 0;
    private int value; //current state of health

    private int barWidth = 100; //Width of Player's Health Bar
    private int barHeight = 10; //Height of Player's Health Bar
    //^(Subject to change)

    private boolean colorChange = false; //
    private boolean changeLowHealth = true;
    private Color textColor = Color.BLACK; // shows value of how much health the player has
    private Color greenHealth = Color.GREEN; // Health color til health gets down to 40
    private Color orangeHealth = Color.ORANGE;// Health color til health gets down to 20
    private Color redHealth = Color.RED;// Health color til player is destroyed.
    //Reference: https://www.greenfoot.org/scenarios/4114
    private void newImage()
    {
        int value = (int)(barWidth * (value - minValue) / (maxValue - minValue));// values to adjust when player is hit or upgrades health
        Greenfoot heathBarImg = new GreenfootImage(barWidth,barHeight);

        if (value > 100, value >= 41)
        {
            heathBarImg.setColor(greenHealth);
        }
        else if (value <=40, value >= 21)
        {
            heathBarImg.setColor(orangeHealth);
        }
        else
        {
            healthBarImg.setColor(redHealth)
        }
    }

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

    public int getValue()
    {
        return value;
    }
}
