package com.company.project.model;

import javax.persistence.*;

@Table(name = "r_dapan")
public class RDapan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer shoptype;

    private Integer xiaoliang;

    private Integer xiaoshoue;

    private Integer saledproducts;

    private Integer activeshop;

    private Double avgprice;

    private Double discount;

    private Integer xiaofeirenshu;

    private Double kedanjia;

    private Integer activebrand;

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
     * @return activebrand
     */
    public Integer getActivebrand() {
        return activebrand;
    }

    /**
     * @param activebrand
     */
    public void setActivebrand(Integer activebrand) {
        this.activebrand = activebrand;
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