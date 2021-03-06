package com.lawu.eshop.user.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class UserFreezeRecordDO implements Serializable {
    /**
     *
     * 主键
     * user_freeze_record.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 用户编号
     * user_freeze_record.user_num
     *
     * @mbg.generated
     */
    private String userNum;

    /**
     *
     * 用户账号
     * user_freeze_record.account
     *
     * @mbg.generated
     */
    private String account;

    /**
     *
     * 用户类型，1是会员，2是商家
     * user_freeze_record.user_type
     *
     * @mbg.generated
     */
    private Byte userType;

    /**
     *
     * 冻结原因
     * user_freeze_record.cause
     *
     * @mbg.generated
     */
    private String cause;

    /**
     *
     * 创建时间
     * user_freeze_record.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_freeze_record
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_freeze_record.id
     *
     * @return the value of user_freeze_record.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_freeze_record.id
     *
     * @param id the value for user_freeze_record.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_freeze_record.user_num
     *
     * @return the value of user_freeze_record.user_num
     *
     * @mbg.generated
     */
    public String getUserNum() {
        return userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_freeze_record.user_num
     *
     * @param userNum the value for user_freeze_record.user_num
     *
     * @mbg.generated
     */
    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_freeze_record.account
     *
     * @return the value of user_freeze_record.account
     *
     * @mbg.generated
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_freeze_record.account
     *
     * @param account the value for user_freeze_record.account
     *
     * @mbg.generated
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_freeze_record.user_type
     *
     * @return the value of user_freeze_record.user_type
     *
     * @mbg.generated
     */
    public Byte getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_freeze_record.user_type
     *
     * @param userType the value for user_freeze_record.user_type
     *
     * @mbg.generated
     */
    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_freeze_record.cause
     *
     * @return the value of user_freeze_record.cause
     *
     * @mbg.generated
     */
    public String getCause() {
        return cause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_freeze_record.cause
     *
     * @param cause the value for user_freeze_record.cause
     *
     * @mbg.generated
     */
    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_freeze_record.gmt_create
     *
     * @return the value of user_freeze_record.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_freeze_record.gmt_create
     *
     * @param gmtCreate the value for user_freeze_record.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}