/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans;

import Classes.Centroid;
import Classes.Elemento;
import Classes.K_means;
import Util.Util;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BubbleChart;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author luis
 */
public class FXMLPrincipalController implements Initializable
{
    private K_means kmeans;
    @FXML
    private BubbleChart<?, ?> bcKmeans;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        try
        {
            iniciaComponentes();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    private void evtKmeans(MouseEvent event)
    {
        boolean flag = false;
        while(!flag)
        {
            flag = kmeans.kmeans();
        }
        if(flag)
            new Alert(Alert.AlertType.INFORMATION, "K-Means Aplicado com Sucesso!!!", ButtonType.OK).showAndWait();
        if(!bcKmeans.getData().isEmpty())
            bcKmeans.getData().clear();//limpa o gráfico
        kmeans.atualizaGrafico(bcKmeans);
    }

    private void iniciaComponentes()
    {
        List<Centroid> lc = Util.getCentroides(3, 500, 500);
        List<Elemento> le = Util.getElemento(100, 500, 500);
        kmeans = new K_means(lc, le);
        kmeans.primeiraVez(bcKmeans);
    }

}
