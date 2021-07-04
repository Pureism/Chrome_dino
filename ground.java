import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ground extends movingAssets
{   
    public ground(){
        setImage("ground-0.png");
    }
    
    public void act() 
    {
        if(dino.alive){
            move(-6 - MyWorld.difficulty);
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

}
