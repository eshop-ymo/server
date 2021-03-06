package com.lawu.eshop.game.srv.domain;

import java.io.Serializable;
import java.util.Date;

public class GamePuzzleDifficultyDO implements Serializable {
    /**
     *
     * 
     * game_puzzle_difficulty.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 难度系数  1-简单 2-一般 3-困难
     * game_puzzle_difficulty.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     *
     * 拼图系数3|4|5（3x3|4x4|5x5）
     * game_puzzle_difficulty.coefficient
     *
     * @mbg.generated
     */
    private Integer coefficient;

    /**
     *
     * 倒计时对应评分{"list":[{"second":3,"score":200},{"second":5,"score":150},{"second":10,"score":100}]}
     * game_puzzle_difficulty.sec_score
     *
     * @mbg.generated
     */
    private String secScore;

    /**
     *
     * 挑战时间
     * game_puzzle_difficulty.challenge_time
     *
     * @mbg.generated
     */
    private Integer challengeTime;

    /**
     *
     * 机器人答题时间（小）
     * game_puzzle_difficulty.robot_min_second
     *
     * @mbg.generated
     */
    private Integer robotMinSecond;

    /**
     *
     * 机器人答题时间（大）
     * game_puzzle_difficulty.robot_max_second
     *
     * @mbg.generated
     */
    private Integer robotMaxSecond;

    /**
     *
     * 更新时间
     * game_puzzle_difficulty.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * game_puzzle_difficulty.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table game_puzzle_difficulty
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_difficulty.id
     *
     * @return the value of game_puzzle_difficulty.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_difficulty.id
     *
     * @param id the value for game_puzzle_difficulty.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_difficulty.type
     *
     * @return the value of game_puzzle_difficulty.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_difficulty.type
     *
     * @param type the value for game_puzzle_difficulty.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_difficulty.coefficient
     *
     * @return the value of game_puzzle_difficulty.coefficient
     *
     * @mbg.generated
     */
    public Integer getCoefficient() {
        return coefficient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_difficulty.coefficient
     *
     * @param coefficient the value for game_puzzle_difficulty.coefficient
     *
     * @mbg.generated
     */
    public void setCoefficient(Integer coefficient) {
        this.coefficient = coefficient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_difficulty.sec_score
     *
     * @return the value of game_puzzle_difficulty.sec_score
     *
     * @mbg.generated
     */
    public String getSecScore() {
        return secScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_difficulty.sec_score
     *
     * @param secScore the value for game_puzzle_difficulty.sec_score
     *
     * @mbg.generated
     */
    public void setSecScore(String secScore) {
        this.secScore = secScore == null ? null : secScore.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_difficulty.challenge_time
     *
     * @return the value of game_puzzle_difficulty.challenge_time
     *
     * @mbg.generated
     */
    public Integer getChallengeTime() {
        return challengeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_difficulty.challenge_time
     *
     * @param challengeTime the value for game_puzzle_difficulty.challenge_time
     *
     * @mbg.generated
     */
    public void setChallengeTime(Integer challengeTime) {
        this.challengeTime = challengeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_difficulty.robot_min_second
     *
     * @return the value of game_puzzle_difficulty.robot_min_second
     *
     * @mbg.generated
     */
    public Integer getRobotMinSecond() {
        return robotMinSecond;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_difficulty.robot_min_second
     *
     * @param robotMinSecond the value for game_puzzle_difficulty.robot_min_second
     *
     * @mbg.generated
     */
    public void setRobotMinSecond(Integer robotMinSecond) {
        this.robotMinSecond = robotMinSecond;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_difficulty.robot_max_second
     *
     * @return the value of game_puzzle_difficulty.robot_max_second
     *
     * @mbg.generated
     */
    public Integer getRobotMaxSecond() {
        return robotMaxSecond;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_difficulty.robot_max_second
     *
     * @param robotMaxSecond the value for game_puzzle_difficulty.robot_max_second
     *
     * @mbg.generated
     */
    public void setRobotMaxSecond(Integer robotMaxSecond) {
        this.robotMaxSecond = robotMaxSecond;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_difficulty.gmt_modified
     *
     * @return the value of game_puzzle_difficulty.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_difficulty.gmt_modified
     *
     * @param gmtModified the value for game_puzzle_difficulty.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column game_puzzle_difficulty.gmt_create
     *
     * @return the value of game_puzzle_difficulty.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column game_puzzle_difficulty.gmt_create
     *
     * @param gmtCreate the value for game_puzzle_difficulty.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}