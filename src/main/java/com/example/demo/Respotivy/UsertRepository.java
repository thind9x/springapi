/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Respotivy;

import com.example.demo.Model.Product;
import com.example.demo.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author Admin
 */
@Repository
public interface UsertRepository  extends JpaRepository<User, Integer> {
    List<User> findByusername(@Param("username") String username);

}
