package com.company.project.model;

import javax.persistence.*;

@Table(name = "r_product")
public class RProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer shoptype;

    private Integer shoprate;

    private Integer salevolume;

    private Integer price;

    private Integer listprice;

    private String categoryid;

    private String month;

    private String shopid;

    @Column(name = "location_pro")
    private String locationPro;

    @Column(name = "location_city")
    private String locationCity;

    private String rate1;

    private String rate2;

    private String rate3;

    private String shuxing1;

    private String shuxing2;

    private String shuxing3;

    private String shuxing4;

    private String shuxing5;

    private String brand;

    private String comentcount;

    private String zhanggui;

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
     * @return shoprate
     */
    public Integer getShoprate() {
        return shoprate;
    }

    /**
     * @param shoprate
     */
    public void setShoprate(Integer shoprate) {
        this.shoprate = shoprate;
    }

    /**
     * @return salevolume
     */
    public Integer getSalevolume() {
        return salevolume;
    }

    /**
     * @param salevolume
     */
    public void setSalevolume(Integer salevolume) {
        this.salevolume = salevolume;
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
     * @return listprice
     */
    public Integer getListprice() {
        return listprice;
    }

    /**
     * @param listprice
     */
    public void setListprice(Integer listprice) {
        this.listprice = listprice;
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
     * @return location_pro
     */
    public String getLocationPro() {
        return locationPro;
    }

    /**
     * @param locationPro
     */
    public void setLocationPro(String locationPro) {
        this.locationPro = locationPro;
    }

    /**
     * @return location_city
     */
    public String getLocationCity() {
        return locationCity;
    }

    /**
     * @param locationCity
     */
    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    /**
     * @return rate1
     */
    public String getRate1() {
        return rate1;
    }

    /**
     * @param rate1
     */
    public void setRate1(String rate1) {
        this.rate1 = rate1;
    }

    /**
     * @return rate2
     */
    public String getRate2() {
        return rate2;
    }

    /**
     * @param rate2
     */
    public void setRate2(String rate2) {
        this.rate2 = rate2;
    }

    /**
     * @return rate3
     */
    public String getRate3() {
        return rate3;
    }

    /**
     * @param rate3
     */
    public void setRate3(String rate3) {
        this.rate3 = rate3;
    }

    /**
     * @return shuxing1
     */
    public String getShuxing1() {
        return shuxing1;
    }

    /**
     * @param shuxing1
     */
    public void setShuxing1(String shuxing1) {
        this.shuxing1 = shuxing1;
    }

    /**
     * @return shuxing2
     */
    public String getShuxing2() {
        return shuxing2;
    }

    /**
     * @param shuxing2
     */
    public void setShuxing2(String shuxing2) {
        this.shuxing2 = shuxing2;
    }

    /**
     * @return shuxing3
     */
    public String getShuxing3() {
        return shuxing3;
    }

    /**
     * @param shuxing3
     */
    public void setShuxing3(String shuxing3) {
        this.shuxing3 = shuxing3;
    }

    /**
     * @return shuxing4
     */
    public String getShuxing4() {
        return shuxing4;
    }

    /**
     * @param shuxing4
     */
    public void setShuxing4(String shuxing4) {
        this.shuxing4 = shuxing4;
    }

    /**
     * @return shuxing5
     */
    public String getShuxing5() {
        return shuxing5;
    }

    /**
     * @param shuxing5
     */
    public void setShuxing5(String shuxing5) {
        this.shuxing5 = shuxing5;
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
     * @return comentcount
     */
    public String getComentcount() {
        return comentcount;
    }

    /**
     * @param comentcount
     */
    public void setComentcount(String comentcount) {
        this.comentcount = comentcount;
    }

    /**
     * @return zhanggui
     */
    public String getZhanggui() {
        return zhanggui;
    }

    /**
     * @param zhanggui
     */
    public void setZhanggui(String zhanggui) {
        this.zhanggui = zhanggui;
    }
}