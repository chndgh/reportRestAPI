package com.company.project.model;

import javax.persistence.*;

@Table(name = "r_maijia_dianpufenbu")
public class RMaijiaDianpufenbu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer shoptype;

    private Integer dianpushu;

    private String categoryid;

    private String month;

    private String shoptypename;

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
     * @return dianpushu
     */
    public Integer getDianpushu() {
        return dianpushu;
    }

    /**
     * @param dianpushu
     */
    public void setDianpushu(Integer dianpushu) {
        this.dianpushu = dianpushu;
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
     * @return shoptypename
     */
    public String getShoptypename() {
        return shoptypename;
    }

    /**
     * @param shoptypename
     */
    public void setShoptypename(String shoptypename) {
        this.shoptypename = shoptypename;
    }
}