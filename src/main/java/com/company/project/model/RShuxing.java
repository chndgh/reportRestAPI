package com.company.project.model;

import javax.persistence.*;

@Table(name = "r_shuxing")
public class RShuxing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer xiaoshoue;

    private Integer xiaoliang;

    private Integer saledproducts;

    private Integer avgprice;

    private Integer kedanjia;

    private Double discount;

    private Integer comentcount;

    private String categoryid;

    private String month;

    private String shuxing;

    private String shuxingSub;

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
     * @return kedanjia
     */
    public Integer getKedanjia() {
        return kedanjia;
    }

    /**
     * @param kedanjia
     */
    public void setKedanjia(Integer kedanjia) {
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
     * @return shuxing
     */
    public String getShuxing() {
        return shuxing;
    }

    /**
     * @param shuxing
     */
    public void setShuxing(String shuxing) {
        this.shuxing = shuxing;
    }

    /**
     * @return shuxing_sub
     */
    public String getShuxingSub() {
        return shuxingSub;
    }

    /**
     * @param shuxingSub
     */
    public void setShuxingSub(String shuxingSub) {
        this.shuxingSub = shuxingSub;
    }
}