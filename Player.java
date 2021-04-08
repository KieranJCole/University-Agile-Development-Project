import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    double a = 150;
    double b = 150;
    
    boolean pickedUp = false; //Used to make sure the player doesnt gain life in-definately
    
    int health = 100; //Starting health
    
    ArrayList<String> items = new ArrayList<String>(); //List to store the items the player has collected
    
    public void act() 
    {
        // Movement controls
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-1); 
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(1);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            forward();
            if (isTouching(Wall.class) || isTouching(SideWall.class)|| isTouching(iceSideWall.class) || isTouching(iceWall.class))
            {
                back();
            }
        }
        if (Greenfoot.isKeyDown("s"))
        {
            back();
            if (isTouching(Wall.class) || isTouching(SideWall.class) || isTouching(iceSideWall.class) || isTouching(iceWall.class))
            {
                forward();
            }
        }
        // If the player gets shot, they lose life
        if (isTouching(EnemyShell.class) && health - 1 >= 1)
        {
            loseHealth(1);
        }
        // If the player is shot by the boss, they lose more life
        if (isTouching(BossShell.class) && health - 1 >= 1)
        {
            loseHealth(2);
        }
        // If the player touches a pick-up it is added to the item list
        if (isTouching(Pickup.class))
        {
            Pickup pick = (Pickup) getOneIntersectingObject(Pickup.class);
            addItem(pick.getType());
            if (pick.getType() == "Health"){loseHealth(-50);}
            getWorld().removeObject(pick);
        }
    }
    
    private void forward()
    {
        double speed = 1.15;
        if (searchItems("Speed")){speed = 2;}
        //Below algorithm is not original to this project
        //source: https://www.greenfoot.org/topics/8103/0
        a += Math.cos(Math.toRadians(getRotation()))* speed;
        b += Math.sin(Math.toRadians(getRotation())) * speed;
        setLocation((int)a, (int)b);
    }
    
    private void back()
    {
        double speed = 1.15;
        if (searchItems("Speed")){speed = 2;}
        //Below algorithm is not original to this project
        //source: https://www.greenfoot.org/topics/8103/0
        a -= Math.cos(Math.toRadians(getRotation()))* speed;
        b -= Math.sin(Math.toRadians(getRotation())) * speed;
        setLocation((int)a, (int)b);
    }
    
    public void loseHealth(int damage)
    {
        //If health is gone, then it will display the gameover screen
        if (health - damage > 1)
        {
            health = health - damage;
        }
        else
        {
            Greenfoot.setWorld(new GameOver());
        }
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public boolean searchItems(String item)
    {
        for (int i = 0; i < items.size(); i++)
        {
            if (items.get(i) == item)
            {
                return true;
            }
        }
        return false;
    }
    
    public void addItem(String item)
    {
        if (!searchItems(item))
        {
            items.add(item);
        }
    }
}
