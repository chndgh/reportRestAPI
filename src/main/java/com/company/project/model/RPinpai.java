package com.company.project.model;

import javax.persistence.*;

@Table(name = "r_pinpai")
public class RPinpai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer xiaoshoue;

    private Integer xiaoliang;

    private Integer activeshop;

    private Integer saledproducts;

    private Integer avglistprice;

    private Integer avgprice;

    private Double discount;

    private Integer comentcount;

    private String brand;

    private String month;

    private String categoryid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return xiaoshoue
     */
    public Integer getXiaoshoue() {
        return xiaoshoue;
    }

    /**
     * @param xiaoshoue
     */
    public void setXiaoshoue(Integer xiaoshoue) {
        this.xiaoshoue = xiaoshoue;
    }

    /**
     * @return xiaoliang
     */
    public Integer getXiaoliang() {
        return xiaoliang;
    }

    /**
     * @param xiaoliang
     */
    public void setXiaoliang(Integer xiaoliang) {
        this.xiaoliang = xiaoliang;
    }

    /**
     * @return activeshop
     */
    public Integer getActiveshop() {
        return activeshop;
    }

    /**
     * @param activeshop
     */
    public void setActiveshop(Integer activeshop) {
        this.activeshop = activeshop;
    }

    /**
     * @return saledproducts
     */
    public Integer getSaledproducts() {
        return saledproducts;
    }

    /**
     * @param saledproducts
     */
    public void setSaledproducts(Integer saledproducts) {
        this.saledproducts = saledproducts;
    }

    /**
     * @return avglistprice
     */
    public Integer getAvglistprice() {
        return avglistprice;
    }

    /**
     * @param avglistprice
     */
    public void setAvglistprice(Integer avglistprice) {
        this.avglistprice = avglistprice;
    }

    /**
     * @return avgprice
     */
    public Integer getAvgprice() {
        return avgprice;
    }

    /**
     * @param avgprice
     */
    public void setAvgprice(Integer avgprice) {
        this.avgprice = avgprice;
    }

    /**
     * @return discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * @return comentcount
     */
    public Integer getComentcount() {
        return comentcount;
    }

    /**
     * @param comentcount
     */
    public void setComentcount(Integer comentcount) {
        this.comentcount = comentcount;
    }

    /**
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * @return categoryid
     */
    public String getCategoryid() {
        return categoryid;
    }

    /**
     * @param categoryid
     */
    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }
}