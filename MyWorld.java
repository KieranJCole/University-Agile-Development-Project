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
    {   //Generate World Dimension
        super(1000, 1000, 1);
        //Background Image
        setBackground(new GreenfootImage("background-export.png"));
        //Calls onjects thats visible in the world(walls and power-ups)
        setPaintOrder(Target.class, Shell.class, Player.class, Pickup.class, Enemy.class, Wall.class);
        //Turret
        Turret turret = new Turret(tank);
        addObject(tank, 150, 150);
        addObject(turret, 151, 145);
        //Player's crosshair
        addObject(new Target(), 0, 0);
        //Spawns enemies into the world
        addEnemy(3);
        addEnemy2(1);
        //Spawns walls into the world
        addWall(300,300);
        addWall(750,300);
        addWall(350,700);
        //Spawn power-ups into the World
        addFirerate();
        addHealth();
        addSpeed();
        //Spawns health bar into the World
        addObject(new healthBar(tank), 150, 150);
    }
    
    private void addEnemy(int num)
    {
        for (int i = 0; i < num; i++)
        {/*Randomly allocates a postion
            for the enemy takes to spawn into the world*/
            Enemy enemy = new Enemy();
            int randX = rand.nextInt(1000);
            int randY = rand.nextInt(1000);
            addObject(enemy, randX, randY);
            //adds healthbar on top  of the enemies
            addObject(new EhealthBar(enemy),randX - 40, randY);
            
            EnemyTurret et = new EnemyTurret(enemy);
            addObject(et, 0, 0);
        }
    }
    
    private void addEnemy2(int num)
    {
        for (int i = 0; i < num; i++)
        {/*Randomly allocates a postion
            for the 2nd enemy takes to sapwn into the world*/
            Enemy enemy = new Enemy();
            int randX = rand.nextInt(1000);
            int randY = rand.nextInt(1000);
            addObject(enemy, randX, randY);
            
            enemy.setImage("ETankSmallBody.png");
            enemy.setHealth(75);
            //adds healthbar on top  of the 2nd enemy
            addObject(new EhealthBar(enemy),randX - 40, randY);
            
            EnemyTurret et = new EnemyTurret(enemy);
            addObject(et, 0, 0);
            et.setImage("ETurret.png");
        }
    }
    
    private void addBoss(int num)
    {
        for (int i = 0; i < num; i++)
        { //Bpss random spawning
            Enemy enemy = new Enemy();
            int randX = rand.nextInt(1000);
            int randY = rand.nextInt(1000);
            addObject(enemy, randX, randY);
            //Boss Image and jealth set to 200
            enemy.setImage("BigBossBody.png");
            enemy.setHealth(200);
            //Boss Healthbar
            addObject(new EhealthBar(enemy),randX - 40, randY);
            //Boss Turret
            BossTurret bt = new BossTurret(enemy);
            addObject(bt, 0, 0);
            bt.setImage("BigBossTurret.png");
        }
    }
    // Adds a wall to the world
    private void addWall(int x, int y)
    {
        Random rand = new Random();
        int num = rand.nextInt(2);
        //define wall
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
    // Spawns one of each pickup randomly in the world
    private void addFirerate()
    {
        int randX = rand.nextInt(1000);
        int randY = rand.nextInt(1000);
        //Firerate properties
        Pickup firerate = new Pickup();
        addObject(firerate, randX, randY);
        firerate.setImage("RateUp.png");
        firerate.setType("Firerate");
    }
    
    private void addHealth()
    {
        int randX = rand.nextInt(1000);
        int randY = rand.nextInt(1000);
        //Health Properties 
        Pickup health = new Pickup();
        addObject(health, randX, randY);
        health.setImage("HealthUp.png");
        health.setType("Health");
    }
    
    private void addSpeed()
    {
        int randX = rand.nextInt(1000);
        int randY = rand.nextInt(1000);
        //Speed Properties 
        Pickup speed = new Pickup();
        addObject(speed, randX, randY);
        speed.setImage("SpeedUp.png");
        speed.setType("Speed");
    }
    
    public void winCondition()
        {//win condition is called when all enemy classes are 
         //removed, and moved onto the 2nd level. 
            if(getObjects(Enemy.class).isEmpty())
            {
                Greenfoot.setWorld(new NextLevel());
            }
        }
        
    public void act()
    {
        winCondition();
    }
}
