
import java.util.List;
import java.util.ArrayList;

public class ProductManager{
    private List<Product> products = new ArrayList<>();
    
    public void addProduct(Product product) {
        products.add(product);
    }
    public void editProduct(int id, String name, String category) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(name);
                product.setCategory(category);
                break;
            }
        }
    }
    public void deleteProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                break;
            }
        }
    }
    public void modifyRating(int id, double rating) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setRating(rating);
                break;
            }
        }
    }
    public List<Product> getAllProducts() {
        return products;
    }
    public List<Product> getLowRatedProducts() {
        List<Product> lowRatedProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getRating() < 3.0) {
                lowRatedProducts.add(product);
            }
        }
        return lowRatedProducts;
    }

}
