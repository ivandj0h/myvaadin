package ivandjoh.online.myvaadin.backend.service.impl;

import ivandjoh.online.myvaadin.backend.entity.Product;
import ivandjoh.online.myvaadin.backend.repository.ProductRepository;
import ivandjoh.online.myvaadin.backend.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService, CrudListener<Product> {

    private final ProductRepository productRepository;

    @Override
    public Collection<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product add(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }
}
