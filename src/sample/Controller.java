package sample;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ChoiceBox;
import sample.figures.Figure;
import sample.figures.FigureFactory;

import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private ChoiceBox<String> figureBox;

    @FXML
    private Canvas windowCanvas;
    private FigureFactory figureFactory;

    private Figure figure;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        GraphicsContext graphicsContext = this.windowCanvas.getGraphicsContext2D();
        figureFactory = new FigureFactory(graphicsContext);
        for (Figure figure : figureFactory.figureDictionary) {
            figureBox.getItems().add(figure.getNameOfFigure());
        }
    }


    public void onMouseClicked(MouseEvent mouseEvent) {
    }

    public void onMousePressed(MouseEvent mouseEvent) {
        this.figure = figureFactory.getFigure((String)this.figureBox.getValue());
        this.figure.setX1(mouseEvent.getX());
        this.figure.setY1(mouseEvent.getY());
    }

    public void onMouseReleased(MouseEvent mouseEvent) {
        this.figure.setX2(mouseEvent.getX());
        this.figure.setY2(mouseEvent.getY());
        this.figure.print();
    }
}

