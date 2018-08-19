package org.jozif.mcplm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Commodity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.ID
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.COMMODITY_ID
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    private Integer commodityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.COMMODITY_NAME
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    private String commodityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.LOCATION
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    private String location;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.PRICE
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.UNIT
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.CATEGORY
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    private String category;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.BARCODE
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    private String barcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.CURRENCY
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    private String currency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.EXCHANGE_RATE
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    private Double exchangeRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.REMARK
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.GMT_REAL
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date gmtReal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.GMT_CREATE
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity.BROWSER_USER_AGENT
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    private String browserUserAgent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.ID
     *
     * @return the value of commodity.ID
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.ID
     *
     * @param id the value for commodity.ID
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.COMMODITY_ID
     *
     * @return the value of commodity.COMMODITY_ID
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.COMMODITY_ID
     *
     * @param commodityId the value for commodity.COMMODITY_ID
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.COMMODITY_NAME
     *
     * @return the value of commodity.COMMODITY_NAME
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.COMMODITY_NAME
     *
     * @param commodityName the value for commodity.COMMODITY_NAME
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.LOCATION
     *
     * @return the value of commodity.LOCATION
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.LOCATION
     *
     * @param location the value for commodity.LOCATION
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.PRICE
     *
     * @return the value of commodity.PRICE
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.PRICE
     *
     * @param price the value for commodity.PRICE
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.UNIT
     *
     * @return the value of commodity.UNIT
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.UNIT
     *
     * @param unit the value for commodity.UNIT
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.CATEGORY
     *
     * @return the value of commodity.CATEGORY
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.CATEGORY
     *
     * @param category the value for commodity.CATEGORY
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.BARCODE
     *
     * @return the value of commodity.BARCODE
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.BARCODE
     *
     * @param barcode the value for commodity.BARCODE
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.CURRENCY
     *
     * @return the value of commodity.CURRENCY
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.CURRENCY
     *
     * @param currency the value for commodity.CURRENCY
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.EXCHANGE_RATE
     *
     * @return the value of commodity.EXCHANGE_RATE
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.EXCHANGE_RATE
     *
     * @param exchangeRate the value for commodity.EXCHANGE_RATE
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.REMARK
     *
     * @return the value of commodity.REMARK
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.REMARK
     *
     * @param remark the value for commodity.REMARK
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.GMT_REAL
     *
     * @return the value of commodity.GMT_REAL
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public Date getGmtReal() {
        return gmtReal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.GMT_REAL
     *
     * @param gmtReal the value for commodity.GMT_REAL
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public void setGmtReal(Date gmtReal) {
        this.gmtReal = gmtReal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.GMT_CREATE
     *
     * @return the value of commodity.GMT_CREATE
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.GMT_CREATE
     *
     * @param gmtCreate the value for commodity.GMT_CREATE
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity.BROWSER_USER_AGENT
     *
     * @return the value of commodity.BROWSER_USER_AGENT
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public String getBrowserUserAgent() {
        return browserUserAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity.BROWSER_USER_AGENT
     *
     * @param browserUserAgent the value for commodity.BROWSER_USER_AGENT
     *
     * @mbggenerated Sun Aug 19 11:09:19 CST 2018
     */
    public void setBrowserUserAgent(String browserUserAgent) {
        this.browserUserAgent = browserUserAgent;
    }
}