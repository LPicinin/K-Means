/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.List;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.XYChart;

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
        int[] np = new int[2];//novo ponto
        boolean flag = true;
        Centroid aux;
        for (int i = 0; i < elementos.size(); i++)
        {
            elementos.get(i).calculaDistancias(centroides);//calcula distancia do elemento entre cada um dos centroids e salva em uma lista interna
            aux = elementos.get(i).centroidePertencente(centroides);
            aux.getCluster().add(elementos.get(i));//adiciona o elemento encontrado no cluster do centroid
                    
        }
        for (int i = 0; i < centroides.size(); i++)
        {
            np = centroides.get(i).calculaNovaCoordenada();
            if (flag)
            {
                flag = flag && (np[0] == centroides.get(i).getX() && np[1] == centroides.get(i).getY());
            }
            centroides.get(i).setX(np[0]);
            centroides.get(i).setY(np[1]);
        }
        return flag;
    }

    public void atualizaGrafico(BubbleChart<?, ?> bcKmeans)
    {
        XYChart.Series sCentroid = new XYChart.Series();
        XYChart.Series sElemento = new XYChart.Series();
        sCentroid.setName("Centroides");
        
        for (int i = 0; i < centroides.size(); i++)
        {
            sCentroid.getData().add(new XYChart.Data(centroides.get(i).getX(), centroides.get(i).getY(), 1));
            sElemento.setName(Integer.toString(i));
            for (int j = 0; j < centroides.get(i).getCluster().size(); j++)
            {
                sElemento.getData().add(new XYChart.Data(
                        centroides.get(i).getCluster().get(j).getX(), 
                        centroides.get(i).getCluster().get(j).getY(), 1));
            }
            bcKmeans.getData().add(sElemento);
            sElemento.getData().clear();
        }
        bcKmeans.getData().add(sCentroid);
    }
}
