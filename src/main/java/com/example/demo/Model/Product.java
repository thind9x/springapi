package com.example.demo.Model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
    
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "product")
@Table(name ="product")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class Product implements Serializable {
    
    
   private static final long serialVersionUID = 1L;
        
@GeneratedValue(strategy=GenerationType.IDENTITY)
     @Id  // Primary key.
    @Column(name="id",unique = true, nullable = false)
@Basic(fetch = FetchType.EAGER)
    private int id;
    private String title;
    private int userid;
    private String metaTitle;
    private String summary;
    private int type;
    private String sku;
    private float price;
    private float discount;
    private float quantity;
    private int shop;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Timestamp startAt;
    private Timestamp endAt;
    private String content;
    
    public Product(){
    }

    public Product(int id, String title, int userid, String metaTitle, String summary, int type, String sku,
            float price, float discount, float quantity, int shop, Timestamp createAt, Timestamp updateAt,
            Timestamp startAt, Timestamp endAt, String content) {
        this.id = id;
        this.title = title;
        this.userid = userid;
        this.metaTitle = metaTitle;
        this.summary = summary;
        this.type = type;
        this.sku = sku;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
        this.shop = shop;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.startAt = startAt;
        this.endAt = endAt;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public int getShop() {
        return shop;
    }

    public void setShop(int shop) {
        this.shop = shop;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public Timestamp getStartAt() {
        return startAt;
    }

    public void setStartAt(Timestamp startAt) {
        this.startAt = startAt;
    }

    public Timestamp getEndAt() {
        return endAt;
    }

    public void setEndAt(Timestamp endAt) {
        this.endAt = endAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}