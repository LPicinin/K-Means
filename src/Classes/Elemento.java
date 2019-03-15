/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author luis
 */
public class Elemento extends Ponto
{
     private List<Double> listaDistancia;

    public Elemento(Integer x, Integer y)
    {
        super(x, y);
        listaDistancia = new ArrayList<>();
    }

    public List<Double> getListaDistancia()
    {
        return listaDistancia;
    }

    public void setListaDistancia(List<Double> listaDistancia)
    {
        this.listaDistancia = listaDistancia;
    }
    
    /**
     *Calcula a distância entre o ponto e cada um dos Centroids e salva essas
     * distâncias em uma lista interna
     * @param lc
     */
    public void calculaDistancias(List<Centroid> lc)
    {
        int size = lc.size();
        listaDistancia.clear();
        for (int i = 0; i < size; i++)
        {
            listaDistancia.add(Math.sqrt(Math.pow((lc.get(i).getX() - x), 2) + Math.pow((lc.get(i).getY() - y), 2)));
        }
    }

    public Centroid centroidePertencente(List<Centroid> centroides)
    {
        Double menorDistancia = Collections.min(listaDistancia);
        int posicao_menor_Distancia = listaDistancia.indexOf(menorDistancia);
        return centroides.get(posicao_menor_Distancia);
    }
}
