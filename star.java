import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class star extends movingAssets
{
    /**
     * Act - do whatever the star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-1);
        if (isAtEdge()){
            getWorld().addObject(new star(),900, Greenfoot.getRandomNumber(170)+50);
            getWorld().removeObject(this);
        }
    }    
}
