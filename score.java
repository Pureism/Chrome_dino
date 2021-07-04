import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class score extends Actor
{
    public int score = 0;
    static public int showScore = 0;
    private int lastScore;
    static public int highScore = 0;
    
    public void act() 
    {
        if (dino.alive){
            score++;
            showScore = score;
            if (showScore < 0){
                showScore = 0;
                setImage(new GreenfootImage("HI "+ highScore +"        "+ 
                            showScore, 24, Color.GRAY, Color.DARK_GRAY));   
            }
            showScore = showScore / 5;
            if(lastScore != showScore){
                print(showScore + "");
                setImage(new GreenfootImage("HI "+ highScore +"        "+ 
                            showScore, 24, Color.GRAY, Color.DARK_GRAY));   
            }
            lastScore = showScore;
        }
        
    }    
    
    public void print (String txt){
        clear();
        getImage().drawImage(new GreenfootImage(txt, 20, Color.WHITE,
                                new Color(1,1,1,1)), 10,10);
    }
    
    public void clear(){
        getImage().clear();
        setImage("Score.png");
    }   
    
    protected void addedToWorld(World world){
        setLocation(820, 35);
        setImage("Score.png");
        setImage(new GreenfootImage("HI  "+ highScore +"        "+ 
                            showScore, 24, Color.GRAY, Color.DARK_GRAY));   
        if (showScore > highScore){
            highScore = showScore;
        }
        showScore = 0;
    }
}
