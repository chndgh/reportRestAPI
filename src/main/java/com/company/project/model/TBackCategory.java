package com.company.project.model;

import javax.persistence.*;

@Table(name = "t_back_category")
public class TBackCategory {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cateid;

    private String hangye;

    private String zihangye;

    private String buypinlei;

    private String shuxing1;

    private String shuxing2;

    private String shuxing3;

    private String shuxing4;

    private String shuxing5;

    private Double minprice;

    private Double pricerange;

    private Double maxprice;

    /**
     * @return Id
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
     * @return cateid
     */
    public String getCateid() {
        return cateid;
    }

    /**
     * @param cateid
     */
    public void setCateid(String cateid) {
        this.cateid = cateid;
    }

    /**
     * @return hangye
     */
    public String getHangye() {
        return hangye;
    }

    /**
     * @param hangye
     */
    public void setHangye(String hangye) {
        this.hangye = hangye;
    }

    /**
     * @return zihangye
     */
    public String getZihangye() {
        return zihangye;
    }

    /**
     * @param zihangye
     */
    public void setZihangye(String zihangye) {
        this.zihangye = zihangye;
    }

    /**
     * @return buypinlei
     */
    public String getBuypinlei() {
        return buypinlei;
    }

    /**
     * @param buypinlei
     */
    public void setBuypinlei(String buypinlei) {
        this.buypinlei = buypinlei;
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
     * @return minprice
     */
    public Double getMinprice() {
        return minprice;
    }

    /**
     * @param minprice
     */
    public void setMinprice(Double minprice) {
        this.minprice = minprice;
    }

    /**
     * @return pricerange
     */
    public Double getPricerange() {
        return pricerange;
    }

    /**
     * @param pricerange
     */
    public void setPricerange(Double pricerange) {
        this.pricerange = pricerange;
    }

    /**
     * @return maxprice
     */
    public Double getMaxprice() {
        return maxprice;
    }

    /**
     * @param maxprice
     */
    public void setMaxprice(Double maxprice) {
        this.maxprice = maxprice;
    }
}