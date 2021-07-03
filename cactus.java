import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cactus extends obstacle
{
    private int counter = 0;
    private boolean cactus = true;
    
    public void act() 
    {
        if(dino.alive){
            counter++;
            if(cactus){
                randomization();
                cactus = false;
            }
            move(-6);
            if(isAtEdge()){
                cactus = true;
                getWorld().removeObject(this);
            }
        }
        

    }    
    
    private void randomization(){
        if (Greenfoot.getRandomNumber(6) == 0){
            setImage("cactus-big-3.png");
        } else if (Greenfoot.getRandomNumber(5) == 0){
            setImage("cactus-big-2.png");
        }  else if (Greenfoot.getRandomNumber(4) == 0){
            setImage("cactus-big-1.png");
        }  else if (Greenfoot.getRandomNumber(3) == 0){
            setImage("cactus-small-3.png");
        }  else if (Greenfoot.getRandomNumber(2) == 0){
            setImage("cactus-small-2.png");
        }  else {
            setImage("cactus-small-1.png");
        }
    }
}
