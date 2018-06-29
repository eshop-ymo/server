package com.lawu.eshop.mall.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class SmsRecordDO implements Serializable {
    /**
     *
     * 主键
     * sms_record.id
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    private Long id;

    /**
     *
     * 手机号码
     * sms_record.mobile
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    private String mobile;

    /**
     *
     * 短信内容
     * sms_record.content
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    private String content;

    /**
     *
     * 地址
     * sms_record.ip
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    private String ip;

    /**
     *
     * 类型 1--注册，2--找回登录密码，2--找回支付密码
     * sms_record.type
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    private Byte type;

    /**
     *
     * 1成功，0失败
     * sms_record.is_success
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    private Boolean isSuccess;

    /**
     *
     * 失败原因
     * sms_record.fail_reason
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    private String failReason;

    /**
     *
     * 修改时间
     * sms_record.gmt_modified
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * sms_record.gmt_create
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sms_record
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_record.id
     *
     * @return the value of sms_record.id
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_record.id
     *
     * @param id the value for sms_record.id
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_record.mobile
     *
     * @return the value of sms_record.mobile
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_record.mobile
     *
     * @param mobile the value for sms_record.mobile
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_record.content
     *
     * @return the value of sms_record.content
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_record.content
     *
     * @param content the value for sms_record.content
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_record.ip
     *
     * @return the value of sms_record.ip
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_record.ip
     *
     * @param ip the value for sms_record.ip
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_record.type
     *
     * @return the value of sms_record.type
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_record.type
     *
     * @param type the value for sms_record.type
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_record.is_success
     *
     * @return the value of sms_record.is_success
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_record.is_success
     *
     * @param isSuccess the value for sms_record.is_success
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_record.fail_reason
     *
     * @return the value of sms_record.fail_reason
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_record.fail_reason
     *
     * @param failReason the value for sms_record.fail_reason
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_record.gmt_modified
     *
     * @return the value of sms_record.gmt_modified
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_record.gmt_modified
     *
     * @param gmtModified the value for sms_record.gmt_modified
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_record.gmt_create
     *
     * @return the value of sms_record.gmt_create
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_record.gmt_create
     *
     * @param gmtCreate the value for sms_record.gmt_create
     *
     * @mbg.generated 2017-03-28 12:37:17
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}