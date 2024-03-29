class Pen{
    String color;
    int price;
    String type;
    Pen(){
        System.out.println("Constructor called");
    }
    Pen(String color){
        this.color = color;
        System.out.println("Color of the pen is: "+color);
    }
}

public class Constructor11 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p2 = new Pen("Blue");
    }
}
