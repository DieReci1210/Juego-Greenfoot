import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class final_juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class final_juego extends World
{

    /**
     * Constructor for objects of class final_juego.
     * 
     */
    public final_juego()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 650, 1); 
    }
        public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld(new Nivel1());
    }
}
