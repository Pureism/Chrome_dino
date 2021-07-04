import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class moon extends movingAssets
{
    public moon(){
        setImage("moon.png");
    }
    
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