package sample.figures;

import javafx.scene.canvas.GraphicsContext;

public class Ellipse extends Figures {

    public Ellipse(double x1, double x2, double y1, double y2) {
        super(x1, x2, y1, y2);
    }

    public Ellipse() {

    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.beginPath();
        graphicsContext.arc((this.x1 + this.x2) / 2.0D, (this.y1 + this.y2) / 2.0D, Math.abs(this.x2 - this.x1) / 2.0D, Math.abs(this.y2 - this.y1) / 2.0D, 0.0D, 360.0D);
        graphicsContext.closePath();
        graphicsContext.stroke();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("●");
    }

}

