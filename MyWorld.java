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
        ground ground = new ground();
        addObject(ground,433,298);
        addObject(dino,55,263);
        ground.setLocation(364,284);
    }
}
