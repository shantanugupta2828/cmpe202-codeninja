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
        Birdi player = new Birdi();
        Birdi butterfly = new Birdi();
        player2 pla = new player2();
        addObject(butterfly, 100 , getHeight()/2);
        addObject(pla , 200, getHeight()/2);
    }
}
