package com.service;

import com.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone 3", 1000, "Apple", "Good"));
        products.put(2, new Product(2, "Iphone 4", 2000, "Apple", "Good"));
        products.put(3, new Product(3, "Iphone 5", 3000, "Apple", "Good"));
        products.put(4, new Product(4, "Iphone 6", 40000, "Apple", "Bad"));
        products.put(5, new Product(5, "Iphone 7", 50000, "Apple", "Bad"));
        products.put(6, new Product(6, "Iphone 8", 60000, "Apple", "Good"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

}
