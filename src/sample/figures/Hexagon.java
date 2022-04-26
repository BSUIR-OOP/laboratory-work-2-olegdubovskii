package sample.figures;

import javafx.scene.canvas.GraphicsContext;

public class Hexagon extends Figure {

    public Hexagon(double x1, double x2, double y1, double y2) {
        super(x1, x2, y1, y2);
    }

    public Hexagon(GraphicsContext graphicsContext) {
        super(graphicsContext);
    }

    @Override
    public void print() {
        Drawing drawing = new Drawing(x1, y1, x2, y2, graphics);
        drawing.drawHexagon();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("⬟");
    }
}

