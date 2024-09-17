import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


class Circulo extends Actor
{
    private int direccion;

    public Circulo(int direccion)
    {
        this.direccion = direccion;
        setRotation(direccion);
    }

    public void act() 
    {
        projectileMove();
        removeFromWorld();
    }

    private void projectileMove()
    {
        move(10);
    }
    
    private void removeFromWorld()
    {
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}