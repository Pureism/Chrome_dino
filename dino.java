
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
    private int counterMin = 0;
    private int counterJump = 0;
    private int jumpSpeed;
    private boolean walk = true;
    private boolean down;
    private boolean jumpPress = false;
    private boolean onGround = true;
    private boolean pressed;
    
    static public boolean alive = true;
    
    public dino()
    {
        setImage("dino-jump.png");
        setLocation(70,279);
        setRotation(-90);
    }
    
    public void act() 
    {
        if(alive){
            if(onGround){
                counter++;
                counterJump = 0;
                counterMin = 0;
                if(counter>=5) {
                    setLocation(70, 279);
                    counter = 0;
                    running();
                }
                
                if (Greenfoot.isKeyDown("down")){
                    down = true;
                    crouch();
                }else {
                    down = false;
                    if (jumpState() && !jumpPress) {
                        setImage("dino-jump.png");
                        setLocation(70, 274);
                        move(5);
                        jumpSpeed = 10;
                        onGround = false;
                        jumpPress = true;
                    } else {
                        if(!jumpState()){
                            jumpPress = false;
                        } else {
                            running();
                        }
                    }
                }
                
            } else {
                counterMin++;
                if((jumpPress && jumpState() && counterJump<=12) || 
                    counterMin < 8){
                        counterJump++;
                        move(10);
                } else {
                    counterJump = 20;
                    jumpSpeed--;
                    move(jumpSpeed);
                    if(getY() >= 274){
                        setLocation(70, 279);
                        onGround = true;
                    }
                }
            }
            
            if (isTouching(obstacle.class)){
                alive = false;
            }
            
        }else{
            getWorld().addObject(new gameOver(),450, 200);
        }

    }    
        
    private void running(){
        if(walk) {
            setImage("dino-0.png");
            walk = false;
        }else {
            setImage("dino-1.png");
            walk = true;
        }
    }
    
    private void crouch(){
        setLocation(86,296);
        if(walk) {
            setImage("dino-crouch-0.png");
        }else {
            setImage("dino-crouch-1.png");
        }
    }
    
    
    private boolean jumpState() {
        if (Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("up")){
            return true;
        }
        if(pressed){return true;}
        return false;
    }
}

