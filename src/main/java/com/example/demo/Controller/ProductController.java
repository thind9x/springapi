/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Controller;

import com.example.demo.Model.Product;
import com.example.demo.Model.User;
import com.example.demo.Model.Video;
import com.example.demo.Services.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Admin
 */
@Controller
@RequestMapping(path="/demo")
public class ProductController {
    
    @Autowired
   private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path="/products")
    public @ResponseBody List<Product> getAllPro() {
        return productService.getAllProduct();
    }


//       @GetMapping(path="/products")
//    public @ResponseBody
//    List<Product> getAllProduct() {
//        return productService.getAllProduct();
//    }
//    
}
