import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class noInternet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class noInternet extends Actor
{
    static public boolean mainmenu = true;
    
    public void act() 
    {
        if(mainmenu){
            setImage("no-internet.png");
            if(Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("up")){
                getWorld().removeObject(this);
            }
        }
    }    
}
