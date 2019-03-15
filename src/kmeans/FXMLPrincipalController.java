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
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BubbleChart;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author luis
 */
public class FXMLPrincipalController implements Initializable
{
    private K_means kmeans;
    @FXML
    private JFXRadioButton rbCentroid;
    @FXML
    private JFXRadioButton cbPonto;
    @FXML
    private JFXCheckBox chAleatorio;
    @FXML
    private BubbleChart<?, ?> bcKmeans;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        iniciaComponentes();
        /*XYChart.Series series = new XYChart.Series();
        series.setName("work");

        series.getData().add(new XYChart.Data(40, 50, 9));
        series.getData().add(new XYChart.Data(55, 60, 7));
        series.getData().add(new XYChart.Data(70, 70, 9));
        series.getData().add(new XYChart.Data(85, 80, 6));

        bcKmeans.getData().add(series);

        series = new XYChart.Series();
        series.setName("work2");

        series.getData().add(new XYChart.Data(10, 30, 0.5));
        series.getData().add(new XYChart.Data(25, 40, 0.5));
        
        bcKmeans.getData().add(series);*/
    }

    @FXML
    private void evtKmeans(MouseEvent event)
    {
        kmeans.atualizaGrafico(bcKmeans);
    }

    private void iniciaComponentes()
    {
        List<Centroid> lc = Util.getCentroides(3, (int)bcKmeans.getWidth(), (int)bcKmeans.getHeight());
        List<Elemento> le = Util.getElemento(10, (int)bcKmeans.getWidth(), (int)bcKmeans.getHeight());
        kmeans = new K_means(lc, le);
    }

}
