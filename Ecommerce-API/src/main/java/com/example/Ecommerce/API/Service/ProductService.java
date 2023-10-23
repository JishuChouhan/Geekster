package com.example.Ecommerce.API.Service;

import com.example.Ecommerce.API.Model.Product;
import com.example.Ecommerce.API.Repository.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProduct iProduct;

    public String addProduct(Product newProduct){
        iProduct.save(newProduct);
        return "Product Added";
    }

    public List<Product> getProductsByCategory(String category){
        return iProduct.findByProdCategory(category);
    }

    public String deleteProduct(Integer id){
        iProduct.deleteById(id);
        return "Product Deleted";
    }
}
