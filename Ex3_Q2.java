// Create a base class called `Shape` with an abstract method `calculateArea()`. Define
// subclasses like `Circle`, `Rectangle`, and `Triangle`, which inherit from the `Shape` class.
// Implement the `calculateArea()` method in each subclass to calculate the area of the respective
// shape. Demonstrate polymorphism by creating an array of `Shape` objects, including instances of
// each subclass, and calculate and display their areas.

abstract class Shape
{
    abstract void calculateArea(float r);
    abstract void calculateArea(float l,float b);
    abstract void calculateArea(double b,double h);
}

class AreaCalculation extends Shape
{
    void calculateArea(float r)
    {
        System.out.println("Area of Circle :"+(r*r*3.14));
    }

    void calculateArea(float l,float b)
    {
        System.out.println("Area of Rectangle :"+(l*b));
    }

    void calculateArea(double b,double h)
    {
        System.out.println("Area of Triangle :"+(0.5*b*h));
    }
}

class Ex3_Q2
{
    public static void main(String args[])
    {
        Shape obj[] = new Shape[3];

        obj[0] = new AreaCalculation();
        obj[0].calculateArea(2f);

        obj[1] = new AreaCalculation();
        obj[1].calculateArea(2f,3f);

        obj[2] = new AreaCalculation();
        obj[2].calculateArea(4d,5d);
    }
}