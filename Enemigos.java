import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigos extends Actor
{
    public int velvertical;
    public int gravedad =2;
    public int velocidad = 3;
    public int alturaenemigo = getImage().getHeight();
    public int anchoenemigo = getImage().getWidth();
    public int buscarparedes = anchoenemigo/2;
    public int buscarbordes = anchoenemigo/4;
    public int buscarpiso = alturaenemigo/2;
    
    public Enemigos(int velocidadE)
    {
        velocidad = velocidadE;
        
        
        
    }
    /**
     * Act - do whatever the Enemigos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
        public void cayendo()
    {
        if(enPiso() == true)
            velvertical = 0;
        else
            caer();
    
    }
    public void caer()
    {
        setLocation(getX(), getY() + velvertical);
        
        if(velvertical <= 10)
        velvertical = velvertical + gravedad;
    }
    
    public boolean enPiso()
    {
        int alturajugador = getImage().getHeight();
        int buscarpiso = alturajugador/2;
        
        Actor piso = getOneObjectAtOffset(0, buscarpiso, Piso.class);
        if(piso == null)
        {
            return false;
        }
        else
        {
            moveralpiso(piso);
            return true;
        }
    }
    public void moveralpiso(Actor piso)
    {
        int alturapiso = piso.getImage().getHeight();
        int nuevaaltura = piso.getY() - (alturapiso + getImage().getHeight())/2;
        
        setLocation(getX(), nuevaaltura);
    }
    public void moverenemigo()
    {
        Actor pared = getOneObjectAtOffset(buscarparedes, 0, Piso.class);
        Actor borde = getOneObjectAtOffset(buscarbordes, buscarpiso, Piso.class);
        
        if(pared == null && borde == null)
        {
            velocidad = velocidad * -1;
            buscarparedes = buscarparedes * -1;
            buscarbordes = buscarbordes * -1;
        }
        else if(pared !=null && borde !=null)
        {
            velocidad *= -1;
            buscarparedes *= -1;
            buscarbordes *= -1;
            
            
        }
        else
        move(velocidad);
    }
    }
