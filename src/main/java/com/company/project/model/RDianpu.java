package com.company.project.model;

import javax.persistence.*;

@Table(name = "r_dianpu")
public class RDianpu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer xiaoshoue;

    private Integer xiaoliang;

    private Integer saledproducts;

    private Integer avgprice;

    private Integer people;

    private Double pricedist;

    private String shopid;

    private String month;

    private String categoryid;

    private String location;

    private String shopname;

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
     * @return people
     */
    public Integer getPeople() {
        return people;
    }

    /**
     * @param people
     */
    public void setPeople(Integer people) {
        this.people = people;
    }

    /**
     * @return pricedist
     */
    public Double getPricedist() {
        return pricedist;
    }

    /**
     * @param pricedist
     */
    public void setPricedist(Double pricedist) {
        this.pricedist = pricedist;
    }

    /**
     * @return shopid
     */
    public String getShopid() {
        return shopid;
    }

    /**
     * @param shopid
     */
    public void setShopid(String shopid) {
        this.shopid = shopid;
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
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return shopname
     */
    public String getShopname() {
        return shopname;
    }

    /**
     * @param shopname
     */
    public void setShopname(String shopname) {
        this.shopname = shopname;
    }
}