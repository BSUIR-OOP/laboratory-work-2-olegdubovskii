package sample.figures;

public class FiguresFactory {

    public FiguresFactory() {

    }
    public Figures getFigure(String figureName) {
        switch (figureName) {
            case ("Ellipse"): return new Ellipse();
            case ("Triangle"): return new Triangle();
            case ("Hexagon"): return new Hexagon();
            case ("Trapezium"): return new Trapezium();
            case ("Rhombus"): return new Rhombus();
            case ("Rectangle"): return new Rectangle();
            default: return new Ellipse();
        }
    }


}
