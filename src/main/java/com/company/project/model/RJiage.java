package com.company.project.model;

import javax.persistence.*;

@Table(name = "r_jiage")
public class RJiage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer shoptype;

    @Column(name = "start_price")
    private Integer startPrice;

    @Column(name = "end_price")
    private Integer endPrice;

    private Integer xiaoshoue;

    private Double xiaoshouehuanbi;

    private Integer xiaoliang;

    private Double xiaolianghuanbi;

    private Integer saledproducts;

    private Integer xiaofeirenshu;

    private String categoryid;

    private String month;

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
     * @return start_price
     */
    public Integer getStartPrice() {
        return startPrice;
    }

    /**
     * @param startPrice
     */
    public void setStartPrice(Integer startPrice) {
        this.startPrice = startPrice;
    }

    /**
     * @return end_price
     */
    public Integer getEndPrice() {
        return endPrice;
    }

    /**
     * @param endPrice
     */
    public void setEndPrice(Integer endPrice) {
        this.endPrice = endPrice;
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
     * @return xiaoshouehuanbi
     */
    public Double getXiaoshouehuanbi() {
        return xiaoshouehuanbi;
    }

    /**
     * @param xiaoshouehuanbi
     */
    public void setXiaoshouehuanbi(Double xiaoshouehuanbi) {
        this.xiaoshouehuanbi = xiaoshouehuanbi;
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
     * @return xiaolianghuanbi
     */
    public Double getXiaolianghuanbi() {
        return xiaolianghuanbi;
    }

    /**
     * @param xiaolianghuanbi
     */
    public void setXiaolianghuanbi(Double xiaolianghuanbi) {
        this.xiaolianghuanbi = xiaolianghuanbi;
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
}