package com.company.project.model;

import javax.persistence.*;

@Table(name = "r_maijia_fugaidu")
public class RMaijiaFugaidu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer dianpushu;

    private String categoryid;

    private String month;

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