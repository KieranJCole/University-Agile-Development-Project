import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{
    Player tank = new Player();
    Random rand = new Random();
    
    public MyWorld2()
    {    
        super(1000, 1000, 1);
        
        setBackground(new GreenfootImage("Level2.png"));
        
        setPaintOrder(Target.class, Shell.class, Player.class, Enemy.class, Wall.class);
        
        Turret turret = new Turret(tank);
        addObject(tank, 150, 150);
        addObject(turret, 151, 145);
        
        addObject(new Target(), 0, 0);
        
        addEnemy(2);
        addEnemy2(2);
        addBoss(1);
        
        addWall(300,300);
        addWall(750,300);
        addWall(350,700);
        
        addFirerate();
        addHealth();
        addSpeed();
        
        addObject(new healthBar(tank), 150, 150);
    }
    
    private void addEnemy(int num)
    {
        for (int i = 0; i < num; i++)
        {
            Enemy enemy = new Enemy();
            int randX = rand.nextInt(1000);
            int randY = rand.nextInt(1000);
            addObject(enemy, randX, randY);
            
            addObject(new EhealthBar(enemy),randX - 40, randY);
            
            EnemyTurret et = new EnemyTurret(enemy);
            addObject(et, 0, 0);
        }
    }
    
    private void addEnemy2(int num)
    {
        for (int i = 0; i < num; i++)
        {
            Enemy enemy = new Enemy();
            int randX = rand.nextInt(1000);
            int randY = rand.nextInt(1000);
            addObject(enemy, randX, randY);
            
            enemy.setImage("Enemy2.png");
            enemy.setHealth(75);
            
            addObject(new EhealthBar(enemy),randX - 40, randY);
        }
    }
    
    private void addBoss(int num)
    {
        for (int i = 0; i < num; i++)
        {
            Enemy enemy = new Enemy();
            int randX = rand.nextInt(1000);
            int randY = rand.nextInt(1000);
            addObject(enemy, randX, randY);
            
            enemy.setImage("BigBossBody.png");
            enemy.setHealth(200);
            
            addObject(new EhealthBar(enemy),randX - 40, randY);
            
            BossTurret bt = new BossTurret(enemy);
            addObject(bt, 0, 0);
            bt.setImage("BigBossTurret.png");
        }
    }
    
    private void addWall(int x, int y)
    {
        Random rand = new Random();
        int num = rand.nextInt(2);
        
        iceWall wall = new iceWall();
        iceSideWall wall2 = new iceSideWall();
        
        if (num == 0)
        {
            addObject(wall, x, y);
        }
        if (num == 1)
        {
            addObject(wall2, x, y);
        }
    }
    
    // Spawns one of each pickup randomly in the world
    private void addFirerate()
    {
        int randX = rand.nextInt(1000);
        int randY = rand.nextInt(1000);
        
        Pickup firerate = new Pickup();
        addObject(firerate, randX, randY);
        firerate.setImage("RateUp.png");
        firerate.setType("Firerate");
    }
    
    private void addHealth()
    {
        int randX = rand.nextInt(1000);
        int randY = rand.nextInt(1000);
        
        Pickup health = new Pickup();
        addObject(health, randX, randY);
        health.setImage("HealthUp.png");
        health.setType("Health");
    }
    
    private void addSpeed()
    {
        int randX = rand.nextInt(1000);
        int randY = rand.nextInt(1000);
        
        Pickup speed = new Pickup();
        addObject(speed, randX, randY);
        speed.setImage("SpeedUp.png");
        speed.setType("Speed");
    }
    
    public void winCondition()
        {
            if(getObjects(Enemy.class).isEmpty())
            {
                Greenfoot.setWorld(new Win());
            }
        }
        
    public void act()
    {
        winCondition();
    }
}
