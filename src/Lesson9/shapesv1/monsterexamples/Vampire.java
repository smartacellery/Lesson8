package Lesson9.shapesv1.monsterexamples;

import Lesson9.shapesv1.Circle;
import Lesson9.shapesv1.Rect;
import Lesson9.shapesv1.Shape;
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;

public class Vampire implements Monster {

    private String name;

    public Vampire(String n) {
        name = n;
    }

    @Override
    public void attack() {
        System.out.println("I am biting your neck!");
    }

    @Override
    public String identify() {
        return ("I am " + name + " the Vampire!");
    }

}






 