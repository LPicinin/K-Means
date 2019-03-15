/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis
 */
public class Centroid extends Ponto
{
    private List<Elemento> cluster;

    public Centroid(Integer x, Integer y)
    {
        super(x, y);
        cluster = new ArrayList<>();
    }
    public int[] calculaNovaCoordenada()
    {
        int s = cluster.size();
        int sx = 0;
        int sy = 0;
        for (int i = 0; i < s; i++)
        {
            sx += cluster.get(i).getX();
            sy += cluster.get(i).getY();
        }
        int []p = {sx/s, sy/s};
        return p;
    }

    public List<Elemento> getCluster()
    {
        return cluster;
    }

    public void setCluster(List<Elemento> cluster)
    {
        this.cluster = cluster;
    }
    
}
