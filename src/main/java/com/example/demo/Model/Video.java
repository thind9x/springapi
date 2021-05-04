/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Admin
 */

@Entity(name = "video")
@Table(name = "video")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Video  implements Serializable{
        private static final long serialVersionUID = 1L;
        
@GeneratedValue(strategy=GenerationType.IDENTITY)
     @Id  // Primary key.
    @Column(name="videoid",unique = true, nullable = false)
@Basic(fetch = FetchType.EAGER)

    private int videoid;
    private String title;
    private String description;
    private  String userupload;
    private Timestamp  dateupload;
    private String status;
    private String thumbnail;
    private  String videofile;

   

    public Video() {
    }

    public Video(int videoid, String title, String description, String userupload, Timestamp dateupload, String status, String thumbnail, String videofile) {
        this.videoid = videoid;
        this.title = title;
        this.description = description;
        this.userupload = userupload;
        this.dateupload = dateupload;
        this.status = status;
        this.thumbnail = thumbnail;
        this.videofile = videofile;
    }

    public int getVideoid() {
        return videoid;
    }

    public void setVideoid(int videoid) {
        this.videoid = videoid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserupload() {
        return userupload;
    }

    public void setUserupload(String userupload) {
        this.userupload = userupload;
    }

    public Timestamp getDateupload() {
        return dateupload;
    }

    public void setDateupload(Timestamp dateupload) {
        this.dateupload = dateupload;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getVideofile() {
        return videofile;
    }

    public void setVideofile(String videofile) {
        this.videofile = videofile;
    }
    
    
  

    
    
    
    
}
