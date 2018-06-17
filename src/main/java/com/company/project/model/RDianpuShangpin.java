package com.company.project.model;

import javax.persistence.*;

@Table(name = "r_dianpu_shangpin")
public class RDianpuShangpin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer shoptype;

    private Integer price;

    private Integer xiaoshoue;

    private Integer xiaoliang;

    private Integer shoucangrenshu;

    private Integer xiaofeirenshu;

    private Integer leijipinglun;

    private String month;

    private String categoryid;

    private String goodsid;

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
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
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
     * @return shoucangrenshu
     */
    public Integer getShoucangrenshu() {
        return shoucangrenshu;
    }

    /**
     * @param shoucangrenshu
     */
    public void setShoucangrenshu(Integer shoucangrenshu) {
        this.shoucangrenshu = shoucangrenshu;
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
     * @return leijipinglun
     */
    public Integer getLeijipinglun() {
        return leijipinglun;
    }

    /**
     * @param leijipinglun
     */
    public void setLeijipinglun(Integer leijipinglun) {
        this.leijipinglun = leijipinglun;
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
     * @return goodsid
     */
    public String getGoodsid() {
        return goodsid;
    }

    /**
     * @param goodsid
     */
    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
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