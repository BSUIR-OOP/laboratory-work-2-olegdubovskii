package sample.figures;

import javafx.scene.canvas.GraphicsContext;

public class Trapezium extends Figures {

    public Trapezium(double x1, double x2, double y1, double y2) {
        super(x1, x2, y1, y2);
    }

    public Trapezium() {

    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.beginPath();
        graphicsContext.moveTo(this.x1, this.y1);
        graphicsContext.lineTo(this.x2, this.y1);
        graphicsContext.lineTo(this.x2+(this.x2/2), this.y2);
        graphicsContext.lineTo(this.x1-(this.x1/2), this.y2);
        graphicsContext.lineTo(this.x1, this.y1);
        graphicsContext.closePath();
        graphicsContext.stroke();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("⏢");
    }
}

