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
public class Ponto
{
    private Integer x;
    private Integer y;
    
    private int []vetDistancia;

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

    public int[] getVetDistancia()
    {
        return vetDistancia;
    }

    public void setVetDistancia(int[] vetDistancia)
    {
        this.vetDistancia = vetDistancia;
    }
    
    
}
