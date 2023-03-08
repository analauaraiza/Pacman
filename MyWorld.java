import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        addObject(new Wall(),265,79);
        addObject(new Wall(),265,108);
        addObject(new Wall(),265,137);
        addObject(new Wall(),265,166);
        Apple apple = new Apple();
        addObject(apple,406,78);
        BigItem bigItem = new BigItem();
        addObject(bigItem,110,101);
        Cherry cherry = new Cherry();
        addObject(cherry,522,163);
        SmallItem smallItem = new SmallItem();
        addObject(smallItem,114,247);
        Strowberry strowberry = new Strowberry();
        addObject(strowberry,416,320);

        addObject(new Pacman(), 50,50);
        bigItem.setLocation(113,141);
        smallItem.setLocation(135,274);
        Bannana bannana = new Bannana();
        addObject(bannana,276,328);

        Wall wall5 = new Wall();
        addObject(wall5,294,166);

        Wall wall6 = new Wall();
        addObject(wall6,323,166);

        Wall wall7 = new Wall();
        addObject(wall7,541,292);

        Wall wall8 = new Wall();
        addObject(wall8,541,322);

        Wall wall9 = new Wall();
        addObject(wall9,541,352);

        Wall wall10 = new Wall();
        addObject(wall10,37,279);
        
         Wall wall11 = new Wall();
        addObject(wall11,37,309);
        
        Wall wall12 = new Wall();
        addObject(wall12,37,339);
    }
}
