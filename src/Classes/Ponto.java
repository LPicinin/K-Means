/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author luis
 */
public abstract class Ponto
{
    protected Integer x;
    protected Integer y;
    protected Double tam = 4d;
   

    public Ponto(Integer x, Integer y)
    {
        this.x = x;
        this.y = y;
    }

    public Integer getX()
    {
        return x;
    }

    public void setX(Integer x)
    {
        this.x = x;
    }

    public Integer getY()
    {
        return y;
    }

    public void setY(Integer y)
    {
        this.y = y;
    }

    public Double getTam()
    {
        return tam;
    }

    public void setTam(Double tam)
    {
        this.tam = tam;
    }
    
}
