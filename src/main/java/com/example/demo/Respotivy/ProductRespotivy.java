/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Respotivy;

import com.example.demo.Model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 *
 * @author Admin
 */
@Repository
public interface ProductRespotivy extends JpaRepository<Product, Integer>{


}
