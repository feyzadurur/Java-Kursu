package main.bootcamp_final;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Product {
    //final private int product_id;
    
    private int product_id;
    /*
    final static int CATEGORY_ID;
    final static String URL_PATH;
    
    
    static {
        CATEGORY_ID=12;
        URL_PATH="www.folksdev.com";
    }
*/
    
    public Product(int product_id) {
        this.product_id = product_id;
    }

    public int getProduct_id() {
        return product_id;
    }
    
    
    public static void main(String[] args) {
        //Product product=new Product(9); 
        
        /*
        final Product product=new Product(9);
        product.product_id=3;
        product.product_id=33;
*/
        
        final List<Product> product=Arrays.asList(new Product(23));
        
        
        /* HATA
        List<Product> a=Collections.unmodifiableList(product);
        
        a.set(0, new Product(33));
        */
         
        /* HATA
        final List<Product> products=List.of(new Product(23));
        products.set(0, new Product(2));
        */
        
         
    }
}
