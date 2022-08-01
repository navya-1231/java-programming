import java.util.Scanner;

public class Shape {
    public float area(float radius){
        return (float)(3.14*radius*radius);
    }
    public float area(float length,float breath){
        return (float)(length*breath);
    }
    public float area(int base,int height){
        return (float)(0.5*base*height);
    }
    public static void main(String[] args){
        System.out.println("Area of Shapes:");
        System.out.println("Choice:\n1.Circle\n2.Rectangle\n3.Triangle");
        Scanner input = new Scanner(System.in);

        Shape s=new Shape();
        System.out.println("Enter your choice:");

        int choice=input.nextInt();
        if(choice==1){
        System.out.println("Enter the radius : ");
        float radius=input.nextFloat();
        float areaCircle=s.area(radius);
        System.out.println("Area of Circle: "+areaCircle);
        }

        else if(choice==2){
        System.out.println("Enter the length : ");
        float length=input.nextFloat();
        System.out.println("Enter the breadth : ");
        float breadth=input.nextFloat();
        float areaRectangle=s.area(length,breadth);
        System.out.println("Area of Rectangle: "+areaRectangle);
        }

        else if(choice==3){
        System.out.println("Enter the base : ");
        int base=input.nextInt();
        System.out.println("Enter the height : ");
        int height=input.nextInt();
        float areaTriangle=s.area(base,height);
        System.out.println("Area of Triangle: "+areaTriangle);
        }
        else{
            System.out.println("ERROR !!");
        }
        input.close();
    }    
}
