package sample.figures;

import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;

public class FigureFactory {

    public ArrayList<Figure> figureDictionary;

    public FigureFactory(GraphicsContext graphicsContext) {
        figureDictionary = new ArrayList<>();
        figureDictionary.add(new Ellipse(graphicsContext));
        figureDictionary.add(new Triangle(graphicsContext));
        figureDictionary.add(new Hexagon(graphicsContext));
        figureDictionary.add(new Trapezium(graphicsContext));
        figureDictionary.add(new Rhombus(graphicsContext));
        figureDictionary.add(new Rectangle(graphicsContext));
    }
    public Figure getFigure(String figureName) {
        switch (figureName) {
            case ("Ellipse"): return figureDictionary.get(0);
            case ("Triangle"): return figureDictionary.get(1);
            case ("Hexagon"): return figureDictionary.get(2);
            case ("Trapezium"): return figureDictionary.get(3);
            case ("Rhombus"): return figureDictionary.get(4);
            case ("Rectangle"): return figureDictionary.get(5);
            default: return figureDictionary.get(0);
        }
    }
}
