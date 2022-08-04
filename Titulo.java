import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Titulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Titulo extends World
{

    /**
     * Constructor for objects of class Titulo.
     * 
     */
    public Titulo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 650, 1); 
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
            Greenfoot.setWorld(new Nivel1());
    }
    public void instrucciones()
    {
        if(Greenfoot.isKeyDown("space"))
            Greenfoot.setWorld(new Instrucciones());
    }
    public void musica()
    {
        Greenfoot.playSound("Apoxode_-_hamburg_ft._7OOP3D_1.mp3");
    }
}   



