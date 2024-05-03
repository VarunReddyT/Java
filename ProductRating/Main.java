
import java.util.List;
public class Main {
    
    public static void main(String[] args) {
        // Create product manager
        ProductManager productManager = new ProductManager();

        // Add some initial products
        productManager.addProduct(new Product(1, "Laptop", "Electronics"));
        productManager.addProduct(new Product(2, "Smartphone", "Electronics"));
        productManager.addProduct(new Product(3, "Headphones", "Electronics"));
        
        // Manager modifies the rating of a product
        productManager.modifyRating(1, 4.5); // Set Laptop's rating to 4.5

        // User requests list of all products with their ratings
        List<Product> allProducts = productManager.getAllProducts();
        System.out.println("List of all products with their ratings:");
        
        for (Product product : allProducts) {
            System.out.println(product.getName() + " - " + product.getRating());
        }

        // Manager asks for products with low ratings
        List<Product> lowRatedProducts = productManager.getLowRatedProducts();
        System.out.println("\nList of products with low ratings:");
        for (Product product : lowRatedProducts) {
            System.out.println(product.getName() + " - " + product.getRating());
        }

        // Manager deletes a product
        productManager.deleteProduct(3); // Delete Headphones

        // User requests updated list of all products with their ratings
        allProducts = productManager.getAllProducts();
        System.out.println("\nUpdated list of all products with their ratings:");
        for (Product product : allProducts) {
            System.out.println(product.getName() + " - " + product.getRating());
        }
    }
}