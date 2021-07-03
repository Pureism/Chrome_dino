import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ini adalah world class.
 * @author (Muhammad Ammar Nabil) 
 */
public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        dino dino = new dino();
        moon moon = new moon();
        addObject(dino,70,279);
        addObject(moon,724,112);
        addObject(new ground(), 376, 303);
        addObject(new ground(), 800, 303);
        addObject(new cactus(), 800, 290);
        for (int i=0; i<5; i++){
            addObject(new star(),Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(170)+50);
        }
        setPaintOrder(dino.class, bird.class, cactus.class, ground.class, 
                        moon.class, star.class);
    }
}
