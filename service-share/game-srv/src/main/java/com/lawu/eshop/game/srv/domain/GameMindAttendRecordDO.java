package com.lawu.eshop.game.srv.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GameMindAttendRecordDO implements Serializable {
    /**
     *
     * 
     * game_mind_attend_record.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 参与用户编号
     * game_mind_attend_record.user_num
     *
     * @mbg.generated
     */
    private String userNum;

    /**
     *
     * 参与类型1单机、2随机对战、3好友对战多人
     * game_mind_attend_record.attend_type
     *
     * @mbg.generated
     */
    private Byte attendType;

    /**
     *
     * 参与编号(同一个房间编号相同)
     * game_mind_attend_record.attend_num
     *
     * @mbg.generated
     */
    private String attendNum;

    /**
     *
     * 房间号
     * game_mind_attend_record.room_num
     *
     * @mbg.generated
     */
    private String roomNum;

    /**
     *
     * 参与人数
     * game_mind_attend_record.attend_count
     *
     * @mbg.generated
     */
    private Integer attendCount;

    /**
     *
     * 参与扣除积分
     * game_mind_attend_record.attend_point
     *
     * @mbg.generated
     */
    private Integer attendPoint;

    /**
     *
     * 参与扣除星星
     * game_mind_attend_record.attend_star
     *
     * @mbg.generated
     */
    private Integer attendStar;

    /**
     *
     * 0-初始化 1-参与成功 2-参与失败 3-游戏成功 4-游戏失败
     * game_mind_attend_record.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * 答题用时单位秒
     * game_mind_attend_record.question_use_time
     *
     * @mbg.generated
     */
    private Integer questionUseTime;

    /**
     *
     * 游戏分数
     * game_mind_attend_record.game_score
     *
     * @mbg.generated
     */
    private Integer gameScore;

    /**
     *
     * 游戏名次
     * game_mind_attend_record.game_rank
     *
     * @mbg.generated
     */
    private Integer gameRank;

    /**
     *
     * 参与成功奖励积分
     * game_mind_attend_record.reward_point
     *
     * @mbg.generated
     */
    private BigDecimal rewardPoint;

    /**
     *
     * 参与成功奖励星星
     * game_mind_attend_record.reward_star
     *
     * @mbg.generated
     */
    private Integer rewardStar;

    /**
     *
     * 问题id集合逗号隔开
     * game_mind_attend_record.question_ids
     *
     * @mbg.generated
     */
    private String questionIds;

    /**
     *
     * 修改时间
     * game_mind_attend_record.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * game_mind_attend_record.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table game_mind_attend_record
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.id
     *
     * @return the value of game_mind_attend_record.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.id
     *
     * @param id the value for game_mind_attend_record.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.user_num
     *
     * @return the value of game_mind_attend_record.user_num
     *
     * @mbg.generated
     */
    public String getUserNum() {
        return userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.user_num
     *
     * @param userNum the value for game_mind_attend_record.user_num
     *
     * @mbg.generated
     */
    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.attend_type
     *
     * @return the value of game_mind_attend_record.attend_type
     *
     * @mbg.generated
     */
    public Byte getAttendType() {
        return attendType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.attend_type
     *
     * @param attendType the value for game_mind_attend_record.attend_type
     *
     * @mbg.generated
     */
    public void setAttendType(Byte attendType) {
        this.attendType = attendType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.attend_num
     *
     * @return the value of game_mind_attend_record.attend_num
     *
     * @mbg.generated
     */
    public String getAttendNum() {
        return attendNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.attend_num
     *
     * @param attendNum the value for game_mind_attend_record.attend_num
     *
     * @mbg.generated
     */
    public void setAttendNum(String attendNum) {
        this.attendNum = attendNum == null ? null : attendNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.room_num
     *
     * @return the value of game_mind_attend_record.room_num
     *
     * @mbg.generated
     */
    public String getRoomNum() {
        return roomNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.room_num
     *
     * @param roomNum the value for game_mind_attend_record.room_num
     *
     * @mbg.generated
     */
    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum == null ? null : roomNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.attend_count
     *
     * @return the value of game_mind_attend_record.attend_count
     *
     * @mbg.generated
     */
    public Integer getAttendCount() {
        return attendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.attend_count
     *
     * @param attendCount the value for game_mind_attend_record.attend_count
     *
     * @mbg.generated
     */
    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.attend_point
     *
     * @return the value of game_mind_attend_record.attend_point
     *
     * @mbg.generated
     */
    public Integer getAttendPoint() {
        return attendPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.attend_point
     *
     * @param attendPoint the value for game_mind_attend_record.attend_point
     *
     * @mbg.generated
     */
    public void setAttendPoint(Integer attendPoint) {
        this.attendPoint = attendPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.attend_star
     *
     * @return the value of game_mind_attend_record.attend_star
     *
     * @mbg.generated
     */
    public Integer getAttendStar() {
        return attendStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.attend_star
     *
     * @param attendStar the value for game_mind_attend_record.attend_star
     *
     * @mbg.generated
     */
    public void setAttendStar(Integer attendStar) {
        this.attendStar = attendStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.status
     *
     * @return the value of game_mind_attend_record.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.status
     *
     * @param status the value for game_mind_attend_record.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.question_use_time
     *
     * @return the value of game_mind_attend_record.question_use_time
     *
     * @mbg.generated
     */
    public Integer getQuestionUseTime() {
        return questionUseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.question_use_time
     *
     * @param questionUseTime the value for game_mind_attend_record.question_use_time
     *
     * @mbg.generated
     */
    public void setQuestionUseTime(Integer questionUseTime) {
        this.questionUseTime = questionUseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.game_score
     *
     * @return the value of game_mind_attend_record.game_score
     *
     * @mbg.generated
     */
    public Integer getGameScore() {
        return gameScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.game_score
     *
     * @param gameScore the value for game_mind_attend_record.game_score
     *
     * @mbg.generated
     */
    public void setGameScore(Integer gameScore) {
        this.gameScore = gameScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.game_rank
     *
     * @return the value of game_mind_attend_record.game_rank
     *
     * @mbg.generated
     */
    public Integer getGameRank() {
        return gameRank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.game_rank
     *
     * @param gameRank the value for game_mind_attend_record.game_rank
     *
     * @mbg.generated
     */
    public void setGameRank(Integer gameRank) {
        this.gameRank = gameRank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.reward_point
     *
     * @return the value of game_mind_attend_record.reward_point
     *
     * @mbg.generated
     */
    public BigDecimal getRewardPoint() {
        return rewardPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.reward_point
     *
     * @param rewardPoint the value for game_mind_attend_record.reward_point
     *
     * @mbg.generated
     */
    public void setRewardPoint(BigDecimal rewardPoint) {
        this.rewardPoint = rewardPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.reward_star
     *
     * @return the value of game_mind_attend_record.reward_star
     *
     * @mbg.generated
     */
    public Integer getRewardStar() {
        return rewardStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.reward_star
     *
     * @param rewardStar the value for game_mind_attend_record.reward_star
     *
     * @mbg.generated
     */
    public void setRewardStar(Integer rewardStar) {
        this.rewardStar = rewardStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.question_ids
     *
     * @return the value of game_mind_attend_record.question_ids
     *
     * @mbg.generated
     */
    public String getQuestionIds() {
        return questionIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.question_ids
     *
     * @param questionIds the value for game_mind_attend_record.question_ids
     *
     * @mbg.generated
     */
    public void setQuestionIds(String questionIds) {
        this.questionIds = questionIds == null ? null : questionIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.gmt_modified
     *
     * @return the value of game_mind_attend_record.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.gmt_modified
     *
     * @param gmtModified the value for game_mind_attend_record.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_mind_attend_record.gmt_create
     *
     * @return the value of game_mind_attend_record.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_mind_attend_record.gmt_create
     *
     * @param gmtCreate the value for game_mind_attend_record.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}