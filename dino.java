import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * It's Dino class
 * 
 * @Muhammad Ammar Nabil 
 * @version beta
 */
public class dino extends Actor
{
    private int counter = 0;
    private boolean walk = true;
    private boolean pressjump = false;
    private boolean onground = true;
    private boolean alive = true;

    public void act() 
    {
        if(alive){
            
        }else {
            // getWorld().addObject(new Reset(), 0, 0);
        }
        
        walk();
    }    
        
    private void walk(){
        counter++;
        if(counter>=5) {
            counter = 0;
            if(walk) {
                setImage("dino-0.png");
                walk = false;
            }else {
                setImage("dino-1.png");
                walk = true;
            }
        }
    }
    
    public static boolean jumpPressed() {
        if (Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("up") && !Greenfoot.isKeyDown("down")){
            return true;
        }
        return false;
    }
}

