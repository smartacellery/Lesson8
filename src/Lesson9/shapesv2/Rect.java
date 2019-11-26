package Lesson9.shapesv2;

import TurtleGraphics.Pen;
import java.awt.Color;

public class Rect extends Shape
{
    private double width, height;

    public Rect(double x, double y, double w, double h)
    {
        super(x, y);
        width = w;
        height = h;
    }
    
    public Rect() {
        super();
        width=10;
        height=10;
    }
    @Override
public void move(double xloc,double yloc){
      xPos = xloc;
        yPos = yloc;
    }
    @Override
    public double area()
    {
        return width * height;
    }
    @Override
    public double perimeter(){
        return 2*(width+height);
    }
    @Override
    public void draw(Pen p)
    {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(xPos + width, yPos);
        p.move(xPos + width, yPos - height);
        p.move(xPos, yPos - height);
        p.move(xPos, yPos);
    }

    @Override
    public void stretchBy(double factor)
    {
        width *= factor;
        height *= factor;
    }

    @Override
    public String toString()
    {
        String str = "Rectangle\n=========\n";
        str +="X-Y Position =" + xPos+","+ yPos;
        str += "\nWidth: " + width;
        str += "\nHeight: " + height;
        str += super.toString();
        return str;
    }
}
