package sample.figures;

import javafx.scene.canvas.GraphicsContext;

public class Drawing {

    protected GraphicsContext graphicsContext;
    protected double x1, x2, y1, y2;


    public Drawing(double x1, double y1, double x2, double y2, GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void drawEllipse() {
        graphicsContext.beginPath();
        graphicsContext.arc((this.x1 + this.x2) / 2.0D, (this.y1 + this.y2) / 2.0D, Math.abs(this.x2 - this.x1) / 2.0D, Math.abs(this.y2 - this.y1) / 2.0D, 0.0D, 360.0D);
        graphicsContext.closePath();
        graphicsContext.stroke();
    }

    public void drawHexagon() {
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

    public void drawRectangle() {
        graphicsContext.beginPath();
        graphicsContext.moveTo(this.x1, this.y1);
        graphicsContext.lineTo(this.x1, this.y2);
        graphicsContext.lineTo(this.x2, this.y2);
        graphicsContext.lineTo(this.x2, this.y1);
        graphicsContext.closePath();
        graphicsContext.stroke();
    }

    public void drawRhombus() {
        graphicsContext.beginPath();
        graphicsContext.moveTo((this.x1 + this.x2) / 2.0D, this.y1);
        graphicsContext.lineTo(this.x1, (this.y1 + this.y2) / 2.0D);
        graphicsContext.lineTo((this.x1 + this.x2) / 2.0D, this.y2);
        graphicsContext.lineTo(this.x2, (this.y1 + this.y2) / 2.0D);
        graphicsContext.closePath();
        graphicsContext.stroke();
    }

    public void drawTrapezium() {
        graphicsContext.beginPath();
        graphicsContext.moveTo(this.x1, this.y1);
        graphicsContext.lineTo(this.x2, this.y1);
        graphicsContext.lineTo(this.x2+(this.x2/2), this.y2);
        graphicsContext.lineTo(this.x1-(this.x1/2), this.y2);
        graphicsContext.lineTo(this.x1, this.y1);
        graphicsContext.closePath();
        graphicsContext.stroke();
    }

    public void drawTriangle() {
        graphicsContext.beginPath();
        graphicsContext.moveTo((this.x1 + this.x2) / 2.0D, this.y1);
        graphicsContext.lineTo(this.x1, this.y2);
        graphicsContext.lineTo(this.x2, this.y2);
        graphicsContext.closePath();
        graphicsContext.stroke();
    }
}
