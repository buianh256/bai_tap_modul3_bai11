package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> products;
    static{
        products = new HashMap<>();
        products.put(1, new Product(1,"thịt","thức ăn",102000,"deli"));
        products.put(2, new Product(2,"cá","thức ăn",80000,"cảng Hải Phòng"));
        products.put(3, new Product(3,"gà","thức ăn",70000,"trang trại Long Biên"));
        products.put(4, new Product(4,"sữa","đồ uống",15000,"TH true MILK"));
        products.put(5, new Product(5,"tivi","đồ gia dụng",10000000,"Nhà máy đường Láng"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getCodeId(), product);
    }

    @Override
    public Product findById(int codeId) {
        return products.get(codeId);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int codeId) {
        products.remove(codeId);
    }

    @Override
    public void search(String name) {
        products.get(name);
    }
}
