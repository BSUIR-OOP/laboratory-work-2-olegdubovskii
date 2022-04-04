package sample.figures;

import javafx.scene.canvas.GraphicsContext;

public class Triangle extends Figures {

    public Triangle(double x1, double x2, double y1, double y2) {
        super(x1, x2, y1, y2);
    }

    public Triangle() {

    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.beginPath();
        graphicsContext.moveTo((this.x1 + this.x2) / 2.0D, this.y1);
        graphicsContext.lineTo(this.x1, this.y2);
        graphicsContext.lineTo(this.x2, this.y2);
        graphicsContext.closePath();
        graphicsContext.stroke();
    }

    @Override
    public void output(){
        super.output();
        System.out.println("▲");
    }
}
