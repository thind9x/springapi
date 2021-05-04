/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Services;

import com.example.demo.Model.User;
import com.example.demo.Respotivy.VideoRespontivy;
import com.example.demo.Model.Video;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Admin
 */
@Service
public class VideoServices {
    @Autowired
    @Lazy
    private VideoRespontivy videoRespontivy;
    
    public  List<Video> getAllVideo(){
    List<Video> lstvideo = new ArrayList<>();
    videoRespontivy.findAll().forEach(lstvideo::add);
    return lstvideo;
    }
//     public  List<Video> getAllVideobyUser(String userupload){
//    List<Video> lstvideo = new ArrayList<>();
//    videoRespontivy.findAll().forEach(lstvideo::add);
//    return lstvideo;
//    }
     
//    public Video storeFile(MultipartFile file){
//           String filename = StringUtils.cleanPath(file.getOriginalFilename());
//           
//           if(filename.contains("..")) {
//           }
//           Video dbFile = new Video();
//           return videoRespontivy.save(dbFile);
//    
//    
//    
//    }
    public List<Video> getByTitle(String title){
       if(!StringUtils.isEmpty(title)) {
            return videoRespontivy.findByTitle(title);
        }

        return videoRespontivy.findByTitle(title);
    
    }
    public Video getVideoID(int videoid){
            return videoRespontivy.getOne(videoid);
      
    }
     public List<Video> getVideoByUser(String userupload){

        if(!StringUtils.isEmpty(userupload)) {
            return videoRespontivy.findByuserupload(userupload);
        }

        return videoRespontivy.findAll();
    }
    
     
     public void addVideo(Video video){
         
        videoRespontivy.save(video);
    }
     public void upadVideo(int videoid, Video video){
         video.setVideoid(videoid);
         videoRespontivy.save(video);
     }
    
}
