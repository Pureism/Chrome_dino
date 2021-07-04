import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bird extends obstacle
{
    private int counter = 0;
    private boolean fly = true;
    private boolean bird = true;
    
    public bird(){
        setImage("bird-0.png");
    }
    
    public void act() 
    {
        if(dino.alive){
            counter++;
            if(bird){
                fly();
                move(-6 - MyWorld.difficulty);
                if(isAtEdge()){
                    getWorld().removeObject(this);
                }
            }
        }
    }
    
    private void fly(){
        if(counter >= 5){
            counter = 0;
            if(fly){
                setLocation(getX(), getY()+12);
                setImage("bird-1.png");
                fly = false;
            } else {
                setLocation(getX(), getY()-12);
                setImage("bird-0.png");
                fly = true;
            }
        }
    }
}
