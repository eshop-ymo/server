package com.lawu.eshop.property.srv.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TransactionDetailDO implements Serializable {
    /**
     *
     * 主键
     * transaction_detail.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 交易标题
     * transaction_detail.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * 交易编号
     * transaction_detail.transaction_num
     *
     * @mbg.generated
     */
    private String transactionNum;

    /**
     *
     * 用户编号
     * transaction_detail.user_num
     *
     * @mbg.generated
     */
    private String userNum;

    /**
     *
     * 交易类型(用户（1-余额充值2-广告3-扫红包4-退款5-下级收益6-买单7-付商品订单8-积分充值9-提现）商家（100-买单101-订单102-下级收益103-余额充值104-投放广告105-积分充值106-退款107-提现）)
     * transaction_detail.transaction_type
     *
     * @mbg.generated
     */
    private Byte transactionType;

    /**
     *
     * 第三方账户(如果是余额记账号，第三方记第三方账号)
     * transaction_detail.transaction_account
     *
     * @mbg.generated
     */
    private String transactionAccount;

    /**
     *
     * 支付方式(1-余额2-支付宝3微信)
     * transaction_detail.transaction_account_type
     *
     * @mbg.generated
     */
    private Byte transactionAccountType;

    /**
     *
     * 金额
     * transaction_detail.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     *
     * 操作前余额
     * transaction_detail.previous_amount
     *
     * @mbg.generated
     */
    private BigDecimal previousAmount;

    /**
     *
     * 1-支出2-收入
     * transaction_detail.direction
     *
     * @mbg.generated
     */
    private Byte direction;

    /**
     *
     * 第三方支付交易号
     * transaction_detail.third_transaction_num
     *
     * @mbg.generated
     */
    private String thirdTransactionNum;

    /**
     *
     * 业务类型操作对应的业务表ID
     * transaction_detail.biz_id
     *
     * @mbg.generated
     */
    private String bizId;

    /**
     *
     * 业务订单号
     * transaction_detail.biz_num
     *
     * @mbg.generated
     */
    private String bizNum;

    /**
     *
     * 交易说明
     * transaction_detail.transaction_desc
     *
     * @mbg.generated
     */
    private String transactionDesc;

    /**
     *
     * 省ID
     * transaction_detail.province_id
     *
     * @mbg.generated
     */
    private Integer provinceId;

    /**
     *
     * 市ID
     * transaction_detail.city_id
     *
     * @mbg.generated
     */
    private Integer cityId;

    /**
     *
     * 区ID
     * transaction_detail.area_id
     *
     * @mbg.generated
     */
    private Integer areaId;

    /**
     *
     * 备注
     * transaction_detail.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * 创建时间
     * transaction_detail.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table transaction_detail
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.id
     *
     * @return the value of transaction_detail.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.id
     *
     * @param id the value for transaction_detail.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.title
     *
     * @return the value of transaction_detail.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.title
     *
     * @param title the value for transaction_detail.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.transaction_num
     *
     * @return the value of transaction_detail.transaction_num
     *
     * @mbg.generated
     */
    public String getTransactionNum() {
        return transactionNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.transaction_num
     *
     * @param transactionNum the value for transaction_detail.transaction_num
     *
     * @mbg.generated
     */
    public void setTransactionNum(String transactionNum) {
        this.transactionNum = transactionNum == null ? null : transactionNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.user_num
     *
     * @return the value of transaction_detail.user_num
     *
     * @mbg.generated
     */
    public String getUserNum() {
        return userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.user_num
     *
     * @param userNum the value for transaction_detail.user_num
     *
     * @mbg.generated
     */
    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.transaction_type
     *
     * @return the value of transaction_detail.transaction_type
     *
     * @mbg.generated
     */
    public Byte getTransactionType() {
        return transactionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.transaction_type
     *
     * @param transactionType the value for transaction_detail.transaction_type
     *
     * @mbg.generated
     */
    public void setTransactionType(Byte transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.transaction_account
     *
     * @return the value of transaction_detail.transaction_account
     *
     * @mbg.generated
     */
    public String getTransactionAccount() {
        return transactionAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.transaction_account
     *
     * @param transactionAccount the value for transaction_detail.transaction_account
     *
     * @mbg.generated
     */
    public void setTransactionAccount(String transactionAccount) {
        this.transactionAccount = transactionAccount == null ? null : transactionAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.transaction_account_type
     *
     * @return the value of transaction_detail.transaction_account_type
     *
     * @mbg.generated
     */
    public Byte getTransactionAccountType() {
        return transactionAccountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.transaction_account_type
     *
     * @param transactionAccountType the value for transaction_detail.transaction_account_type
     *
     * @mbg.generated
     */
    public void setTransactionAccountType(Byte transactionAccountType) {
        this.transactionAccountType = transactionAccountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.amount
     *
     * @return the value of transaction_detail.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.amount
     *
     * @param amount the value for transaction_detail.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.previous_amount
     *
     * @return the value of transaction_detail.previous_amount
     *
     * @mbg.generated
     */
    public BigDecimal getPreviousAmount() {
        return previousAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.previous_amount
     *
     * @param previousAmount the value for transaction_detail.previous_amount
     *
     * @mbg.generated
     */
    public void setPreviousAmount(BigDecimal previousAmount) {
        this.previousAmount = previousAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.direction
     *
     * @return the value of transaction_detail.direction
     *
     * @mbg.generated
     */
    public Byte getDirection() {
        return direction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.direction
     *
     * @param direction the value for transaction_detail.direction
     *
     * @mbg.generated
     */
    public void setDirection(Byte direction) {
        this.direction = direction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.third_transaction_num
     *
     * @return the value of transaction_detail.third_transaction_num
     *
     * @mbg.generated
     */
    public String getThirdTransactionNum() {
        return thirdTransactionNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.third_transaction_num
     *
     * @param thirdTransactionNum the value for transaction_detail.third_transaction_num
     *
     * @mbg.generated
     */
    public void setThirdTransactionNum(String thirdTransactionNum) {
        this.thirdTransactionNum = thirdTransactionNum == null ? null : thirdTransactionNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.biz_id
     *
     * @return the value of transaction_detail.biz_id
     *
     * @mbg.generated
     */
    public String getBizId() {
        return bizId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.biz_id
     *
     * @param bizId the value for transaction_detail.biz_id
     *
     * @mbg.generated
     */
    public void setBizId(String bizId) {
        this.bizId = bizId == null ? null : bizId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.biz_num
     *
     * @return the value of transaction_detail.biz_num
     *
     * @mbg.generated
     */
    public String getBizNum() {
        return bizNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.biz_num
     *
     * @param bizNum the value for transaction_detail.biz_num
     *
     * @mbg.generated
     */
    public void setBizNum(String bizNum) {
        this.bizNum = bizNum == null ? null : bizNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.transaction_desc
     *
     * @return the value of transaction_detail.transaction_desc
     *
     * @mbg.generated
     */
    public String getTransactionDesc() {
        return transactionDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.transaction_desc
     *
     * @param transactionDesc the value for transaction_detail.transaction_desc
     *
     * @mbg.generated
     */
    public void setTransactionDesc(String transactionDesc) {
        this.transactionDesc = transactionDesc == null ? null : transactionDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.province_id
     *
     * @return the value of transaction_detail.province_id
     *
     * @mbg.generated
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.province_id
     *
     * @param provinceId the value for transaction_detail.province_id
     *
     * @mbg.generated
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.city_id
     *
     * @return the value of transaction_detail.city_id
     *
     * @mbg.generated
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.city_id
     *
     * @param cityId the value for transaction_detail.city_id
     *
     * @mbg.generated
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.area_id
     *
     * @return the value of transaction_detail.area_id
     *
     * @mbg.generated
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.area_id
     *
     * @param areaId the value for transaction_detail.area_id
     *
     * @mbg.generated
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.remark
     *
     * @return the value of transaction_detail.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.remark
     *
     * @param remark the value for transaction_detail.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column transaction_detail.gmt_create
     *
     * @return the value of transaction_detail.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column transaction_detail.gmt_create
     *
     * @param gmtCreate the value for transaction_detail.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}