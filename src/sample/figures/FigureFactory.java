package sample.figures;

import javafx.scene.canvas.GraphicsContext;

public class FigureFactory {

    private GraphicsContext graphicsContext;

    public FigureFactory(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
    }
    public Figure getFigure(String figureName) {
        switch (figureName) {
            case ("Ellipse"): return new Ellipse(graphicsContext);
            case ("Triangle"): return new Triangle(graphicsContext);
            case ("Hexagon"): return new Hexagon(graphicsContext);
            case ("Trapezium"): return new Trapezium(graphicsContext);
            case ("Rhombus"): return new Rhombus(graphicsContext);
            case ("Rectangle"): return new Rectangle(graphicsContext);
            default: return new Ellipse(graphicsContext);
        }
    }
}
