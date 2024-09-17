import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cohetico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cohetico extends Actor
{
    private boolean canFire = true;

    public void act() 
    { 
        handleMovement();
        DisparaProyectil();
    }

    private void handleMovement()
    {
        // Control de rotación
        if (Greenfoot.isKeyDown("d")) {
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("a")) {
            setRotation(180); 
        }
        if (Greenfoot.isKeyDown("s")) {
            setRotation(90);
        }
        if (Greenfoot.isKeyDown("w")) {
            setRotation(270);
        }
        
        
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("d")) {
            move(5); 
        }
    }

    public void DisparaProyectil()
    {
        if (Greenfoot.isKeyDown("space") && canFire) {
            
            getWorld().addObject(new Circulo(getRotation()), getX(), getY());
            canFire = false;
        } else if (!Greenfoot.isKeyDown("space")) {
            canFire = true;   
        }
    }
}