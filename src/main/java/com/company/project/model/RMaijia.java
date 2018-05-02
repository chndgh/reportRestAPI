package com.company.project.model;

import javax.persistence.*;

@Table(name = "r_maijia")
public class RMaijia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer xinji;

    private Integer zuanji;

    private Integer huangguan;

    private Integer jinhuangguan;

    private Integer tianmao;

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
     * @return xinji
     */
    public Integer getXinji() {
        return xinji;
    }

    /**
     * @param xinji
     */
    public void setXinji(Integer xinji) {
        this.xinji = xinji;
    }

    /**
     * @return zuanji
     */
    public Integer getZuanji() {
        return zuanji;
    }

    /**
     * @param zuanji
     */
    public void setZuanji(Integer zuanji) {
        this.zuanji = zuanji;
    }

    /**
     * @return huangguan
     */
    public Integer getHuangguan() {
        return huangguan;
    }

    /**
     * @param huangguan
     */
    public void setHuangguan(Integer huangguan) {
        this.huangguan = huangguan;
    }

    /**
     * @return jinhuangguan
     */
    public Integer getJinhuangguan() {
        return jinhuangguan;
    }

    /**
     * @param jinhuangguan
     */
    public void setJinhuangguan(Integer jinhuangguan) {
        this.jinhuangguan = jinhuangguan;
    }

    /**
     * @return tianmao
     */
    public Integer getTianmao() {
        return tianmao;
    }

    /**
     * @param tianmao
     */
    public void setTianmao(Integer tianmao) {
        this.tianmao = tianmao;
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