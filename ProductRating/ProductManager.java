
import java.util.List;
import java.util.ArrayList;

public class ProductManager{
    private List<Product> products = new ArrayList<>();
    
    void addProduct(Product product) {
        products.add(product);
    }
    void editProduct(int id, String name, String category) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(name);
                product.setCategory(category);
                break;
            }
        }
    }
    void deleteProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                break;
            }
        }
    }
    void modifyRating(int id, double rating) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setRating(rating);
                break;
            }
        }
    }
    List<Product> getAllProducts() {
        return products;
    }
    List<Product> getLowRatedProducts() {
        List<Product> lowRatedProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getRating() < 3.0) {
                lowRatedProducts.add(product);
            }
        }
        return lowRatedProducts;
    }

}
