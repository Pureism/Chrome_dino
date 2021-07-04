import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ini adalah Mainmenu class.
 * @author (Muhammad Ammar Nabil) 
 */
public class MainMenu extends World
{   
    public MainMenu()
    {    
        super(900, 400, 1);
        setBackground("background.jpg");
        prepare();
    }
    
    private void prepare()
    {
        dino dino = new dino();
        addObject(dino,70,279);
        addObject(new noInternet(), 470, 220);
        dino.alive = false;
        setPaintOrder(noInternet.class, gameOver.class, dino.class, score.class, bird.class, cactus.class, 
            ground.class, cloud.class, moon.class, star.class);
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("space") || 
            Greenfoot.mousePressed(dino)) {
                dino.alive = true;
                noInternet.mainmenu = false;
                Greenfoot.setWorld(new MyWorld());
            }
    }
}
