abstract class Shape{
    abstract void RectangleArea(int l,int b);
    abstract void SquareArea(int s);
    abstract void CircleArea(int r);
}

class Area extends Shape{

    void RectangleArea(int l, int b) {
        System.out.println("The area of the rectangle ="+(l*b));
    }

    void SquareArea(int s) {
        System.out.println("The area of the Square="+(s*s));
    }

    void CircleArea(int r) {
        System.out.println("The area of the circle="+(3.14*r*r));
    }
}

class Main{
    public static void main(String[] args) {
        Shape shapeObj = new Area();
        shapeObj.RectangleArea(12,4);
        shapeObj.CircleArea(10);
        shapeObj.SquareArea(29);
    }
}