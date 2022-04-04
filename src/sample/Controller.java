package sample;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ChoiceBox;
import sample.figures.Figures;
import sample.figures.FiguresFactory;

import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private ChoiceBox<String> figureBox;
    String[] figures = {"Ellipse", "Triangle", "Hexagon", "Trapezium", "Rhombus", "Rectangle"};
    @FXML
    private Canvas windowCanvas;

    private Figures figure;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        figureBox.getItems().addAll(figures);
        figureBox.setValue("Ellipse");
    }


    public void onMouseClicked(MouseEvent mouseEvent) {
    }

    public void onMousePressed(MouseEvent mouseEvent) {
        FiguresFactory figureFactory = new FiguresFactory();
        this.figure = figureFactory.getFigure((String)this.figureBox.getValue());
        this.figure.setX1(mouseEvent.getX());
        this.figure.setY1(mouseEvent.getY());
    }

    public void onMouseReleased(MouseEvent mouseEvent) {
        GraphicsContext gc = this.windowCanvas.getGraphicsContext2D();
        this.figure.setX2(mouseEvent.getX());
        this.figure.setY2(mouseEvent.getY());
        this.figure.draw(gc);
    }
}

