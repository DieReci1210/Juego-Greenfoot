import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{
    
    public int velvertical;
    public int gravedad = 2;
    public boolean saltando;
    public int alturasalto = 20;
    public int velocidad = 5;
    
    public int frame = 1;
    

    /**
     * Act - do whatever the Jugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        cayendo();
        moverse();
        tocarTecho();
        enParedDerecha();
        enParedIzquierda();
        tocarenemigo();
        tocarmeta();
        terminarjuego();
    }
    
    public void moverse()
    {
    if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + velocidad, getY());
        }
    if(Greenfoot.isKeyDown("a")) 
        {
            setLocation(getX() - velocidad, getY());
            turn(180);
            getImage().mirrorVertically();
        }
    if(Greenfoot.isKeyDown("space") && saltando == false)
        {
            saltar();
        }
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
        
        saltando = true;
    }
    
    public boolean enPiso()
    {
        int alturajugador = getImage().getHeight();
        int buscarpiso = alturajugador/2;
        
        Actor piso = getOneObjectAtOffset(0, buscarpiso, Piso.class);
        if(piso == null)
        {
            saltando = true;
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
        saltando = false;
    }
    
    public boolean tocarTecho()
    {
        int alturajugador = getImage().getHeight();
        int buscartecho = alturajugador/2;
        
        Actor techo = getOneObjectAtOffset(0, -buscartecho, Piso.class);
        if(techo != null)
        {
            tocarcabeza(techo);
            return true;
        }
        else
        {
            return false;
        }
    }
    public void tocarcabeza(Actor techo)
    {
        int alturatecho = techo.getImage().getHeight();
        int nuevaaltura = techo.getY() + (alturatecho + getImage().getHeight())/2;
        
        setLocation(getX(), nuevaaltura);
        saltando = false;
        velvertical = 2;
    }
    public boolean enParedDerecha()
    {
        int anchojugador = getImage().getWidth();
        int buscarparedderecha = anchojugador/2;
        
        Actor paredD = getOneObjectAtOffset(buscarparedderecha, 0, Piso.class);
        if(paredD == null)
        {
            return false;
        }
        else
        {
            pararD(paredD);
            return true;
        }
    }
    public void pararD(Actor paredD)
    {
        int anchopared = paredD.getImage().getWidth();
        int nuevoancho = paredD.getX() - (anchopared + getImage().getWidth())/2;
        
        setLocation(nuevoancho, getY());
    }
    
    public boolean enParedIzquierda()
    {
        int anchojugador = getImage().getWidth();
        int buscarparedizquierda = anchojugador/2;
        
        Actor paredI = getOneObjectAtOffset(-buscarparedizquierda, 0, Piso.class);
        if(paredI == null)
        {
            return false;
        }
        else
        {
            pararI(paredI);
            return true;
        }
    }
    public void pararI(Actor paredI)
    {
        int anchopared = paredI.getImage().getWidth();
        int nuevoancho = paredI.getX() + (anchopared + getImage().getWidth())/2;
        
        setLocation(nuevoancho, getY());
    }
    public void saltar()
    {
        velvertical = velvertical -alturasalto;
        saltando = true;
        Greenfoot.playSound("salto.wav");
        
        caer();
    }
    public void tocarenemigo()
    {
        if (isTouching(Enemigos.class))
        {
            Greenfoot.setWorld(new Perder());
            Greenfoot.playSound("perdiste.wav");
        }
    }
    public void tocarmeta()
    {
        if (isTouching(Meta.class))
        {
            Greenfoot.setWorld(new Nivel2());
        }
    }
    public void terminarjuego()
    {
        if (isTouching(Terminar_juego.class))
        {
            Greenfoot.setWorld(new final_juego());   
        }
    }
}

    
