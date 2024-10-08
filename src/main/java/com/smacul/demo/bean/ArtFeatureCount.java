package com.smacul.demo.bean;

import java.util.Date;

public class ArtFeatureCount {

    private Integer afcId;
    private Integer afcArtId;
    private Integer afcLikeNum;
    private Integer afcDislikeNum;

    private Integer afcComNum;
    private Integer afcRepNum;
    private Integer afcReadNum;
//    private Integer afcArtTime; // 报错Unsupported conversion from TIMESTAMP to java.lang.Integer
    private Date afcArtTime; // 使用Date类型来尝试 1.29

    public Integer getAfcId() {
        return afcId;
    }

    public void setAfcId(Integer afcId) {
        this.afcId = afcId;
    }

    public Integer getAfcArtId() {
        return afcArtId;
    }

    public void setAfcArtId(Integer afcArtId) {
        this.afcArtId = afcArtId;
    }

    public Integer getAfcLikeNum() {
        return afcLikeNum;
    }

    public void setAfcLikeNum(Integer afcLikeNum) {
        this.afcLikeNum = afcLikeNum;
    }

    public Integer getAfcDislikeNum() {
        return afcDislikeNum;
    }

    public void setAfcDislikeNum(Integer afcDislikeNum) {
        this.afcDislikeNum = afcDislikeNum;
    }

    public Integer getAfcComNum() {
        return afcComNum;
    }

    public void setAfcComNum(Integer afcComNum) {
        this.afcComNum = afcComNum;
    }

    public Integer getAfcRepNum() {
        return afcRepNum;
    }

    public void setAfcRepNum(Integer afcRepNum) {
        this.afcRepNum = afcRepNum;
    }

    public Integer getAfcReadNum() {
        return afcReadNum;
    }

    public void setAfcReadNum(Integer afcReadNum) {
        this.afcReadNum = afcReadNum;
    }

    public Date getAfcArtTime() {
        return afcArtTime;
    }

    public void setAfcArtTime(Date afcArtTime) {
        this.afcArtTime = afcArtTime;
    }
}
