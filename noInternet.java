import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class noInternet extends Actor
{
    static public boolean mainmenu = true;
    
    public noInternet(){
        setImage("no-internet.png");
    }
    
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
