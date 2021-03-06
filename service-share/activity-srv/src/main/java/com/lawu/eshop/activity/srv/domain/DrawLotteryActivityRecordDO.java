package com.lawu.eshop.activity.srv.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DrawLotteryActivityRecordDO implements Serializable {
    /**
     *
     * 主键
     * draw_lottery_activity_record.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 用户id
     * draw_lottery_activity_record.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * 用户编号
     * draw_lottery_activity_record.user_num
     *
     * @mbg.generated
     */
    private String userNum;

    /**
     *
     * 用户账号
     * draw_lottery_activity_record.user_account
     *
     * @mbg.generated
     */
    private String userAccount;

    /**
     *
     * 抽奖活动id
     * draw_lottery_activity_record.draw_lottery_activity_id
     *
     * @mbg.generated
     */
    private Long drawLotteryActivityId;

    /**
     *
     * 奖品id
     * draw_lottery_activity_record.draw_lottery_activity_prize_id
     *
     * @mbg.generated
     */
    private Long drawLotteryActivityPrizeId;

    /**
     *
     * 奖品名称
     * draw_lottery_activity_record.prize_name
     *
     * @mbg.generated
     */
    private String prizeName;

    /**
     *
     * 物流单号
     * draw_lottery_activity_record.express_num
     *
     * @mbg.generated
     */
    private String expressNum;

    /**
     *
     * 0--待处理，1--已参与，2--未中奖，3--已中奖，4--放弃领奖，5--已领奖，6--积分扣除失败，7--奖品已发放
     * draw_lottery_activity_record.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * 途径0免费1兑换
     * draw_lottery_activity_record.channel
     *
     * @mbg.generated
     */
    private Byte channel;

    /**
     *
     * 兑换积分
     * draw_lottery_activity_record.pay_point
     *
     * @mbg.generated
     */
    private BigDecimal payPoint;

    /**
     *
     * 收货人姓名
     * draw_lottery_activity_record.consignee_name
     *
     * @mbg.generated
     */
    private String consigneeName;

    /**
     *
     * 收货人手机号
     * draw_lottery_activity_record.consignee_mobile
     *
     * @mbg.generated
     */
    private String consigneeMobile;

    /**
     *
     * 收货人地址
     * draw_lottery_activity_record.consignee_address
     *
     * @mbg.generated
     */
    private String consigneeAddress;

    /**
     *
     * 修改时间
     * draw_lottery_activity_record.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * draw_lottery_activity_record.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table draw_lottery_activity_record
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.id
     *
     * @return the value of draw_lottery_activity_record.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.id
     *
     * @param id the value for draw_lottery_activity_record.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.user_id
     *
     * @return the value of draw_lottery_activity_record.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.user_id
     *
     * @param userId the value for draw_lottery_activity_record.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.user_num
     *
     * @return the value of draw_lottery_activity_record.user_num
     *
     * @mbg.generated
     */
    public String getUserNum() {
        return userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.user_num
     *
     * @param userNum the value for draw_lottery_activity_record.user_num
     *
     * @mbg.generated
     */
    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.user_account
     *
     * @return the value of draw_lottery_activity_record.user_account
     *
     * @mbg.generated
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.user_account
     *
     * @param userAccount the value for draw_lottery_activity_record.user_account
     *
     * @mbg.generated
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.draw_lottery_activity_id
     *
     * @return the value of draw_lottery_activity_record.draw_lottery_activity_id
     *
     * @mbg.generated
     */
    public Long getDrawLotteryActivityId() {
        return drawLotteryActivityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.draw_lottery_activity_id
     *
     * @param drawLotteryActivityId the value for draw_lottery_activity_record.draw_lottery_activity_id
     *
     * @mbg.generated
     */
    public void setDrawLotteryActivityId(Long drawLotteryActivityId) {
        this.drawLotteryActivityId = drawLotteryActivityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.draw_lottery_activity_prize_id
     *
     * @return the value of draw_lottery_activity_record.draw_lottery_activity_prize_id
     *
     * @mbg.generated
     */
    public Long getDrawLotteryActivityPrizeId() {
        return drawLotteryActivityPrizeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.draw_lottery_activity_prize_id
     *
     * @param drawLotteryActivityPrizeId the value for draw_lottery_activity_record.draw_lottery_activity_prize_id
     *
     * @mbg.generated
     */
    public void setDrawLotteryActivityPrizeId(Long drawLotteryActivityPrizeId) {
        this.drawLotteryActivityPrizeId = drawLotteryActivityPrizeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.prize_name
     *
     * @return the value of draw_lottery_activity_record.prize_name
     *
     * @mbg.generated
     */
    public String getPrizeName() {
        return prizeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.prize_name
     *
     * @param prizeName the value for draw_lottery_activity_record.prize_name
     *
     * @mbg.generated
     */
    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName == null ? null : prizeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.express_num
     *
     * @return the value of draw_lottery_activity_record.express_num
     *
     * @mbg.generated
     */
    public String getExpressNum() {
        return expressNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.express_num
     *
     * @param expressNum the value for draw_lottery_activity_record.express_num
     *
     * @mbg.generated
     */
    public void setExpressNum(String expressNum) {
        this.expressNum = expressNum == null ? null : expressNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.status
     *
     * @return the value of draw_lottery_activity_record.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.status
     *
     * @param status the value for draw_lottery_activity_record.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.channel
     *
     * @return the value of draw_lottery_activity_record.channel
     *
     * @mbg.generated
     */
    public Byte getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.channel
     *
     * @param channel the value for draw_lottery_activity_record.channel
     *
     * @mbg.generated
     */
    public void setChannel(Byte channel) {
        this.channel = channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.pay_point
     *
     * @return the value of draw_lottery_activity_record.pay_point
     *
     * @mbg.generated
     */
    public BigDecimal getPayPoint() {
        return payPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.pay_point
     *
     * @param payPoint the value for draw_lottery_activity_record.pay_point
     *
     * @mbg.generated
     */
    public void setPayPoint(BigDecimal payPoint) {
        this.payPoint = payPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.consignee_name
     *
     * @return the value of draw_lottery_activity_record.consignee_name
     *
     * @mbg.generated
     */
    public String getConsigneeName() {
        return consigneeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.consignee_name
     *
     * @param consigneeName the value for draw_lottery_activity_record.consignee_name
     *
     * @mbg.generated
     */
    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName == null ? null : consigneeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.consignee_mobile
     *
     * @return the value of draw_lottery_activity_record.consignee_mobile
     *
     * @mbg.generated
     */
    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.consignee_mobile
     *
     * @param consigneeMobile the value for draw_lottery_activity_record.consignee_mobile
     *
     * @mbg.generated
     */
    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile == null ? null : consigneeMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.consignee_address
     *
     * @return the value of draw_lottery_activity_record.consignee_address
     *
     * @mbg.generated
     */
    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.consignee_address
     *
     * @param consigneeAddress the value for draw_lottery_activity_record.consignee_address
     *
     * @mbg.generated
     */
    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress == null ? null : consigneeAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.gmt_modified
     *
     * @return the value of draw_lottery_activity_record.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.gmt_modified
     *
     * @param gmtModified the value for draw_lottery_activity_record.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_lottery_activity_record.gmt_create
     *
     * @return the value of draw_lottery_activity_record.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_lottery_activity_record.gmt_create
     *
     * @param gmtCreate the value for draw_lottery_activity_record.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}