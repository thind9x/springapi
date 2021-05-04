/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Services;

import com.example.demo.Model.Product;
import com.example.demo.Model.User;
import com.example.demo.Respotivy.ProductRespotivy;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 *
 * @author Admin
 */
@Service
public class ProductService {
    
    @Autowired
    @Lazy
  private ProductRespotivy productRespotivy;
 
   public  List<Product> getAllProduct(){
    List<Product> list = new ArrayList<>();
    productRespotivy.findAll().forEach(list::add);
    return list;
    }


   
   public Product getProductById(int id){
   
   return  productRespotivy.getOne(id);
   
   }
   // POST
    public void addUser(Product product){
       productRespotivy.save(product);
    }

}
