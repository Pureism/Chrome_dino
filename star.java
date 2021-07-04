import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class star extends movingAssets
{
    public star(){
        setImage("star.png");
    }
    
    public void act() 
    {
        if(dino.alive){
            move(-1);
            if (isAtEdge()){
                getWorld().addObject(new star(),900, Greenfoot.getRandomNumber(170)+50);
                getWorld().removeObject(this);
            }
        }
    }    
}
