import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class gameOver extends Actor
{
    public void act() 
    {
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("space")){
            dino.alive = true;
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
    public gameOver(){
        setLocation(450, 200);
        setImage("game-over.png");
    }
}
