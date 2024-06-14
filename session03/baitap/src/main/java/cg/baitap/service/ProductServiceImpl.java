package cg.baitap.service;

import cg.baitap.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements IProductService{
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"sp1",150,"là sp1","nx1"));
        products.put(2, new Product(2,"sp2",450,"là sp2","nx2"));
        products.put(3, new Product(3,"sp3",50,"là sp3","nx3"));
        products.put(4, new Product(4,"sp4",1650,"là sp4","nx4"));
        products.put(5, new Product(5,"sp5",50,"là sp5","nx5"));

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
