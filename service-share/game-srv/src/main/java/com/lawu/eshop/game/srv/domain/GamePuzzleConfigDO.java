package com.lawu.eshop.game.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class GamePuzzleConfigDO implements Serializable {
    /**
     *
     * 
     * game_puzzle_config.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 参入最大积分限制设置
     * game_puzzle_config.attend_max_point
     *
     * @mbg.generated
     */
    private Integer attendMaxPoint;

    /**
     *
     * 每次参与花费积分
     * game_puzzle_config.attend_point
     *
     * @mbg.generated
     */
    private Integer attendPoint;

    /**
     *
     * 每个房间最大可参入人数
     * game_puzzle_config.room_max_num
     *
     * @mbg.generated
     */
    private Integer roomMaxNum;

    /**
     *
     * 挑战成功分数
     * game_puzzle_config.success_score
     *
     * @mbg.generated
     */
    private Integer successScore;

    /**
     *
     * 
     * game_puzzle_config.free_count
     *
     * @mbg.generated
     */
    private Integer freeCount;

    /**
     *
     * 分享可免费次数
     * game_puzzle_config.share_attend_count
     *
     * @mbg.generated
     */
    private Integer shareAttendCount;

    /**
     *
     * 游戏倒计时
     * game_puzzle_config.count_down
     *
     * @mbg.generated
     */
    private Integer countDown;

    /**
     *
     * 拼图张数
     * game_puzzle_config.pic_count
     *
     * @mbg.generated
     */
    private Integer picCount;

    /**
     *
     * 挑战成功奖励积分
     * game_puzzle_config.award_point
     *
     * @mbg.generated
     */
    private Integer awardPoint;

    /**
     *
     * 挑战成功奖励星星
     * game_puzzle_config.award_star
     *
     * @mbg.generated
     */
    private Integer awardStar;

    /**
     *
     * 挑战失败扣除星星
     * game_puzzle_config.deduct_star
     *
     * @mbg.generated
     */
    private Integer deductStar;

    /**
     *
     * 倒计时对应评分{"list":[{"second":3,"score":200},{"second":5,"score":150},{"second":10,"score":100}]}
     * game_puzzle_config.sec_score
     *
     * @mbg.generated
     */
    private String secScore;

    /**
     *
     * 游戏状态  0-禁用  1-启用
     * game_puzzle_config.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * 禁用说明
     * game_puzzle_config.forbidden_remark
     *
     * @mbg.generated
     */
    private String forbiddenRemark;

    /**
     *
     * 机器人生效时间（秒）
     * game_puzzle_config.robot_effective_time
     *
     * @mbg.generated
     */
    private Integer robotEffectiveTime;

    /**
     *
     * 机器人状态  0-禁用  1-启用
     * game_puzzle_config.robot_status
     *
     * @mbg.generated
     */
    private Byte robotStatus;

    /**
     *
     * 更新时间
     * game_puzzle_config.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * game_puzzle_config.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table game_puzzle_config
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.id
     *
     * @return the value of game_puzzle_config.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.id
     *
     * @param id the value for game_puzzle_config.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.attend_max_point
     *
     * @return the value of game_puzzle_config.attend_max_point
     *
     * @mbg.generated
     */
    public Integer getAttendMaxPoint() {
        return attendMaxPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.attend_max_point
     *
     * @param attendMaxPoint the value for game_puzzle_config.attend_max_point
     *
     * @mbg.generated
     */
    public void setAttendMaxPoint(Integer attendMaxPoint) {
        this.attendMaxPoint = attendMaxPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.attend_point
     *
     * @return the value of game_puzzle_config.attend_point
     *
     * @mbg.generated
     */
    public Integer getAttendPoint() {
        return attendPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.attend_point
     *
     * @param attendPoint the value for game_puzzle_config.attend_point
     *
     * @mbg.generated
     */
    public void setAttendPoint(Integer attendPoint) {
        this.attendPoint = attendPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.room_max_num
     *
     * @return the value of game_puzzle_config.room_max_num
     *
     * @mbg.generated
     */
    public Integer getRoomMaxNum() {
        return roomMaxNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.room_max_num
     *
     * @param roomMaxNum the value for game_puzzle_config.room_max_num
     *
     * @mbg.generated
     */
    public void setRoomMaxNum(Integer roomMaxNum) {
        this.roomMaxNum = roomMaxNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.success_score
     *
     * @return the value of game_puzzle_config.success_score
     *
     * @mbg.generated
     */
    public Integer getSuccessScore() {
        return successScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.success_score
     *
     * @param successScore the value for game_puzzle_config.success_score
     *
     * @mbg.generated
     */
    public void setSuccessScore(Integer successScore) {
        this.successScore = successScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.free_count
     *
     * @return the value of game_puzzle_config.free_count
     *
     * @mbg.generated
     */
    public Integer getFreeCount() {
        return freeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.free_count
     *
     * @param freeCount the value for game_puzzle_config.free_count
     *
     * @mbg.generated
     */
    public void setFreeCount(Integer freeCount) {
        this.freeCount = freeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.share_attend_count
     *
     * @return the value of game_puzzle_config.share_attend_count
     *
     * @mbg.generated
     */
    public Integer getShareAttendCount() {
        return shareAttendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.share_attend_count
     *
     * @param shareAttendCount the value for game_puzzle_config.share_attend_count
     *
     * @mbg.generated
     */
    public void setShareAttendCount(Integer shareAttendCount) {
        this.shareAttendCount = shareAttendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.count_down
     *
     * @return the value of game_puzzle_config.count_down
     *
     * @mbg.generated
     */
    public Integer getCountDown() {
        return countDown;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.count_down
     *
     * @param countDown the value for game_puzzle_config.count_down
     *
     * @mbg.generated
     */
    public void setCountDown(Integer countDown) {
        this.countDown = countDown;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.pic_count
     *
     * @return the value of game_puzzle_config.pic_count
     *
     * @mbg.generated
     */
    public Integer getPicCount() {
        return picCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.pic_count
     *
     * @param picCount the value for game_puzzle_config.pic_count
     *
     * @mbg.generated
     */
    public void setPicCount(Integer picCount) {
        this.picCount = picCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.award_point
     *
     * @return the value of game_puzzle_config.award_point
     *
     * @mbg.generated
     */
    public Integer getAwardPoint() {
        return awardPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.award_point
     *
     * @param awardPoint the value for game_puzzle_config.award_point
     *
     * @mbg.generated
     */
    public void setAwardPoint(Integer awardPoint) {
        this.awardPoint = awardPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.award_star
     *
     * @return the value of game_puzzle_config.award_star
     *
     * @mbg.generated
     */
    public Integer getAwardStar() {
        return awardStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.award_star
     *
     * @param awardStar the value for game_puzzle_config.award_star
     *
     * @mbg.generated
     */
    public void setAwardStar(Integer awardStar) {
        this.awardStar = awardStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.deduct_star
     *
     * @return the value of game_puzzle_config.deduct_star
     *
     * @mbg.generated
     */
    public Integer getDeductStar() {
        return deductStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.deduct_star
     *
     * @param deductStar the value for game_puzzle_config.deduct_star
     *
     * @mbg.generated
     */
    public void setDeductStar(Integer deductStar) {
        this.deductStar = deductStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.sec_score
     *
     * @return the value of game_puzzle_config.sec_score
     *
     * @mbg.generated
     */
    public String getSecScore() {
        return secScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.sec_score
     *
     * @param secScore the value for game_puzzle_config.sec_score
     *
     * @mbg.generated
     */
    public void setSecScore(String secScore) {
        this.secScore = secScore == null ? null : secScore.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.status
     *
     * @return the value of game_puzzle_config.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.status
     *
     * @param status the value for game_puzzle_config.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.forbidden_remark
     *
     * @return the value of game_puzzle_config.forbidden_remark
     *
     * @mbg.generated
     */
    public String getForbiddenRemark() {
        return forbiddenRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.forbidden_remark
     *
     * @param forbiddenRemark the value for game_puzzle_config.forbidden_remark
     *
     * @mbg.generated
     */
    public void setForbiddenRemark(String forbiddenRemark) {
        this.forbiddenRemark = forbiddenRemark == null ? null : forbiddenRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.robot_effective_time
     *
     * @return the value of game_puzzle_config.robot_effective_time
     *
     * @mbg.generated
     */
    public Integer getRobotEffectiveTime() {
        return robotEffectiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.robot_effective_time
     *
     * @param robotEffectiveTime the value for game_puzzle_config.robot_effective_time
     *
     * @mbg.generated
     */
    public void setRobotEffectiveTime(Integer robotEffectiveTime) {
        this.robotEffectiveTime = robotEffectiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.robot_status
     *
     * @return the value of game_puzzle_config.robot_status
     *
     * @mbg.generated
     */
    public Byte getRobotStatus() {
        return robotStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.robot_status
     *
     * @param robotStatus the value for game_puzzle_config.robot_status
     *
     * @mbg.generated
     */
    public void setRobotStatus(Byte robotStatus) {
        this.robotStatus = robotStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.gmt_modified
     *
     * @return the value of game_puzzle_config.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.gmt_modified
     *
     * @param gmtModified the value for game_puzzle_config.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_config.gmt_create
     *
     * @return the value of game_puzzle_config.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_config.gmt_create
     *
     * @param gmtCreate the value for game_puzzle_config.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}