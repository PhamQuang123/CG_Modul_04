package cg.baitap.service;

import cg.baitap.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductServiceImpl implements IProductService{
    private List<Product> products;
    public ProductServiceImpl(){
        products = new ArrayList<>();
        products.add(new Product(1,"sp1",250,"đây là sp1","nx1"));
        products.add(new Product(2,"sp2",50,"đây là sp2","nx2"));
        products.add(new Product(3,"sp3",1000,"đây là sp3","nx3"));
        products.add(new Product(4,"sp4",150,"đây là sp4","nx4"));
        products.add(new Product(5,"sp5",450,"đây là sp5","nx5"));
    }
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public boolean save(Product product) {
products.add(product);
        return true;
    }

    @Override
    public boolean update(Product product) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Product p: products
        ) {
            if (p.getName().equals(name)){
                productList.add(p);
            }
        }
        return productList;
    }

    @Override
    public Product findById(int id) {
        for (Product p: products
             ) {
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }
}
