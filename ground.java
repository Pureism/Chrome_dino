import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ground extends movingAssets
{   
    public void act() 
    {
        if(dino.alive){
            move(-6);
            if (getX() <= 10){
                getWorld().addObject(new ground(),900,303);
                getWorld().removeObject(this);
            }
        }
    }
    
    public void addedToWorld(World world){
        int random = Greenfoot.getRandomNumber(3);
        setImage("ground-"+random+".png");
    }
    
    // public ground (int Px, int Py){
        // x = Px;
        // y = Py;
    // }
}
