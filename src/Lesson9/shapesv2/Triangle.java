
package Lesson9.shapesv2;

import Lesson9.shapesv2.Shape;
import TurtleGraphics.Pen;
import java.awt.Color;

public class Triangle extends Shape
{
    private double xsecond, ysecond,xthird,ythird;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        super(x1, y1);
        xsecond = x2;
        ysecond = y2;
        xthird=x3;
        ythird=y3;
    }
    
    public Triangle() {
        super();
        xsecond=25;
        ysecond= -25;
        xthird=50;
        ythird=0;
    }

    @Override
    public double perimeter()
    {
        return (Math.sqrt((xPos-xsecond)*(xPos-xsecond)+(yPos-ysecond)*(yPos-ysecond))+
                Math.sqrt((xthird-xsecond)*(xthird-xsecond)+(ythird-ysecond)*(ythird-ysecond))+
                Math.sqrt((xPos-xthird)*(xPos-xthird)+(yPos-ythird)*(yPos-ythird)));
    }
    @Override
    public double area(){
        return (Math.abs((xPos*ysecond-xsecond*yPos)+(xsecond*ythird-xthird*ysecond)+(xthird*yPos-xPos*ythird))/2);
                
    }
    @Override
    public void draw(Pen p)
    {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(xsecond, ysecond);
        p.move(xthird, ythird);
        p.move(xPos, yPos);
        
    }

    @Override
    public void stretchBy(double factor)
    {
        xsecond=(xsecond-xPos)*factor+xPos;
        ysecond=yPos
        +(ysecond-yPos)*factor;
        xthird=(xthird-xPos)*factor+xPos;
        ythird=yPos+(ythird-yPos)*factor;
    }
    @Override
    public void move(double xloc,double yloc){
        
        xsecond=xsecond+xloc-xPos;
        ysecond=ysecond+yloc-yPos;
        xthird=xthird+xloc-xPos;
        ythird=ythird+yloc-yPos;
        xPos=xloc;
        yPos=yloc;
    }
    @Override
    public String toString()
    {
        String str = "Triangle\n=========\n";
        str+="X1-Y1 Position =" + xPos+","+ yPos+"\n";
        str+="X2-Y2 Position =" + xsecond+","+ ysecond+"\n";
        str+="X3-Y3 Position =" + xthird+","+ ythird+"\n";
        
        str += super.toString();
        return str;
    }
}
