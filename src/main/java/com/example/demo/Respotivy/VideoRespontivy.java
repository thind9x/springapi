/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Respotivy;

import com.example.demo.Model.Video;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public interface VideoRespontivy extends JpaRepository<Video, Integer>{
    List<Video> findByuserupload(@Param("userupload") String userupload);
    List<Video> findByTitle(@Param("title") String title);

    
}
