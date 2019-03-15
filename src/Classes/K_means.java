/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.List;
import javafx.scene.chart.BubbleChart;

/**
 *
 * @author luis
 */
public class K_means
{
    private List<Centroid> centroides;
    private List<Elemento> elementos;

    public K_means(List<Centroid> centroides, List<Elemento> elementos)
    {
        this.centroides = centroides;
        this.elementos = elementos;
    }
    
    
    public boolean kmeans()
    {
        int []np = new int[2];//novo ponto
        boolean flag = true;
        for (int i = 0; i < elementos.size(); i++)
        {
            elementos.get(i).calculaDistancias(centroides);//calcula distancia do elemento entre cada um dos centroids e salva em uma lista interna
            elementos.get(i).centroidePertencente(centroides)
                    .getCluster().add(elementos.get(i));//adiciona o elemento encontrado no cluster do centroid
        }
        for (int i = 0; i < centroides.size(); i++)
        {
            np = centroides.get(i).calculaNovaCoordenada();
            if(flag)
                flag = flag &&(np[0] == centroides.get(i).getX() && np[1] == centroides.get(i).getY());
            centroides.get(i).setX(np[0]);
            centroides.get(i).setY(np[1]);
        }
        return flag;
    }

    public void atualizaGrafico(BubbleChart<?, ?> bcKmeans)
    {
        
    }
}
