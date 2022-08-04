import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2 extends World
{

    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public Nivel2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 650, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Piso piso = new Piso();
        addObject(piso,26,626);
        Piso piso2 = new Piso();
        addObject(piso2,76,626);
        Piso piso3 = new Piso();
        addObject(piso3,126,626);
        piso.setLocation(26,626);
        piso2.setLocation(76,626);
        piso3.setLocation(126,626);
        Piso piso4 = new Piso();
        addObject(piso4,176,626);
        Piso piso5 = new Piso();
        addObject(piso5,223,596);
        piso5.setLocation(226,626);
        Piso piso6 = new Piso();
        addObject(piso6,276,626);
        Piso piso7 = new Piso();
        addObject(piso7,326,626);
        Piso piso8 = new Piso();
        addObject(piso8,376,626);
        Piso piso9 = new Piso();
        addObject(piso9,419,594);
        piso9.setLocation(426,626);
        Piso piso10 = new Piso();
        addObject(piso10,476,626);
        Piso piso11 = new Piso();
        addObject(piso11,526,626);
        Piso piso12 = new Piso();
        addObject(piso12,576,626);
        Piso piso13 = new Piso();
        addObject(piso13,626,626);
        Piso piso14 = new Piso();
        addObject(piso14,669,595);
        piso14.setLocation(676,626);
        Piso piso15 = new Piso();
        addObject(piso15,683,626);
        piso14.setLocation(671,576);
        piso14.setLocation(671,573);
        piso14.setLocation(671,573);
        piso14.setLocation(671,573);
        piso14.setLocation(671,575);
        piso14.setLocation(671,576);
        piso14.setLocation(676,626);
        Piso piso16 = new Piso();
        addObject(piso16,390,574);
        piso16.setLocation(391,578);
        piso16.setLocation(392,576);
        piso16.getY();
        piso16.getX();
        Piso piso17 = new Piso();
        addObject(piso17,342,575);
        piso17.setLocation(342,586);
        Piso piso18 = new Piso();
        addObject(piso18,441,586);
        Piso piso19 = new Piso();
        addObject(piso19,391,526);
        Piso piso20 = new Piso();
        addObject(piso20,490,586);
        Piso piso21 = new Piso();
        addObject(piso21,540,586);
        Piso piso22 = new Piso();
        addObject(piso22,589,586);
        Piso piso23 = new Piso();
        addObject(piso23,638,586);
        Piso piso24 = new Piso();
        addObject(piso24,684,586);
        Piso piso25 = new Piso();
        addObject(piso25,674,526);
        piso25.setLocation(681,543);
        piso25.setLocation(677,521);
        piso25.setLocation(676,526);
        Conserje conserje = new Conserje();
        addObject(conserje,564,510);
        Jugador jugador = new Jugador();
        addObject(jugador,27,564);
        Conserje conserje2 = new Conserje();
        addObject(conserje2,261,552);
        Piso piso26 = new Piso();
        addObject(piso26,576,410);
        Piso piso27 = new Piso();
        addObject(piso27,526,420);
        piso27.setLocation(516,410);
        piso27.setLocation(516,410);
        Piso piso28 = new Piso();
        addObject(piso28,475,415);
        piso28.setLocation(463,410);
        piso27.setLocation(527,410);
        piso28.setLocation(477,410);
        Piso piso29 = new Piso();
        addObject(piso29,427,410);
        Piso piso30 = new Piso();
        addObject(piso30,377,412);
        piso30.setLocation(377,410);
        Piso piso31 = new Piso();
        addObject(piso31,326,420);
        piso31.setLocation(327,431);
        piso31.setLocation(316,436);
        piso31.setLocation(327,410);
        Piso piso32 = new Piso();
        addObject(piso32,277,410);
        Piso piso33 = new Piso();
        addObject(piso33,227,410);
        Piso piso34 = new Piso();
        addObject(piso34,182,419);
        piso34.setLocation(177,410);
        Piso piso35 = new Piso();
        addObject(piso35,131,419);
        piso35.setLocation(127,410);
        Piso piso36 = new Piso();
        addObject(piso36,77,415);
        piso36.setLocation(77,410);
        Piso piso37 = new Piso();
        addObject(piso37,34,410);
        Piso piso38 = new Piso();
        addObject(piso38,22,410);
        Piso piso39 = new Piso();
        addObject(piso39,675,558);
        removeObject(piso34);
        removeObject(piso33);
        addObject(piso33,202,427);
        Conserje conserje3 = new Conserje();
        addObject(conserje3,206,379);
        Piso piso40 = new Piso();
        addObject(piso40,24,361);
        Piso piso41 = new Piso();
        addObject(piso41,105,254);
        Piso piso42 = new Piso();
        addObject(piso42,205,254);
        Piso piso43 = new Piso();
        addObject(piso43,305,254);
        Piso piso44 = new Piso();
        addObject(piso44,405,254);
        Piso piso45 = new Piso();
        addObject(piso45,505,254);
        Piso piso46 = new Piso();
        addObject(piso46,555,254);
        Piso piso47 = new Piso();
        addObject(piso47,616,251);
        piso47.setLocation(617,254);
        piso47.setLocation(615,254);
        Piso piso48 = new Piso();
        addObject(piso48,666,253);
        piso48.setLocation(665,254);
        Piso piso49 = new Piso();
        addObject(piso49,715,254);
        jugador.setLocation(103,179);
        removeObject(piso42);
        piso43.setLocation(277,252);
        piso43.setLocation(269,254);
        piso43.setLocation(263,254);
        Piso piso50 = new Piso();
        addObject(piso50,632,254);
        piso47.setLocation(595,254);
        jugador.setLocation(55,509);
        Conserje conserje4 = new Conserje();
        addObject(conserje4,456,354);
        Piso piso51 = new Piso();
        addObject(piso51,506,206);
        Piso piso52 = new Piso();
        addObject(piso52,675,205);
        removeObject(piso52);
        removeObject(piso51);
        addObject(piso51,677,203);
        piso51.setLocation(683,207);
        piso51.setLocation(683,207);
        Meta meta = new Meta();
        addObject(meta,682,146);
        Terminar_juego terminar_juego = new Terminar_juego();
        addObject(terminar_juego,583,89);
        removeObject(meta);
        terminar_juego.setLocation(677,144);
        Conserje conserje5 = new Conserje();
        addObject(conserje5,518,188);
        Conserje conserje6 = new Conserje();
        addObject(conserje6,604,197);
        jugador.setLocation(288,319);
    }
}
