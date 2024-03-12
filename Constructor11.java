class Pen{
    String color;
    int price;
    String type;
    Pen(){
        System.out.println("Constructor called");
    }
}

public class Constructor11 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
    }
}
