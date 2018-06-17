package com.company.project.model;

import javax.persistence.*;

@Table(name = "r_shuxing")
public class RShuxing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer xiaoshoue;

    private Double shichangfene;

    private Integer xiaoliang;

    private Integer saledproducts;

    private Double avgprice;

    private Double kedanjia;

    private Double discount;

    private Integer xiaofeirenshu;

    private String categoryid;

    private String month;

    private String shuxing;

    @Column(name = "shuxing_sub")
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
     * @return shichangfene
     */
    public Double getShichangfene() {
        return shichangfene;
    }

    /**
     * @param shichangfene
     */
    public void setShichangfene(Double shichangfene) {
        this.shichangfene = shichangfene;
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