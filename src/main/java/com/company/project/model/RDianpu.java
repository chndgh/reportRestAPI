package com.company.project.model;

import javax.persistence.*;

@Table(name = "r_dianpu")
public class RDianpu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer shoptype;

    private Integer xiaoshoue;

    private Integer xiaoliang;

    private Integer saledproducts;

    private Double kedanjia;

    private Double avgprice;

    private Integer xiaofeirenshu;

    private Double pricedist;

    private String month;

    private String categoryid;

    private String shopid;

    private String shopname;

    private String location;

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
}