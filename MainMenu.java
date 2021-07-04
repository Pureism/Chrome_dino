import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ini adalah world class.
 * @author (Muhammad Ammar Nabil) 
 */
public class MainMenu extends World
{   
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
        dino dino = new dino();
        addObject(dino,70,279);
        addObject(new noInternet(), 470, 220);
        // addObject(new ground(), -100, 303);
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
