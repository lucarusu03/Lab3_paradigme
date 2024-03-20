package ro.ulbs.paradigme.lab3;

import ro.ulbs.paradigme.lab3.forms.Circle;
import ro.ulbs.paradigme.lab3.forms.Square;
import ro.ulbs.paradigme.lab3.forms.Triangle;
import ro.ulbs.paradigme.lab3.util.PasswordMaker;

import static ro.ulbs.paradigme.lab3.forms.Form.getCounter;


public class Main {
    public static void main(String[] args) {
        Triangle tri = new Triangle(1.1F, 2.0F, "red");
        Circle c = new Circle(1.5F, "yellow");
        Square sq = new Square(1.2F, "blue");

        System.out.println("Area = " + tri.getArea()+" details: " + tri);
        System.out.println("Area = " + c.getArea() + " details: " + c);
        System.out.println("Area = " + sq.getArea() + " details: " + sq);

        Triangle tri2 = new Triangle(1.1F, 2.0F, "red");
        System.out.println("Triangle2 equals to Triangle1: " + tri.equals(tri2));

        Triangle tri3 = new Triangle(1.1F, 2.0F, "brown");
        System.out.println("Triangle3 equals to Triangle1: " + tri.equals(tri3));
        System.out.println("COUNTER: "+ getCounter() );

        PasswordMaker pm=new PasswordMaker("Luca");
        System.out.println(pm.getPassword());
    }
}
