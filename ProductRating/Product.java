
public class Product {
    private int id;
    private String name;
    private String category;
    private double rating;
    Product(int id, String name,String category){
        this.id = id;
        this.name = name;
        this.category = category;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public double getRating(){
        return rating;
    }
    public void setRating(double rating){
        this.rating = rating;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCategory(String category){
        this.category = category;
    }

}
