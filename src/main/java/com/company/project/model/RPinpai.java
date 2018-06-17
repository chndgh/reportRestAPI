package com.company.project.model;

import javax.persistence.*;

@Table(name = "r_pinpai")
public class RPinpai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer shoptype;

    private Integer xiaoshoue;

    private Integer xiaoliang;

    private Integer activeshop;

    private Integer saledproducts;

    private Double avgprice;

    private Double kedanjia;

    private Double discount;

    private Integer xiaofeirenshu;

    private String month;

    private String categoryid;

    private String brand;

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
     * @return shoptype
     */
    public Integer getShoptype() {
        return shoptype;
    }

    /**
     * @param shoptype
     */
    public void setShoptype(Integer shoptype) {
        this.shoptype = shoptype;
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
     * @return avgprice
     */
    public Double getAvgprice() {
        return avgprice;
    }

    /**
     * @param avgprice
     */
    public void setAvgprice(Double avgprice) {
        this.avgprice = avgprice;
    }

    /**
     * @return kedanjia
     */
    public Double getKedanjia() {
        return kedanjia;
    }

    /**
     * @param kedanjia
     */
    public void setKedanjia(Double kedanjia) {
        this.kedanjia = kedanjia;
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
     * @return xiaofeirenshu
     */
    public Integer getXiaofeirenshu() {
        return xiaofeirenshu;
    }

    /**
     * @param xiaofeirenshu
     */
    public void setXiaofeirenshu(Integer xiaofeirenshu) {
        this.xiaofeirenshu = xiaofeirenshu;
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
}