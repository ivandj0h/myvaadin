package ivandjoh.online.myvaadin.backend.service;

import ivandjoh.online.myvaadin.backend.entity.Product;

import java.util.Collection;

public interface ProductService {
    public Collection<Product> findAll();
    public Product add(Product product);
    public Product update(Product product);
    public void delete(Product product);
}
