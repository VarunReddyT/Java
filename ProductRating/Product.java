
public class Product {
    public int id;
    public String name;
    public String category;
    public double rating;
    Product(int id, String name,String category){
        this.id = id;
        this.name = name;
        this.category = category;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getCategory(){
        return category;
    }
    double getRating(){
        return rating;
    }
    void setRating(double rating){
        this.rating = rating;
    }
    void setName(String name){
        this.name = name;
    }
    void setCategory(String category){
        this.category = category;
    }

}
