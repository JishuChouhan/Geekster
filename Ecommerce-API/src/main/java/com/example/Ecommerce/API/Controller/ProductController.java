package com.example.Ecommerce.API.Controller;

import com.example.Ecommerce.API.Model.Product;
import com.example.Ecommerce.API.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("product")
    public String addProduct(@RequestBody Product newProduct){
        return productService.addProduct(newProduct);
    }

    @GetMapping("productByCategory")
    public List<Product> getProductByCategory(@RequestParam String category){
        return productService.getProductsByCategory(category);
    }

    @DeleteMapping("product")
    public String deleteProductById(@RequestParam Integer id){
        return productService.deleteProduct(id);
    }
}
