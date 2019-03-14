/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author luis
 */
public class FXMLPrincipalController implements Initializable
{

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
    }

}
