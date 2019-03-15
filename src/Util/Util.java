/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Centroid;
import Classes.Elemento;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author picinin
 */
public class Util
{
    public static List<Centroid> getCentroides(int n, int maxX, int maxY)
    {
        Random r = new Random();
        List<Centroid> centroides = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            centroides.add(new Centroid(r.nextInt(maxX), r.nextInt(maxY)));
        }
        
        return centroides;
    }
    
    public static List<Elemento> getElemento(int n, int maxX, int maxY)
    {
        Random r = new Random();
        List<Elemento> elem = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            elem.add(new Elemento(r.nextInt(maxX), r.nextInt(maxY)));
        }
        
        return elem;
    }
}
