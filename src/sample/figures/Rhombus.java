package sample.figures;

import javafx.scene.canvas.GraphicsContext;

public class Rhombus extends Figure {

    public Rhombus(double x1, double x2, double y1, double y2) {
        super(x1, x2, y1, y2);
    }

    public Rhombus(GraphicsContext graphicsContext) {
        super(graphicsContext);
    }

    @Override
    public void print() {
        Drawing drawing = new Drawing(x1, y1, x2, y2, graphics);
        drawing.drawRhombus();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("★");
    }
}

