import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class moon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class moon extends movingAssets
{
    /**
     * Act - do whatever the moon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(dino.alive){
            move(-1);
            if (isAtEdge()){
                getWorld().addObject(new moon(),900, 112);
                getWorld().removeObject(this);
            }
        }
    }    
}
