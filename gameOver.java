import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOver extends Actor
{
    /**
     * Act - do whatever the gameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
