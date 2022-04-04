package sample.figures;

import javafx.scene.canvas.GraphicsContext;

public class Hexagon extends Figures {

    public Hexagon(double x1, double x2, double y1, double y2) {
        super(x1, x2, y1, y2);
    }

    public Hexagon() {

    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.beginPath();
        graphicsContext.moveTo((this.x1 + this.x2) / 2.0D, this.y1);
        graphicsContext.lineTo(this.x2, this.y1 + Math.abs(this.y1 - this.y2) / 3.0D);
        graphicsContext.lineTo(this.x2, this.y2 + Math.abs(this.y1 - this.y2) / 3.0D);
        graphicsContext.lineTo((this.x1 + this.x2) / 2.0D, this.y2);
        graphicsContext.lineTo(this.x1, this.y2 - Math.abs(this.y1 - this.y2) / 3.0D);
        graphicsContext.lineTo(this.x1, this.y1 + Math.abs(this.y1 - this.y2) / 3.0D);
        graphicsContext.closePath();
        graphicsContext.stroke();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("⬟");
    }
}

