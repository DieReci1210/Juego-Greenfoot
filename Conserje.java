import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Conserje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conserje extends Enemigos
{
    public Conserje()
    {
        super(3);
    }
    /**
     * Act - do whatever the Conserje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        cayendo();
        moverenemigo();
    }
}
