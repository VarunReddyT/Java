class Pen{
    String color;
    int price;
    String type;
    public void write(){
        System.out.println("Writing...");
    }
    public void cost(int price){
        this.price = price;
        System.out.println("Cost of the pen is: "+price);
    }
    public void type(String type){
        this.type = type;
        System.out.println("Type of the pen is: "+type);
    }
    public void color(String color){
        this.color = color;
        System.out.println("Color of the pen is: "+color);
    }
}
public class Oops10 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.write();
        p1.cost(30);
        p1.type("Gel");
        p1.color("Blue");
    }
}
