package org.example.service;

import org.example.model.product.Product;
import org.example.model.user_account.UserAccount;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();

    public Product getProduct(long id);

    public void saveProduct(Product product);

    public void deleteProduct(long id);
}
