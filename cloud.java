import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class cloud extends movingAssets
{
    /**
     * Act - do whatever the cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public cloud(){
        setImage("cloud.png");
    }
    
    public void act() 
    {
        if(dino.alive){
            move(-2);
            if (isAtEdge()){
                getWorld().addObject(new cloud(),900, Greenfoot.getRandomNumber(170)+50);
                getWorld().removeObject(this);
            }
        }
    }    
}
