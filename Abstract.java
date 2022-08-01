abstract class Shape{
    abstract void numberOfSides();
}
class Rectangle extends Shape{
    void numberOfSides()
    {
        System.out.println("Number of sides of Rectangle is 4");
    }
}
class Triangle extends Shape{
    void numberOfSides()
    {
        System.out.println("Number of sides of Triangle is 3");
    }
}
class Hexogon extends Shape{
    void numberOfSides()
    {
        System.out.println("Number of sides of Hexagon is 6");
    }
}
public class Abstract {
    public static void main(String[] args){
        Shape s;
        s=new Rectangle();
        s.numberOfSides();
        s=new Triangle();
        s.numberOfSides();
        s=new Hexogon();
        s.numberOfSides();
    }
}
