import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Player tank = new Player();
    Random rand = new Random();
    
    public MyWorld()
    {    
        super(1000, 1000, 1);
        
        setBackground(new GreenfootImage("background-export.png"));
        
        setPaintOrder(Target.class, Shell.class, Player.class, Enemy.class, Wall.class);
        
        Turret turret = new Turret(tank);
        addObject(tank, 150, 150);
        addObject(turret, 151, 145);
        
        addObject(new Target(), 0, 0);
        
        addEnemy();
        addEnemy2();
        addBoss();
        
        addWall(300,300);
        addWall(750,300);
        addWall(800,800);
        addWall(350,700);
        addWall(500,500);
        
        addObject(new healthBar(tank), 150, 150);
    }
    
    private void addEnemy()
    {
        for (int i = 0; i < 3; i++)
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
    
    private void addEnemy2()
    {
        for (int i = 0; i < 1; i++)
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
    
    private void addBoss()
    {
        for (int i = 0; i < 1; i++)
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
        
        Wall wall = new Wall();
        SideWall wall2 = new SideWall();
        
        if (num == 0)
        {
            addObject(wall, x, y);
        }
        if (num == 1)
        {
            addObject(wall2, x, y);
        }
    }
}
