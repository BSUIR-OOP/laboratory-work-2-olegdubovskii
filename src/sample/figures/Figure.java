package sample.figures;

import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;

public abstract class Figure {


    protected double x1;
    protected double x2;
    protected double y1;
    protected double y2;
    protected String nameOfFigure;
    protected GraphicsContext graphics;

    public Figure(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.nameOfFigure = getClass().getSimpleName();
    }

    public Figure(GraphicsContext graphicsContext) {
        this.graphics = graphicsContext;
        this.nameOfFigure = getClass().getSimpleName();
    }

    public abstract void print();

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public String getNameOfFigure() {
        return nameOfFigure;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void setNameOfFigure(String nameOfFigure) {
        this.nameOfFigure = nameOfFigure;
    }

    public void output(){
        System.out.print(getNameOfFigure() + "(" + getX1() + ", " + getY1() + ", " + getX2() + ", " + getY2() + ") ");
    };
}
