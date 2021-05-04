/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Controller;

import com.example.demo.Model.Video;
import com.example.demo.Model.User;
import com.example.demo.Controller.UserController;
import com.example.demo.Respotivy.VideoRespontivy;
import com.example.demo.Services.VideoServices;
import java.util.List;
import java.util.Map;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import static org.springframework.http.ResponseEntity.status;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Admin
 */

@Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class VideoController {
    private  VideoRespontivy videoRespontivy;
    @Autowired
    VideoServices videoServices;
    public VideoController(VideoServices videoServices) {
        this.videoServices = videoServices;
    }
    
      private final Logger log = LoggerFactory.getLogger(VideoController.class);
      
       @GetMapping(path="/videos")
    public @ResponseBody List<Video> getAllVideo() {
        return videoServices.getAllVideo();
    }
//       @GetMapping(path="/videos{userupload}")
//    public @ResponseBody List<Video> getAllVideoUser(@PathVariable(name = "userupload") String userupload) {
//        return videoServices.getAllVideobyUser(userupload);
//    }
     @GetMapping(path = "/videos?id={videoid}")
    public Video getVideoid(@PathVariable(name = "videoid") Integer videoid) {
        return videoServices.getVideoID(videoid);
    }
     @GetMapping(path = "/videos?userupload={userupload}")
     public @ResponseBody List<Video> getAllVideobyUse(String userupload) {
        return videoServices.getVideoByUser(userupload);
    }
    
    
  @PostMapping(value ="/videos" )
      public void save(@RequestBody Video video) {
        videoServices.addVideo(video);
    }
      // PUT
    @PutMapping(value = "/videos/{videoid}")
    public void updateProduct(@PathVariable(name = "videoid") int videoid, @RequestBody Video video) {
        videoServices.upadVideo(videoid, video);
    } 
}
