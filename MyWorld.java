import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ini adalah world class.
 * @author (Muhammad Ammar Nabil) 
 */
public class MyWorld extends World
{
    private int counter = 0;
    private int counterDif = 0;
    private int counterGround = 0;
    private int worldSpeed = 50;
    private int random;
    static public int difficulty = 0;
    private boolean startTime = true;

    public void act(){
        counter++;
        counterDif++;
        counterGround++;
        if (startTime){
            difficulty = 0;
            if (counter >= 180){
                counter = 0;
                counterGround = 0;
                random = Greenfoot.getRandomNumber(15);
                startTime = false;
                addObject(new cactus(), 900,280);
            }
        } else if (counter >= (90+random)-(int)(1.7*(double)difficulty)){
            counter = 0;
            random = Greenfoot.getRandomNumber(15);
            if (Greenfoot.getRandomNumber(2) == 0){
                addObject(new bird(), 900,Greenfoot.getRandomNumber(190)+80);
            } else{
                addObject(new cactus(), 900,280);
            }
        }
                
        if (counterDif >= 100){
            difficulty++;
            if (difficulty > 50){
                difficulty = 50;
            }
            counterDif = 0;
        }
    }

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 400, 1); 
        prepare();
        Greenfoot.setSpeed(worldSpeed);
    }    
    
    private void prepare()
    {
        dino dino = new dino();
        moon moon = new moon();
        addObject(dino,70,279);
        addObject(moon,724,112);
        addObject(new score(), 820, 35);
        addObject(new ground(), 376, 303);
        addObject(new ground(), 800, 303);
        for (int i=0; i<5; i++){
            addObject(new star(),Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(170)+50);
        }
        for (int i=0; i<2; i++){
            addObject(new cloud(),Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(170)+50);
        }
        setPaintOrder(gameOver.class, dino.class, score.class, bird.class, cactus.class, 
                       ground.class, cloud.class, moon.class, star.class);
    }
}
