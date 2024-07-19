/*
Define a MyRectangle class with four public data members representing the x- and y-coordinates of the bottom- left vertex and top-right vertex of a rectangle, whose sides are parallel to the x- or y-axis.
For example, the statement new MyRectangle (20, 80, 30, 90) creates a rectangle with bottom-left vertex at position (20, 80), and top-right vertex at (30, 90).
a. Write an area () method, which computes the area of a rectangle.
b. Write MySqaure.java, MySquare extends MyRectangle. A square is defined by its bottom-left vertex and the length of its side. Complete the super (. . .) statement in the constructor.
c. Below is output of MySquare.java program when the user enters: 10 30 5.

Class MySquare: [(10,30); (15,35)] 
Area = 25

Override toString () method in MyRectangle in order to get such output.

Sample IO:
----------
Enter bottom left and top right coordinates of the rectangle
20 80 30 90
Rectangle Area 100
Enter bottom left, top right and length of the square
10 30 5
Class MySquare: [(10, 30); (15, 35)]
Square Area: 25

*/
import java.util.*;
class MyRectangle 
{
    public int bottomLeftX;
    public int bottomLeftY;
    public int topRightX;
    public int topRightY;

    public MyRectangle(int x1, int y1, int x2, int y2) 
	{
        bottomLeftX = x1;
        bottomLeftY = y1;
        topRightX = x2;
        topRightY = y2;
    }

    public int area() 
	{
        int width = topRightX - bottomLeftX;
        int height = topRightY - bottomLeftY;
        return width * height;
    }
    public String toString()
	{
        return "[(" + bottomLeftX + ", " + bottomLeftY + "); (" +topRightX + ", " + topRightY + ")]";
    }
}

class MySquare extends MyRectangle 
{
    public MySquare(int x, int y, int sideLength) 
	{
        super(x, y, x + sideLength, y + sideLength);
    }    
}

class RectDemo
{
    public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter bottom left and top right coordinates of the rectangle");
		MyRectangle r1 = new MyRectangle(s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt());
		System.out.println("Rectangle Area "+r1.area());
        
		System.out.println("Enter bottom left, top right and length of the square");
		MySquare sq = new MySquare(s.nextInt(),s.nextInt(),s.nextInt());
		System.out.println("Class MySquare: "+sq);
		System.out.println("Square Area: " + sq.area());
    }
}
